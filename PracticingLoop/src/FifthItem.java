import java.util.Scanner;

public class FifthItem {
	
	public static void main(String[] args) {
		  Scanner scan = new Scanner(System.in);
		  String input, fifthItem = null;
		  System.out.print("Please provide string input");
		  input = scan.nextLine();  // Read user input
		  int num = 0;
		  while (!input.isEmpty()) {
				if(num == 5) {
					fifthItem = input;
				}
				num++;
				 input = scan.nextLine();  // Read user input
			} //break the loop when user enters ""
			System.out.print("The fifth item in the list is:"+fifthItem);
	}
}
