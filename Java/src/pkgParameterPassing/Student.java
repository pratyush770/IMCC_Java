package pkgParameterPassing;

public class Student {
	String rollNbr, name, semester, grade, course;  // instance variables
	double course1, course2, course3, course4, course5, percentage;
	
	public Student(String rno, String name, String c, String sem, double c1, double c2,double c3,double c4,double c5) {  // parameterized constructor
		this.rollNbr = rno;
		this.name = name;
		this.course = c;
		this.semester = sem;
		this.course1 = c1;
		this.course2 = c2;
		this.course3 = c3;
		this.course4 = c4;
		this.course5 = c5;
	}
}
