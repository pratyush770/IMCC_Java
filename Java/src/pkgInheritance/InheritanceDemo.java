package pkgInheritance;

public class InheritanceDemo {
	public static void main (String [] args) {
		
//		Animal anObj = new Animal();  // create object of Animal class
//		Animal anObj1 = new Animal("Whale");  // parameterized constructor
//		Mammal mmObj = new Mammal();  // create object of Mammal class
//		mmObj.details();
//		anObj.details();  
//		mmObj.details();
//		Animal anObj2 = new Mammal();  // subclass constructor can be used to create superclass object
//		anObj2.details();  // details method of mammal class is called
//		Mammal mmObj1 = new Animal();  // this won't work
		Dog d = new Dog(6, true);
		d.details();
	}
}
