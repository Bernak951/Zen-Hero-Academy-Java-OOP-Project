
public class Ranged extends Role{

	private String quality;
	private int quantity;
	
	public Ranged(String name, int age, String gender, String type, String iD, String quality, int quantity) {
		super(name, age, gender, type, iD);
		this.quality = quality;
		this.quantity = quantity;
	}
	
	public String getQuality() {
		return quality;
	}
	public void setQuality(String quality) {
		this.quality = quality;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	public void detail() {
		System.out.println("Class: " + getType());
		System.out.println("ID: " + getID());
		System.out.println("Name: " + getName());
		System.out.println("Age: " + getAge());
		System.out.println("Gender: " + getGender());
		System.out.println("Sword Length: -" );
		System.out.println("Shield Weight: -");
		System.out.println("Bow quality: " + getQuality());
		System.out.println("Arrow Quantity: " +getQuantity());
	}

}
