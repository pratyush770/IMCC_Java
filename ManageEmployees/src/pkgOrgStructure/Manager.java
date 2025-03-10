package pkgOrgStructure;  // name of package

public class Manager extends Employee{  // IS-A hierarchy
//	private int budget;  // instance variables
//
//	public Manager(String name, int id, int budget) {  // parameterized constructor
//    	super(name, id);  // calling variables from super class
//    	this.budget = budget;
//    }
//	
//	public void details() {
//		System.out.println("The manager details are as follows...");  // display manager details
//		System.out.println("Manager name is: " + name);
//        System.out.println("Manager id is: " + id);
//        System.out.println("The budget is: " + this.budget);
//	}
	
	private int noOfTeams, noOfReportees;  // instance variables
	
	public Manager(int id, String name, int age, String panCard, int aadharCard, String dept, int sal, String cno, int exp, int team, int reportees) {
		super(id, name, age, panCard, aadharCard, dept, sal, cno, exp);
		this.noOfTeams = this.setNoOfTeams(team);  // set variables using setter methods
		this.noOfReportees = this.setNoOfReportees(reportees);
	}

	public int getNoOfTeams() {  // getter methods
		return noOfTeams;
	}

	public int setNoOfTeams(int noOfTeams) {  // setter methods
		return this.noOfTeams = noOfTeams;
	}

	public int getNoOfReportees() {
		return noOfReportees;
	}

	public int setNoOfReportees(int noOfReportees) {
		return this.noOfReportees = noOfReportees;
	}	
	
	public void details() {  // display details
		super.details();
		System.out.println("The number of teams are: " + this.getNoOfTeams());
		System.out.println("The reportees of teams are: " + this.getNoOfReportees());
	}
	
	public void computeSalary() {  // compute manager salary
        int sal = getEmpSal() * 8;
        setEmpSal(sal);
        System.out.println("The manager's computed salary is: " + getEmpSal());
    }
}
