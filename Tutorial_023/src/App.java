
public class App {

	public static void main(String[] args) {

		// Inefficient
		String info = "";

		info += "My name is Bob.";
		info += " ";
		info += "I'm a builder.";

		System.out.println(info);

		// More fficient

		StringBuilder sb = new StringBuilder("");
		sb.append("My name is Sue.");
		sb.append(" ");
		sb.append("I am a lion tamer.");

		System.out.println(sb.toString());

		StringBuilder s = new StringBuilder();

		s.append("My name is Roger.")
		.append(" ")
		.append("I am a skydiver.");

		System.out.println(s.toString());
		
		//// Formating ////
		
		System.out.println("Here is some text.\tThat was a tab.\nThat was a new line.");
		
		// Formating integers
		System.out.printf("Total cost %-10d; quantity is %d\n", 5, 120);
		
		for(int i=0; i<20; i++) {
			System.out.printf("%2d: some text here\n", i);
		}
		
		// Formating floating point value
		System.out.printf("Total value: %.2f\n", 5.6874);
		System.out.printf("Total value: %-10.2f\n", 659.15785);
	}

}
