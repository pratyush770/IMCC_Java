package pkgOrgStructure;  // name of package

public class Tester extends Employee{  // IS-A hierarchy
//    private int numTestCases;  // instance variables
//
//    public Tester(String name, int id, int numTestCases) {  // parameterized constructor
//        super(name, id);  // calling variables from super class
//        this.numTestCases = numTestCases;
//    }
//
//	public void details() {
//	  System.out.println("The tester details are as follows...");  // display tester details
//      System.out.println("Tester name is: " + name);
//      System.out.println("Tester id is: " + id);
//      System.out.println("The number of testcases handled by the tester are: " + this.numTestCases);
//	}
	
	private String nameOfTheTeam, nameOfManager, testingType;  // instance variables
	
	public Tester(int id, String name, int age, String panCard, int aadharCard, String dept, int sal, String cno, int exp, String tname, String mname, String type) {
		super(id, name, age, panCard, aadharCard, dept, sal, cno, exp);
		this.nameOfTheTeam = this.setNameOfTheTeam(tname);  // set variables using setter methods
		this.nameOfManager = this.setNameOfManager(mname);
		this.testingType = this.setTestingType(type);
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

	public String getTestingType() {
		return testingType;
	}

	public String setTestingType(String testingType) {
		return this.testingType = testingType;
	}
	
	public void details() {  // display details
		super.details();
		System.out.println("The name of the team is: " + this.getNameOfTheTeam());
		System.out.println("The name of the manager is: " + this.getNameOfManager());
		System.out.println("The type of testing is: " + this.getTestingType());
	}
	
	public void computeSalary() {  // compute tester salary
        int sal = getEmpSal() * 5;
        setEmpSal(sal);
        System.out.println("The tester's computed salary is: " + getEmpSal());
    }
}