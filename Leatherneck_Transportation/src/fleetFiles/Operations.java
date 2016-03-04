package fleetFiles;

import javax.swing.JOptionPane;
import java.lang.*;
import java.io.*;
import java.util.NoSuchElementException;
import java.util.Scanner;
import java.nio.file.*;

public class Operations{
	
	//TRACTOR & TRAILER VARIABLES
	private static Scanner readInputFile;
	private static String make;
	private static String LicenseNo;
	private static String ttype;
	
	//OTHER VARIABLES
	private static double LocalFuelPrice = 1.50;
	//private static double milesTraveled;
	private static String milesTraveled;
	//private static double revenue;
	private static String revenue;
	
	// INITIALIZE ARRAYS
	private static String[] truckArray = new String[4];
	private static String[] trailerArray = new String[4];
	//private static double[] milesArray = new double[4];
	private static String[] milesArray = new String[4];
	//private static double[] revenueArray = new double[4];
	private static String[] revenueArray = new String[4];
	private static String[] licenseArray = new String[4];
	private static Tractor[] fleetTrucks = new Tractor [truckArray.length];
	private static Trailer[] fleetTrailers = new Trailer[trailerArray.length];

	//private static PrintWriter pw;
	
	public static void main (String[] args){
		
		openFile();
		readRecords();
		closeFile();
		
	} // End main
	
	public static void openFile(){
		
		try{
			readInputFile = new Scanner(Paths.get("InputFile.txt"));
			//pw = new PrintWriter("OutputFile.txt");
		}
		catch (IOException ioException){
			System.err.println("Error opening file.  Terminating.");
			System.exit(1);
		}

	} // End openFile
	
	public static void readRecords(){
		readInputFile.useDelimiter(",");
		String make, ttype, milesTraveled, revenue, LicenseNo;
		
		try{
				while (readInputFile.hasNext()){
				for (int i=0; i < 4; i++){   // loop for the array index
					make = readInputFile.next();
					truckArray[i] = make;
					ttype = readInputFile.next();
					trailerArray[i] = ttype;
					//milesTraveled = (readInputFile.nextDouble());
					milesTraveled = readInputFile.next();
					milesArray[i] = milesTraveled;
					//revenue = (readInputFile.nextDouble());
					revenue = readInputFile.next();
					revenueArray[i] = revenue;
					LicenseNo = readInputFile.next();
					licenseArray[i] = LicenseNo;
				}//end for loop for index	
			}// end while loop for reading from the input file
				
				
			//ITTERATE THROUGH THE ARRAYS
			//AND USE THE DATA TO INSTANTIATE OBKECTS INTO OBJECT ARRAYS
			
			//Tractor[] fleetTrucks = new Tractor [truckArray.length];
			//Trailer[] fleetTrailers = new Trailer[trailerArray.length];
			
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
				
				
				//Convert input array data from String to double (miles, revenue)

				//double fuelUse = (milesArray[rindex]/ adjustedMPG);
				//double operationalCost = ((milesArray[rindex] * rigMaint) + (fuelUse * LocalFuelPrice));			
				//double profit = (revenueArray[rindex] - operationalCost);
				
				double rigMiles = Double.parseDouble(milesArray[rindex]);
				double rigRevenue = Double.parseDouble(revenueArray[rindex]);
				
				double adjustedMPG = (rigMPG * pupDrag); // from super or sub class					
				double fuelUse = (rigMiles / adjustedMPG);
				double operationalCost = ((rigMiles * rigMaint) + (fuelUse * LocalFuelPrice));
				double profit = (rigRevenue - operationalCost);
				
				
				//DISPLAY TO CONSOLE
				System.out.println("TRUCK # " + (rindex+1) + "   LICENSE NUMBER: " + rigTag);
				System.out.println(rigColor + " " + rigMake + " " + rigModel + " with " + pupLength + "-foot " + pupMake + " " + pupModel + " " + pupType );
				System.out.println ("Average MPG: " + rigMPG);
				System.out.println("Maintenance cost per mile: " + rigMaint);
				System.out.println("Trailer Drag Adjustment: " + pupDrag);
				System.out.println("Adjusted MPG: " +adjustedMPG);
				//System.out.println("Miles Traveled: " + milesArray[rindex]);
				System.out.println("Miles Traveled: " + rigMiles);
				System.out.println("Fuel Used: " + fuelUse + " gallons");
				System.out.println("Operational Cost: " + operationalCost);
				//System.out.println("Revenue: " + revenueArray[rindex]);
				System.out.println("Revenue: " + rigRevenue);
				System.out.println("Profit: " + profit);
				System.out.println("\n\n");
				/*
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
	*/
		}// end report loop	
				
		}
		catch (NoSuchElementException elementException){
			System.err.println("File Improperly formed. Terminating.");
		}
		catch (IllegalStateException stateException){
			System.err.println("Error reading from file. Terminating");
		}
	} // end read records
	
	public static void closeFile(){
		if (readInputFile !=null)
			readInputFile.close();
			//pw.close();
		}

}
