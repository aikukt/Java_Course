class Person {

	// Instance variables (data or "state")
	String name;
	int age;

	// Classes can contain

	// 1. Data
	// 2. Subroutines (methods)
	void speak () {
		for(int i=0; i<3; i++) {
		System.out.println("My name is: " + name + " and I am " + age + " years old");
		}
	}
	
	void sayHello() {
		System.out.println("Hello there!");
	}
}

// my test
class Anime {
	String name;
	String type;
	int episodes;
	
	void aboutMe() {
		System.out.println(name + " is a " + type + " anime with " + episodes + " episodes to watch.");
	}

}

public class App {

	public static void main(String[] args) {

		Person person1 = new Person();
		person1.name = "Joe Bloggs";
		person1.age = 37;

		Person person2 = new Person();
		person2.name = "Sara Smith";
		person2.age = 20;

		// my test
		Anime anime1 = new Anime();
		Anime anime2 = new Anime();

		anime1.name = "Akagami no kill";
		anime1.type = "Shounen";
		anime1.episodes = 24;

		anime2.name = "D&D";
		anime2.type = "Harem, ecchi";
		anime2.episodes = 72;

		System.out.println(anime1.name);
		System.out.println(anime1.type);
		System.out.println(anime1.episodes);
		System.out.println();
		System.out.println(anime2.name);
		System.out.println(anime2.type);
		System.out.println(anime2.episodes);
		
		// v2
		person1.speak();  // calling the method from class Person
		person1.sayHello();
		person2.speak();
		anime1.aboutMe();
		anime2.aboutMe();
	}

}
