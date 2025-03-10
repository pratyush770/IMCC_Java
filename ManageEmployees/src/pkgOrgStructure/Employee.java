package pkgOrgStructure;  // name of package

public class Employee {
//	public String name;  // instance variables
//	public int id;
//	
//	public Employee(String name, int id) {  // parameterized constructor
//		this.name = name;
//	    this.id = id;
//	}
		
	private int empId, empAge, empAadharCrd, empSal, empExp;  // instance variables
	private String empNm, empPanCrd, empDept, empContactNbr;
		
	public Employee(int id, String name, int age, String panCard, int aadharCard, String dept, int sal, String cno, int exp) {
		this.empId = this.setEmpId(id);  // set variables using setter methods
		this.empNm = this.setEmpNm(name);
		this.empAge = this.setEmpAge(age);
		this.empPanCrd = this.setEmpPanCrd(panCard);
		this.empAadharCrd = this.setEmpAadharCrd(aadharCard);
		this.empDept = this.setEmpDept(dept);
		this.empSal = this.setEmpSal(sal);
		this.empContactNbr = this.setEmpContactNbr(cno);
		this.empExp = this.setEmpExp(exp);
	}
		
	public int getEmpId() {  // getter methods
		return empId;
	}
		
	public int setEmpId(int empId) {  // setter methods
		return this.empId = empId;
	}
		
	public String getEmpNm() {
		return empNm;
	}
		
	public String setEmpNm(String empNm) {
		return this.empNm = empNm;
	}
		
	public int getEmpAge() {
		return empAge;
	}
		
	public int setEmpAge(int empAge) {
		return this.empAge = empAge;
	}
		
	public String getEmpPanCrd() {
		return empPanCrd;
	}
		
	public String setEmpPanCrd(String empPanCrd) {
		return this.empPanCrd = empPanCrd;
	}
		
	public int getEmpAadharCrd() {
		return empAadharCrd;
	}
		
	public int setEmpAadharCrd(int empAadharCrd) {
		return this.empAadharCrd = empAadharCrd;
	}
		
	public String getEmpDept() {
		return empDept;
	}
		
	public String setEmpDept(String empDept) {
		return this.empDept = empDept;
	}
		
	public int getEmpSal() {
		return empSal;
	}
		
	public int setEmpSal(int empSal) {
		return this.empSal = empSal;
	}
		
	public String getEmpContactNbr() {
		return empContactNbr;
	}
		
	public String setEmpContactNbr(String empContactNbr) {
		return this.empContactNbr = empContactNbr;
	}
		
	public int getEmpExp() {
		return empExp;
	}
		
	public int setEmpExp(int empExp) {
		return this.empExp = empExp;
	}	
	
	public void details() {  // display details
		System.out.println("The id of the employee is: " + this.getEmpId());
		System.out.println("The name of the employee is: " + this.getEmpNm());
		System.out.println("The age of the employee is: " + this.getEmpAge());
		System.out.println("The pan card of the employee is: " + this.getEmpPanCrd());
		System.out.println("The aadhar card of the employee is: " + this.getEmpAadharCrd());
		System.out.println("The department of the employee is: " + this.getEmpDept());
		System.out.println("The salary of the employee is: " + this.getEmpSal());
		System.out.println("The contact number of the employee is: " + this.getEmpContactNbr());
		System.out.println("The experience of the employee is: " + this.getEmpExp());
	}
	
	public void computeSalary() {  // will be used in subclasses
	}
}
