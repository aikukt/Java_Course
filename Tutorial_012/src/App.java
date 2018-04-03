import java.util.Scanner;

public class App {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		

		// multi line comment
		/*
		 * System.out.println("Enter a number: ");
		 * int value = input.nextInt();
		 * while(value != 5) { 
		 * System.out.println("Enter a number: "); 
		 * value = input.nextInt(); }
		 */

		int value = 0;
		do {
			System.out.println("Enter a number: ");
			value = input.nextInt();
		}
		while(value != 5);
		
		System.out.println("Got 5!");
		input.close();
	}

}
