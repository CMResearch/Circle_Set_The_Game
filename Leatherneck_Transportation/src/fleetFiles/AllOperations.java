package fleetFiles;

import java.io.*;
import java.util.Scanner;
import java.nio.file.*;

public class AllOperations {

	public static void main(String[] args) throws IOException {

		//TRACTOR & TRAILER VARIABLES
		String make;
		String LicenseNo;
		String ttype;
		
		//OTHER VARIABLES
		double LocalFuelPrice = 1.50;
		double milesTraveled;
		double revenue;
		
		// INITIALIZE ARRAYS
		String[] truckArray = new String[4];
		String[] trailerArray = new String[4];
		double[] milesArray = new double[4];
		double[] revenueArray = new double[4];
		String[] licenseArray = new String[4];
		//alternative:  have the scanner check how many lines, and use that value to determine the length
		
		
		// INITIALIZE SCANNER AND PRINTWRITER
		
		Scanner readInputFile = new Scanner(Paths.get("InputFile.txt"));
		PrintWriter pw = new PrintWriter("OutputFile.txt");

		
		// READ THE FILE DATA INTO THE ARRAYS
		while (readInputFile.hasNext()){
			for (int i=0; i < 4; i++){   // loop for the array index
				make = readInputFile.next();
				truckArray[i] = make;
				ttype = readInputFile.next();
				trailerArray[i] = ttype;
				milesTraveled = (readInputFile.nextDouble());
				milesArray[i] = milesTraveled;
				revenue = (readInputFile.nextDouble());
				revenueArray[i] = revenue;
				LicenseNo = readInputFile.next();
				licenseArray[i] = LicenseNo;
			}//end for loop for index	
		}// end while loop for reading from the input file
		
		readInputFile.close(); // close the scanner to read the input file
		
		//GET INPUT FROM THE USER (CONSOLE)
		Scanner userInput = new Scanner(System.in);
		
		System.out.print("Please enter your first and last name: ");
		String userName = (userInput.next());
			//string manipulation to reverse the name :  SAMPLE CODE TAKEN FROM Dave Marshall's IO File example 			
			//char [] testbychar = userName.toCharArray();
			int commaspot = userName.indexOf(" ");
			int stringLength = userName.length();
			String lastname = userName.substring(0,commaspot);
			String firstname = userName.substring(commaspot, stringLength);
		System.out.print("\n\nThank you, " +lastname + ", " + firstname + ".  Please enter the current local diesel price: ");
		double localFuelPrice = (userInput.nextDouble());
		
		userInput.close();
		
		//ITTERATE THROUGH THE ARRAYS
		//AND USE THE DATA TO INSTANTIATE OBKECTS INTO OBJECT ARRAYS
		
		Tractor[] fleetTrucks = new Tractor [truckArray.length];
		Trailer[] fleetTrailers = new Trailer[trailerArray.length];
		
		for (int index = 0; index <= truckArray.length; index++){
			//process truck info and instantiate tractor objects
			if (truckArray[index] == "Kenworth"){
				fleetTrucks[index] = new Tractor(licenseArray[index]);
			}
			else if (truckArray[index] == "KenworthA"){
				fleetTrucks[index] = new KWaero(licenseArray[index]);
			}
			else if (truckArray[index] == "Freightliner"){
				fleetTrucks[index] = new FLaero(licenseArray[index]);
			}
			else if (truckArray[index] == "Volvo"){
				fleetTrucks[index] = new Volvo(licenseArray[index]);
			}
			
			//process trailer info and instantiate trailer objects
			if (trailerArray[index] == "Box"){
				fleetTrailers[index] = new Trailer();
			}
			else if (trailerArray[index] == "Flat"){
				fleetTrailers[index] = new FlatTrailer();
			}
			else if (trailerArray[index] == "StepDeck"){
				fleetTrailers[index] = new StepDeckTrailer();
			}
			else if (trailerArray[index] == "Tank"){
				fleetTrailers[index] = new TankTrailer();
			}
		}//exit Object iteration loop
		
		
		// PROCESS THE OBJECT ARRAYS TO DEVELOP AND DISPLAY THE REPORT RESULTS
		for (int rindex = 0; rindex <= fleetTrucks.length; rindex++){
			
			String rigMake = fleetTrucks[rindex].getMake();
			String rigModel = fleetTrucks[rindex].getModel();
			double rigMPG = fleetTrucks[rindex].getAverageMPG();
			double rigMaint = fleetTrucks[rindex].getMaintenanceCost();
			String rigColor = fleetTrucks[rindex].getColor();
			String rigTag = fleetTrucks[rindex].getLicenseNumber();
			
			String pupMake = fleetTrailers[rindex].getTrailerMake();
			String pupModel = fleetTrailers[rindex].getTrailerModel();
			String pupType = fleetTrailers[rindex].getTrailerType();
			double pupLength = fleetTrailers[rindex].getTrailerlength();
			double pupDrag = fleetTrailers[rindex].getTrailerDrag();
			
		
			double adjustedMPG = (rigMPG * pupDrag);
			double fuelUse = (milesArray[rindex]/ adjustedMPG);
			double operationalCost = ((milesArray[rindex] * rigMaint) + (fuelUse * LocalFuelPrice));
			double profit = (revenueArray[rindex] - operationalCost);
			
			//DISPLAY TO CONSOLE
			System.out.println("TRUCK # " + (rindex+1) + "   LICENSE NUMBER: " + rigTag);
			System.out.println(rigColor + " " + rigMake + " " + rigModel + " with " + pupLength + "-foot " + pupMake + " " + pupModel + " " + pupType );
			System.out.println ("Average MPG: " + rigMPG);
			System.out.println("Maintenance cost per mile: " + rigMaint);
			System.out.println("Trailer Drag Adjustment: " + pupDrag);
			System.out.println("Adjusted MPG: " +adjustedMPG);
			System.out.println("Miles Traveled: " + milesArray[rindex]);
			System.out.println("Fuel Used: " + fuelUse + " gallons");
			System.out.println("Operational Cost: " + operationalCost);
			System.out.println("Revenue: " + revenueArray[rindex]);
			System.out.println("Profit: " + profit);
			System.out.println("\n\n");
			
			//SEND TO PRINTWRITER
			pw.println("Leatherneck Trucking, LLC    WEEKLY FLEET REPORT\n\n");
			pw.println("TRUCK # " + (rindex+1) + "   LICENSE NUMBER: " + rigTag);
			pw.println(rigColor + " " + rigMake + " " + rigModel + " with " + pupLength + "-foot " + pupMake + " " + pupModel + " " + pupType );
			pw.println ("Average MPG: " + rigMPG);
			pw.println("Maintenance cost per mile: " + rigMaint);
			pw.println("Trailer Drag Adjustment: " + pupDrag);
			pw.println("Adjusted MPG: " +adjustedMPG);
			pw.println("Miles Traveled: " + milesArray[rindex]);
			pw.println("Fuel Used: " + fuelUse + " gallons");
			pw.println("Operational Cost: " + operationalCost);
			pw.println("Revenue: " + revenueArray[rindex]);
			pw.println("Profit: " + profit);
			pw.println("\n\n");

	}// end report loop
		pw.close();
	}
}