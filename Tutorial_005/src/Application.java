
public class Application {
	public static void main(String[] args) {

		int myInt = 15;

		/*
		 * if the first statement is not true it checkes the next one, if that is also
		 * not true it gets the last "else" done (prints "None of the above" in this
		 * example
		 */
		if (myInt < 10) {
			System.out.println("Yes, it's true!");
		} else if (myInt > 20) {
			System.out.println("No, it's false!");
		} else {
			System.out.println("None of the above!");
		}

		/*
		 * if both statements are true it prints the first one because it doesn't need
		 * to check the next one
		 */
		if (myInt < 20) {
			System.out.println("Test 1");
		} else if (myInt < 50) {
			System.out.println("Test 2");
		}

		/*
		 * while loop is always true so it runs infinite, but since we added an if
		 * statement that breaks when loop is 5 (see that we are incrementing loop every
		 * time before printing "Running"
		 */
		int loop = 0;

		while (true) {
			System.out.println("Looping: " + loop);

			if (loop == 5) {
				break;
			}

			loop++;

			System.out.println("Running");
		}
	}
}
