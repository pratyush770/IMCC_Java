package pkgInheritance;

public class Animal {
	private int age = 20;  // private variable named age
	private String gender = "Male";  // private variable named gender
 	private double weight = 75;  // private variable named weight
	
	public Animal() {  // constructor creation
		System.out.println("This is non parameterized constructor of Animal class");	
	}
	
	public Animal(int ag, float wt, String gn) {  // parameterized constructor creation
		System.out.println("Parameterized constructor");	
		this.age = ag;
		this.weight = wt;
		this.gender = gn;
	}
	
	public int getAge() {  // getter method
		return age;
	}

	public void setAge(int age) {  // setter method
		this.age = age;
	}

	public String getGender() {  // getter method
		return gender;
	}

	public void setGender(String gender) {  // setter method
		this.gender = gender;
	}

	public double getWeight() {  // getter method
		return weight;
	}

	public void setWeight(double weight) {  // setter method
		this.weight = weight;
	}
	
	public void eat() {  // eat method
		System.out.println("Eat class");
	}
	
	public void sleep() {  // sleep method
		System.out.println("Sleep class");
	}
	
	public void details() {  // details method
		System.out.println("Age is: " + this.age);
		System.out.println("Gender is: " + this.gender);
		System.out.println("Weight is: " + this.weight);
	}
}
