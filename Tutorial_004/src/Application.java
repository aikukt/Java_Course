
public class Application {
	public static void main(String[] args) {

		// for loop for(;;){};

		for (int i = 0; i < 5; i++) {
			System.out.println("Hello by the number of i = " + (i + 1));
		}

		/*
		 * Special print format (string, variable, prints in one line if not formated
		 * differently.
		 * %d is replaced by the value of i (in this example)
		 * \n makes the print go to new line
		 * 
		 */
		for (int i = 0; i < 5; i++) {
			System.out.printf("i is = %d\n", i);
		}
	}
}
