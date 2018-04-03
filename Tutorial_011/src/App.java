import java.util.Scanner;

public class App {

	public static void main(String[] args) {

		// Create Scanner object
		Scanner input = new Scanner(System.in);

		// Output prompt
		System.out.println("Enter a line of text: ");

		// Wait for the user to enter a line of text
		String line = input.nextLine();

		// Tell them that they entered.
		System.out.println("You enterd: " + line);

		System.out.println("Enter a number of text: ");
		Integer number = input.nextInt();
		System.out.println("You enterd: " + number);

		// With check if you entered the number or not with if
		System.out.println("Enter a number of text: ");
		if (input.hasNextInt()) {
			Integer number2 = input.nextInt();
			System.out.println("You enterd: " + number2);
		} else
			System.out.println("You didn't enter a number");
			
		input.close();			
				
	}

}
