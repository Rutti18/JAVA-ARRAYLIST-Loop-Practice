import java.util.ArrayList;
import java.util.Scanner;

public class SumOfList {

	public static void main(String[] args) {
		SumOfList sumOfList =  new SumOfList();
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
		  sumOfList.addValues(list); //call the method to get the sum
		  System.out.print("What number are you looking for in the list");
		  input = scan.nextInt();
			for (int i=0; i<list.size(); i ++) {
				if(list.get(i) == input ){
					System.out.print(input + " is at index "+i +"\n");
				}
			}
	}
	
	//add all values in the list
	private void addValues(ArrayList list) {
		
		int sum = 0;
	    for(int i = 0; i < list.size(); i++)
	    {
	        sum += (int)list.get(i);
	    }
	    System.out.println("The sum of that list is:"+ sum);
	}

}
