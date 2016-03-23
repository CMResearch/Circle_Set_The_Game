import java.util.Scanner;
// Example code used for this program came from 
// http://java2novice.com/java-interview-programs/string-reverse-recursive/
// all commenting is mine

public class StringRevesal {

 
	    String reverse = "";
	     
	    public String reverseString(String str){
	         
	        if(str.length() == 1){  // base case
	            return str;
	        } else {
	            reverse += str.charAt(str.length()-1)
	                    +reverseString(str.substring(0,str.length()-1));
	            return reverse;
	        }
	    }
	     
	    public static void main(String a[]){
	    	
	    	String userString;
	    	Scanner User = new Scanner(System.in);
	    	
	    	
	    	System.out.print("Enter a word: ");
	    	userString = User.next();
	    	
	    	
	    	
	        StringRevesal srr = new StringRevesal();
	        System.out.println("Result: "+srr.reverseString(userString));
	    }
	}
	//- See more at: http://java2novice.com/java-interview-programs/string-reverse-recursive/#sthash.KoOqsRxY.dpuf
	
	
	

