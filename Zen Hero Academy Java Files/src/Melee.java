
public class Melee extends Role{

	private int shieldweight;
	private int swordlength;
	
	public Melee(String name, int age, String gender, String type, String iD, int shieldweight, int swordlength) {
		super(name, age, gender, type, iD);
		this.shieldweight = shieldweight;
		this.swordlength = swordlength;
	}
	
	public int getShieldweight() {
		return shieldweight;
	}
	public void setShieldweight(int shieldweight) {
		this.shieldweight = shieldweight;
	}
	public int getSwordlength() {
		return swordlength;
	}
	public void setSwordlength(int swordlength) {
		this.swordlength = swordlength;
	}

	public void detail() {
		System.out.println("Class: " + getType());
		System.out.println("ID: " + getID());
		System.out.println("Name: " + getName());
		System.out.println("Age: " + getAge());
		System.out.println("Gender: " + getGender());
		System.out.println("Sword Length: " +getSwordlength());
		System.out.println("Shield Weight: "+getShieldweight());
		System.out.println("Bow quality: -");
		System.out.println("Arrow Quantity: -");
	}
	
}
