import java.util.Scanner;

class Robot {
	public void speak(String text) {
		System.out.println(text);
	}

	public void jump(int height) {
		System.out.println("Jumping: " + height);
	}

	public void move(String direction, double distance) {
		System.out.println("Moving " + distance + " meters in direction " + direction);
	}
	
	//test
	public void calculate(double one, double two) {
		System.out.println("Adding the two numbers you enterd = " + (one + two));
		System.out.println("Detracting the two numbers you enterd = " + (one - two));
		System.out.println("Multiplying the two numbers you enterd = " + (one * two));
		System.out.println("Dividing the two numbers you enterd = " + (one / two));
	}
}

public class App {

	public static void main(String[] args) {
		Robot sam = new Robot();

		sam.speak("Hi I'm Sam.");
		sam.jump(7);

		sam.move("West", 12.2);

		String greeting = "Hello there";
		sam.speak(greeting);

		int value = 14;
		sam.jump(value);
		
		//test, entering two numbers and doing basic calculation with them in another class subrutine
		double one, two;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter two digits for calculations:");
		System.out.print("A= ");
		one = input.nextDouble();
		System.out.print("B= ");
		two = input.nextDouble();
		
		sam.calculate(one, two);
		input.close();
		
		
	}

}
