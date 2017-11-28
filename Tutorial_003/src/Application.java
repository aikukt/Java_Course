
public class Application {
	public static void main(String[] args) {

		int value = 0;

		/*
		 * While the condition value is less then 10 it will keep on writing the
		 * "Hello + value"
		 */
		while (value < 10) {
			System.out.println("Hello " + value);

			value = value + 1;
		}

		int infinite = 0;

		/* While infinite is less then 1, and in this case it always is the loop
		 * will keep on printing "No end to this!!
		 * It's an infinite loop
		 */
		while (infinite < 1) 
		{
			System.out.println("No end to this!!");
		}

	}
}
