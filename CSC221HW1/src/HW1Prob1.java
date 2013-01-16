import java.util.Scanner;


/**
 * This homework problem tests to see whether you can write a static method that
 * takes some parameters and returns a value.
 * @author Guinn
 * @version January 03, 2013
 */
public class HW1Prob1 {

	// you need to add the static method medianOfThree below this line
	/**_________________________________________________________________
	 * <b>Method:</b>	medianOfThree
	 * <ul>
	 * <li>Finds the median of the 3 ints.
	 * </ul>
	 * @param 3 integers:<br/>
	 * 
	 * @return int c<br/>The median of the 3 numbers given.
	 *__________________________________________________________________
	 */
	public static int medianOfThree(int a, int b, int c){
		if((a < b && b < c) || (c < b && b < a))
			return b;
		else if((b < a && a < c) || (a < b && c < a))
			return a;
		//this comment was added on github
		else return c;
		
		
		
	}//end method
	
	
	/**
	 * The main program reads in the data for the two points and determines the
	 * distance.
	 * 
	 * No need for students to modify the main method.
	 * 
	 * @param args
	 *            Ignored.
	 */
	public static void main(String[] args) {
		// NO NEED TO MODIFY THIS CODE
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the first number: ");
		int x1 = scan.nextInt();
		System.out.print("Enter the second number: ");
		int x2 = scan.nextInt();
		System.out.print("Enter the third number: ");
		int x3 = scan.nextInt();

		int median = medianOfThree(x1, x2, x3);
		System.out.println("The median of " + x1 + ", " + x2 + ", and " + x3
				+ " is " + median);

	}

}
