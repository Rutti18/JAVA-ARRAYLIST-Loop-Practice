import java.util.ArrayList;
import java.util.Scanner;
//list.indexOf(finalVal) != -1

public class IndexOfInteger {

	public static void main(String[] args) {
		  Scanner scan = new Scanner(System.in);
		  int input = 0;
		  int finalVal = 0;
		  System.out.print("Please enter list of integer values");
		  input = scan.nextInt();  // Read user input
		  ArrayList<Integer> list = new ArrayList<Integer>();
		  while (input!=0) { // break loop if value is 0
				if(input !=0) {
					list.add(input); // add to list
				}
				input = scan.nextInt();  // Read user input
		
			} 
			System.out.print("Done entering integers into the list\n");
			System.out.print("What number are you looking for in the list?");
			finalVal = scan.nextInt(); 


			for (int i=0; i<list.size(); i ++) {
				if(list.get(i) == finalVal ){
					System.out.print(finalVal + " is at index "+i +"\n");
				}
			}		
	}

}
