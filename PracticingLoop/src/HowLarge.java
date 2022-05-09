import java.util.Scanner;

public class HowLarge {
	public static void main(String[] args) {
		  Scanner scan = new Scanner(System.in);
		  String input = null;
		  System.out.print("Please provide string input");
		  input = scan.nextLine();  // Read user input
		  int num = 0;
		  while (!input.isEmpty()) {//break the loop when user enters ""
			  input = scan.nextLine();  // Read user input
				 num++;
			} 
			System.out.print("The total number of items in the list was:"+num);
		}
	  
	}

