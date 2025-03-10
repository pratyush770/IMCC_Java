package pkgOrgStructure;  // name of package

public class EmployeeDemo 
{
    public static void main(String[] args) 
    {   	
//        Manager m = new Manager("Pratyush Majumdar", 1, 100000);  // Manager object creation
//        Developer d = new Developer("Saad Sayyed", 2, "Senior");  // Developer object creation
//        Tester t = new Tester("Om Lakade", 3, 100);  // Tester object creation
//        
//        m.details();  // function to print details
//        System.out.println();  // for new line
//        d.details();
//        System.out.println();
//        t.details();  
    	
    	
    	Employee e = new Employee(1, "Pratyush", 20, "A1234", 5679, "IT", 50000, "7666234983", 1);  // object creation
    	Manager m = new Manager(2, "Rehan", 22, "A1235", 5680, "HR", 80000, "8626214084", 5, 4, 50);
    	Developer d = new Developer(3, "Aryan", 22, "A1236", 5681, "IT", 60000, "9106254985", 3, "Software Development Team", "Suchismita", "Python and Java");
    	Tester t = new Tester(4, "Soham", 21, "A1237", 5682, "Finance", 70000, "8606831986", 6,"Software Testing Team", "Prakash", "Unit Testing");
    	e.details();  // function to print details	
    	System.out.println();  // new line
    	m.details();
    	m.computeSalary();  // function to print computed salary
    	System.out.println();
    	d.details();
    	d.computeSalary();
    	System.out.println();
    	t.details();	
    	t.computeSalary();
    }
}