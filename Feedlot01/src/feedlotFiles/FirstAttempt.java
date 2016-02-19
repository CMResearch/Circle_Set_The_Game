package feedlotFiles;

//Unless otherwise indicated, all code is original,
//Created by Steve Creigh as part of 
//CS-120-A-2016P Data Structures and Program Design
//February 2016, Carroll College, Helena MT



import java.util.Scanner;
public class FirstAttempt {
	


	public static void main(String[] args) {

		String calves[] = {"Alpha", "Bravo", "Charlie", "Delta",};
		double sWeight[]= {200, 201,202,203,204};
		double fWeight[] = {350, 385, 406, 372, 392};

		double weights [][] = new double [4][5];		
		double gain[] = new double[4];
		double growth[] = new double[4];
		
		double AverageGain = 0.0;
		double total = 0.0;
		String verify;
		double correction;
		Scanner UserInput = new Scanner(System.in);
		
		//user input to verify the finish weight
		System.out.println("Please verify the finishing weights for your calves");
		
		for (int index = 0; index < calves.length; index ++){
			System.out.println("\n\n\t" + calves[index] + "\tFinal Weight: " + fWeight[index]);
			System.out.print("\tIs this correct?  (Y/N) ");
			verify = UserInput.next();
			if (verify.equalsIgnoreCase("y")){
				System.out.println("Verified.\n");
			}
			else if (verify.equalsIgnoreCase("n")){
				System.out.println("Please enter the correct weight for this calf: ");
				correction = UserInput.nextDouble();
				fWeight[index] = correction;
				System.out.println("Correction applied.  New weight is: \t" + fWeight[index]);
			}
			else {
				System.out.println("** UNRECOGNIZED ENTRY ** Please try again.\n");
				System.out.println("\t" + calves[index] + "\tFinal Weight: " + fWeight[index]);
				System.out.print("\tIs this correct?  (Y/N) ");
				verify = UserInput.next();
			}
			
			
		}
		
		
		// Synchronize the arrays
		for (int r = 0; r < calves.length; r++){ // four rows
			gain[r] = (fWeight[r] - sWeight[r]);
			growth[r] = ((gain[r] / sWeight[r])*100);
			
			int c = 0;
			weights [r][c] = sWeight[r];
			c = c+1;
			weights [r][c] = fWeight[r];
			}
		
		for (double d : gain){  //From Dietel: Java How to Program pg. 232  Fig. 6.13
			total += d;
			AverageGain = total/gain.length;
		}
		
		
		//print it
		System.out.println("Calf Name\tStart Weight\tFinish Weight\tNet Gain\t % Growth");
		for (int r = 0; r < calves.length; r++){
			for (int c = 0; c < 2; c++){
		      System.out.print(calves[r] + "\t\t   ");
		      System.out.print(weights[r][c] + "\t   ");
		      c = c+1;
		      System.out.print(weights[r][c] + "\t  " + gain[r] + "\t\t  " + growth[r]);
		      }
			System.out.println();
		}
			System.out.println("\n\t\t\tNet Average Gain:\t" + AverageGain);
			
			UserInput.close();
	}

}
