class Person {
	String name;
	int age;
	String married;

	void speak() {
		System.out.println("My name is: " + name);
	}

	int calculateYearsToRetirement() {
		int yearsLeft = 65 - age;

		return yearsLeft; // returning yearsLeft when called
	}
	
	// getter methods
	int getAge() {	
		return age;
	}
	
	String getName() {
		return name;
		
	}
	
	String getMarried() {
		return married;
	}
}

public class App {

	public static void main(String[] args) {
		Person person1 = new Person();

		person1.name = "Joe";
		person1.age = 25;
		person1.married = "with a smile :D";

		//person1.speak();
		
		int years =	person1.calculateYearsToRetirement();
		System.out.println("Years till rertirements " + years);
		
		int age = person1.getAge();
		String name = person1.getName();
		String married = person1.getMarried();
		
		System.out.println("My name is " + name);
		System.out.println("My age is " + age);
		System.out.println("I'm married " + married);
		

	}

}
