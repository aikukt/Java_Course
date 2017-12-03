import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		// arrays

		int[] values;
		// allocation of memory for 3 integers
		values = new int[3];

		System.out.println(values[0]);

		values[0] = 10;
		values[1] = 20;
		values[2] = 30;

		System.out.println(values[0]);
		System.out.println(values[1]);
		System.out.println(values[2]);

		// iteration trough values
		for (int i = 0; i < values.length; i++) {
			System.out.println(values[i]);
		}

		// Initializing array
		int[] numbers = { 5, 6, 7 };
		for (int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
		}

		
		//array fill example
		Scanner inputVal = new Scanner(System.in);
		int x=0;
		int[] testingNum = new int[10];
		for (int i=0; i < 10; i++) {
			System.out.println("Enter the " + (i+1) + " number: ");
			testingNum[i]=inputVal.nextInt();
			x=x+testingNum[i];
		}
		System.out.println("Total value of your array numbers is: *** "+ x + " ***");
		inputVal.close();
	}

}
