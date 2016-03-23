package recursionLibrary;
import java.util.Scanner;

// primary concept comes from sample code by Sunandita Ghosh Srivastava found on 
// http://java2novice.com/java-interview-programs/string-reverse-recursive/
// Unless otherwise noted, all commenting is my own as a means of tracing and understanding the recursive process
// (it's still a mind-twisting concept, but I think I grasp the basics)
//It was made more challenging to understand without the use of ToSubString, but the declination
// process is brilliant

public class StringReversal_Array {
	
	
	public static String ReverseString(String input){ //receives the userInput string and assigns it to the String input

		char arr[]=new char[input.length()]; //creates the incoming character array (user name forward), and determines length

		rLogic(input.toCharArray(),arr); //method call to rLogic

		return new String(arr);

		}
	
	
		// Recursive logic process
		private static char rLogic(char[]inArray, char[]outArray){ // receives two character arrays: inArray and outArray

		if(inArray.length >1){  //BASE CASE

			char outPut = inArray[0]; //declares and initializes a character equal to the value at index 0 in the inArray

			char[] localArray = new char[inArray.length-1]; //  DECLINATION moving the index backwards one character at a time with each iteration

			System.arraycopy(inArray, 1, localArray, 0, inArray.length-1); //copies the item in inArray position 1 to localArray position 0

			//outPut =  *from Sunandita Ghosh Srivastava

			rLogic(localArray,outArray); //passes localArray and outArray to the method: local becomes inArray, outArray remains outArray

			outArray[inArray.length-1]=outPut; //assigns the value of inArray to outPut, which is then assigned to inArray index 0, moving it to the front
			System.out.println(outPut); // show process visually

		}

		else {

			outArray[0]= inArray[0]; // the array length is no longer greater than 1, sooo....
			System.out.println(outArray[0]); // show process visually
			return inArray[0]; //it returns the value at index 0
	

		}

		return '\0';

		}
		
		
		// MAIN
		public static void main(String args[]){
			
		Scanner userInput = new Scanner(System.in);	
		System.out.print("Please give me your first name:  ");
		String userName = userInput.next();

		System.out.println("\n\n" + ReverseString(userName)); //method call to recursive method
		
		}

		}
