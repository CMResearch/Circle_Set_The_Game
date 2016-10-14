import java.util.Scanner;

public class Cordell_Code {

	public static void main (String[] args)
	{
	 
	Scanner scan = new Scanner(System.in);
	 
	System.out.println("Which Fibonacci number do you want to see?");
	 
	int see = scan.nextInt();
	 
	System.out.println("The number is "+fibo(0,1,see)+".");
	 
	scan.close();
	 
	}
	 
	 
	 
	//Fibonacci method
	protected static int fibo(int a, int b, int n) //see is the entered value of n
	{
	//checks to see if we have reached the desired number yet (base case)
	if(n==1)
	{
	return(a);
	}
	 
	//Fibonacci number computation
	int temp = a;
	a = b;
	b = temp + b;
	
	//visual test
	System.out.println("n = " + n + ":  \t" + temp + " " + a + " " + b);
	 
	return(fibo(a,b,n-1));
	 
	}
	}

	
	

