import java.util.Scanner;

public class LastItem {

	public static void main(String[] args) {
		  Scanner scan = new Scanner(System.in);
		  String input = "", lastValue = "";
		  System.out.print("Please provide string input");
		  input = scan.nextLine();  // Read user input
		  while (!input.isEmpty()) {
				
				if(!input.isEmpty()) {
					lastValue = input;
				}
				input = scan.nextLine();  // Read user input
		
			} //break the loop when user enters ""
			System.out.print("The last item in the list is: "+lastValue);
	}
	  
	}

