import java.util.*;

public class Main {

	ArrayList<Role> RoleList = new ArrayList<Role>();
	Scanner scan = new Scanner(System.in);
	Random rand = new Random();
	int choice;
	int index;
	int indexupdate;

	String name;
	int age;
	String gender;
	String type;
	String ID;

	int shieldweight;
	int swordlength;

	String quality;
	int quantity;

	public Main() {
		do {
			menu();
			choice = scan.nextInt();
			scan.nextLine();
			switch (choice) {
			case 1:
				add();
				break;
			case 2:
				view();
				break;
			case 3:
				delete();
				break;
			case 4:
				update();
				break;

			default:
				break;
			}
		} while (choice != 5);
		System.out.println("Thanks for using this application");
		System.exit(0);
	}

	public void menu() {
		System.out.println("ZeN Hero Academy");
		System.out.println("1. Add hero");
		System.out.println("2. View Hero");
		System.out.println("3. Remove Hero");
		System.out.println("4. Update Hero");
		System.out.println("5. Exit");
		System.out.println("Choice: ");
	}

	public void add() {
		do {
			System.out.println("Enter Name [Name Length >= 5]: ");
			name = scan.nextLine();
		} while (name.length() < 5);

		do {
			System.out.println("Enter age [>= 18]: ");
			age = scan.nextInt();
			scan.nextLine();
		} while (age < 18);

		do {
			System.out.println("Input Gender [Male | Female]: ");
			gender = scan.nextLine();
		} while (!(gender.equals("Male") || gender.equals("Female")));
		
		do {
			System.out.println("Enter Type [Melee | Ranged]: ");
			type = scan.nextLine();
		} while (!(type.equals("Melee") || type.equals("Ranged")));

		if (type.equals("Melee")) {
			do {
				System.out.println("Enter sword length [must be greater than 0]: ");
				swordlength = scan.nextInt();
				scan.nextLine();
			} while (swordlength < 1);

			do {
				System.out.println("Enter shield weight [must be greater than 0]: ");
				shieldweight = scan.nextInt();
				scan.nextLine();
			} while (shieldweight < 1);

			ID = "ML" + rand.nextInt(9) + rand.nextInt(9) + rand.nextInt(9);

			Melee melee = new Melee(name, age, gender, type, ID, shieldweight, swordlength);
			RoleList.add(melee);

			System.out.println("Hero Successfull Added");
			System.out.println("Press enter to continue");
			scan.nextLine();

		} else {
			do {
				System.out.println("Enter bow quality [Bad | Normal | Good]: ");
				quality = scan.nextLine();
			} while (!(quality.equals("Bad") || quality.equals("Normal") || quality.equals("Good")));

			do {
				System.out.println("Enter arrow quantity [Must be greater than 0]: ");
				quantity = scan.nextInt();
				scan.nextLine();
			} while (quantity < 1);

			ID = "RG" + rand.nextInt(9) + rand.nextInt(9) + rand.nextInt(9);

			Ranged ranged = new Ranged(name, age, gender, type, ID, quality, quantity);
			RoleList.add(ranged);

			System.out.println("Hero Successfull Added");
			System.out.println("Press enter to continue");
			scan.nextLine();
		}
	}

	public void view() {
		if (RoleList.isEmpty()) {
			System.out.println("There are no heroes");
			System.out.println("Press enter to continue");
			scan.nextLine();
		} else {
			for (int i = 0; i < RoleList.size(); i++) {
				System.out.print("No. ");
				System.out.println(i + 1 + ". ");
				RoleList.get(i).detail();
				System.out.println(" ");
			}
		}
	}

	public void delete() {
		if (RoleList.isEmpty()) {
			System.out.println("There are no heroes to be deleted");
			System.out.println("Press enter to continue");
			scan.nextLine();
		} else {
			view();

			do {
				System.out.println("Input index to be deleted 1-" + RoleList.size() + " [0] For cancel");
				index = scan.nextInt();
				scan.nextLine();
				if (index == 0) {
					return;
				}
			} while (index < 1 || index > RoleList.size());

			RoleList.remove(index - 1);
		}
	}


public void update() {
		if (RoleList.isEmpty()) {
			System.out.println("There are no heroes to be updated");
			System.out.println("Press enter to continue");
			scan.nextLine();
		} else {
			view();
			do {
				System.out.println("Input index to be updated 1-" + RoleList.size() + " [0] For cancel");
				indexupdate = scan.nextInt();
				scan.nextLine();
				if (indexupdate == 0) {
					return;
				}
			} while (indexupdate < 1 || indexupdate > RoleList.size());

			if (RoleList.get(indexupdate - 1).type.equals("Melee")) {
				System.out.println("the hero will turn into a ranged hero");

				do {
					System.out.println("Enter bow quality [Bad | Normal | Good]: ");
					quality = scan.nextLine();
				} while (!(quality.equals("Bad") || quality.equals("Normal") || quality.equals("Good")));

				do {
					System.out.println("Enter arrow quantity [Must be greater than 0]: ");
					quantity = scan.nextInt();
					scan.nextLine();
				} while (quantity < 1);

				ID = "RG" + rand.nextInt(9) + rand.nextInt(9) + rand.nextInt(9);

				Ranged ranged = new Ranged(name, age, gender, "Ranged", ID, quality, quantity);
				RoleList.set(indexupdate - 1, ranged);

				System.out.println("Press enter to continue");
				scan.nextLine();

			} else {
				System.out.println("the hero will turn into a melee hero");

				do {
					System.out.println("Enter sword length [must be greater than 0]: ");
					swordlength = scan.nextInt();
					scan.nextLine();
				} while (swordlength < 1);

				do {
					System.out.println("Enter shield weight [must be greater than 0]: ");
					shieldweight = scan.nextInt();
					scan.nextLine();
				} while (shieldweight < 1);

				ID = "ML" + rand.nextInt(9) + rand.nextInt(9) + rand.nextInt(9);
				
				Melee melee = new Melee(name, age, gender, "Melee", ID, shieldweight, swordlength);
				RoleList.set(indexupdate - 1, melee);
				
				System.out.println("Press enter to continue");
				scan.nextLine();
			}
		}
	}

	public static void main(String[] args) {
		new Main();

	}

}
