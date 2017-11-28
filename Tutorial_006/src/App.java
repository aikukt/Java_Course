import java.util.Scanner;

public class App {

	public static void main(String[] args) {

		/*
		 * Scanner is an class for getting input from users This is a creation of a new
		 * Scanner object
		 */
		Scanner input = new Scanner(System.in);

		// Output prompt
		System.out.println("Enter a line of text");
		// way of entering a line of text

		String line = input.nextLine();

		// tell the user what he entered
		System.out.println("You entered: " + line);

		
		/*
		 * tells if the user entered a decimal number or not if a number is entered
		 * testDouble will be "true" anything else and it will be false
		 */
		System.out.println("Enter a decimal number: ");
		boolean testDouble = input.hasNextDouble();

		System.out.println("You enterd: " + testDouble);
		input.close();
	}

}
