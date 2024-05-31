
public abstract class Role {

	protected String name;
	protected int age;
	protected String gender;
	protected String type;
	protected String ID;
	
	public Role(String name, int age, String gender, String type, String iD) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.type = type;
		ID = iD;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getID() {
		return ID;
	}
	public void setID(String iD) {
		ID = iD;
	}

	public void detail() {
		System.out.println("Class: " + getType());
		System.out.println("ID: " + getID());
		System.out.println("Name: " + getName());
		System.out.println("Age: " + getAge());
		System.out.println("Gender: " + getGender());
	}
	
	
}
