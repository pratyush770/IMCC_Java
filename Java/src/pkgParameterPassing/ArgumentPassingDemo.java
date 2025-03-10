package pkgParameterPassing;

// Call by value demonstration
public class ArgumentPassingDemo {
	public static void main(String [] args) {
		// Using primitives
		Student s = new Student("2401121", "Pratyush", "FY-MCA", "Sem2", 90, 90, 90, 90, 90);  // Student object creation
		Marksheet m = new Marksheet();  // Marksheet object creation
		m.calculateGrade(s.course1, s.course2, s.course3, s.course4, s.course5);  // primitives are passed i.e. double
		m.printMarksheet();  // function call
		System.out.println(s.percentage);  // will display 0.0
		System.out.println(s.grade + "\n");  // will display null	
		
		// Using object
		Student s1 = new Student("2401121", "Pratyush", "FY-MCA", "Sem2", 90, 90, 90, 90, 90);  // Student object creation
		Marksheet m1 = new Marksheet();  // Marksheet object creation
		m1.calculateGrade(s1);  // object is passed
		m1.printMarksheet();  // function call
		System.out.println(s1.percentage);  // will display 90.0 now
		System.out.println(s1.grade);  // will display O now
	}
}
