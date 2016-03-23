package recursionLibrary;

import java.util.Scanner;

// I wanted to try string manipulation without the need for an array (which actually seemed easier)


public class BasicStringRecursion {
	
		public static int index;

	
		public static void main(String[] args) {
	
		Scanner userEntry = new Scanner(System.in);

		
		
		System.out.print("Give me a word, any word: ");
		String userString = userEntry.next();
		
		System.out.println("The length of the string is " + userString.length()); // added for debugging
		System.out.println(RecursiveOperation(userString, 0));
		
	userEntry.close();		
			
	}//end main
	
	public static char RecursiveOperation(String a, int i){
		index = i;
		int limit = a.length()-1;
		char c = a.charAt(index);
		
		//Recursion loop				
		if (index > limit - 1){ // establishes sentinel value
			return (c);
		}
		c = a.charAt(index);
		System.out.println(c);
		
		return RecursiveOperation(a, index+1);
	}
	

	

}//end class BasicSringRecursion
