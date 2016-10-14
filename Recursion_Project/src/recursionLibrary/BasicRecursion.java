package recursionLibrary;
import java.util.Scanner;

public class BasicRecursion {


	public static int userNumber;
	public static int userFactor;

	
	
	public static void main(String args[]){
		
		Scanner userEntry = new Scanner(System.in);
		
		// User Input
		System.out.print("Please enter a number, preferably larger than 10: ");
		userNumber = userEntry.nextInt();
		System.out.print("Excellent. Now enter a second number, preferably less than ten: ");
		userFactor = userEntry.nextInt();
		System.out.println(userFactor + " could be subtracted from " +userNumber + " " + RecursiveProcess(userNumber, userFactor, 0) + " times.");
		
	
		userEntry.close();
	}
	
	public static int RecursiveProcess(int a, int b, int c){
		
		int result = a;
		
		if (result < b){
			return (c);
		}
		result = a;
		a = result - b;
		return RecursiveProcess(a,b,c+1);
		} //end RecursiveProcess method

		

		
		

	
}// end class
