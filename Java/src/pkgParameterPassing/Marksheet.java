package pkgParameterPassing;

public class Marksheet{
	double totalMarks, percentage;  // instance variables
	String grade;
	
	public void calculateGrade(double c1, double c2, double c3, double c4, double c5) {  // function to calculateGrade
		totalMarks = c1 + c2 + c3 + c4 + c5;  // calculate total marks
		percentage = (totalMarks * 100) / 500;  // calculate percentage
		
		if (percentage <= 50) {
			grade = "F";
		}
		else if (percentage >=50 && percentage <=59) {
			grade = "P";
		}
		else if (percentage >=60 && percentage <=70) {
			grade = "G";
		}
		else if (percentage >=71 && percentage <=75) {
			grade = "E";
		}
		else {
			grade = "O";
		}
	}
	
	public void calculateGrade(Student st) {  // passing object other than primitive (Method overloading)
		totalMarks = st.course1 + st.course2 + st.course3 + st.course4 + st.course5;  // calculate total marks
		percentage = (totalMarks * 100) / 500;  // calculate percentage
		st.percentage = percentage;  // value of percentage goes to Student object percentage variable
		if (percentage <= 50) {
			grade = "F";
		}
		else if (percentage >=50 && percentage <=59) {
			grade = "P";
		}
		else if (percentage >=60 && percentage <=70) {
			grade = "G";
		}
		else if (percentage >=71 && percentage <=75) {
			grade = "E";
		}
		else {
			grade = "O";
		}
		st.grade = grade;  // value of grade goes to Student object grade variable
	}
	
	public void printMarksheet() {  // function to print marksheet
		System.out.println("The percentage of the student is: " + this.percentage);
		System.out.println("The grade of the student is: " + this.grade);
	}
}
