package pkgOrgStructure;  // name of package

public class Developer extends Employee{  // IS-A hierarchy
//	private String position;  // instance variables
//
//    public Developer(String name, int id, String position) {  // parameterized constructor
//        super(name, id);  // calling variables from super class
//        this.position = position;
//    }
//
//	public void details() {
//		System.out.println("The developer details are as follows...");  // display developer details
//        System.out.println("Developer name is: " + name);
//        System.out.println("Developer id is: " + id);
//        System.out.println("Developer position is: " + this.position);
//	}
	
private String nameOfTheTeam, nameOfManager, technologies;  // instance variables
	
	public Developer(int id, String name, int age, String panCard, int aadharCard, String dept, int sal, String cno, int exp, String tname, String mname, String tech) {
		super(id, name, age, panCard, aadharCard, dept, sal, cno, exp);
		this.nameOfTheTeam = this.setNameOfTheTeam(tname);  // set variables using setter methods
		this.nameOfManager = this.setNameOfManager(mname);
		this.technologies = this.setTechnologies(tech);
	}

	public String getNameOfTheTeam() {  // getter methods
		return nameOfTheTeam;
	}

	public String setNameOfTheTeam(String nameOfTheTeam) {  // setter methods
		return this.nameOfTheTeam = nameOfTheTeam;
	}

	public String getNameOfManager() {
		return nameOfManager;
	}

	public String setNameOfManager(String nameOfManager) {
		return this.nameOfManager = nameOfManager;
	}

	public String getTechnologies() {
		return technologies;
	}

	public String setTechnologies(String technologies) {
		return this.technologies = technologies;
	}
	
	public void details() {  // display details
		super.details();
		System.out.println("The name of the team is: " + this.getNameOfTheTeam());
		System.out.println("The name of the manager is: " + this.getNameOfManager());
		System.out.println("The technologies used are: " + this.getTechnologies());
	}
	
	public void computeSalary() {  // compute developer salary
        int sal = getEmpSal() * 6;
        setEmpSal(sal);
        System.out.println("The developers's computed salary is: " + getEmpSal());
    }
}
