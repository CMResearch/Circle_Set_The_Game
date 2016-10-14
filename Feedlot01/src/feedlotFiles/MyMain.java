package feedlotFiles;

import java.io.IOException;
import java.util.ArrayList;




public class MyMain {

	
	
	public static void main(String[] args) throws IOException{	
	
	//DECLARE AND INITIALIZE THE VARIABLES	
	String calfName[] = {"Pebbles", "Bam Bam", "Fred", "Wilma", "Betty"};
	String owners[] = {"Donald Trump", "Ted Turner", "Bill Gates", "Tim Cook", "Steve Wozniak"};

	
		
	// INSTANTIATE AN ARRAY OF THE SUPERCLASS	
	SuperCalf[] supercalf = new SuperCalf[3];{

	//initialize the instances
	for (int s=0; s < 3; s++){

		
	try{
		supercalf[s]= null;
	}
	catch(ArrayIndexOutOfBoundsException e){
		System.out.println(e);
	}
	
		
	supercalf[s] = new SuperCalf(calfName[s], owners[s]);

	// display the result of the instances
	
	supercalf[s].setBreed("Charolais");
	supercalf[s].setColor("Blond");
	
	String nombre = supercalf[s].getName();
	String eart = supercalf[s].getEarTag();
	String brd = supercalf[s].getBreed();
	String clr = supercalf[s].getColor();
	String ownr = supercalf[s].getOwner();
	String prodt = supercalf[s].getProductivity();
	String srce = supercalf[s].getSource();
	String hrns = supercalf[s].getHorns();
	String hrmnes = supercalf[s].getHormones();
	String anb = supercalf[s].getAntibiotics();
	double stw = supercalf[s].getStartWeight();
	double fnw = supercalf[s].getFinishWeight();
	
	
		
	System.out.println("CALF NAME: " + nombre);
	System.out.println("BREED: " + brd);
	System.out.println("COLOR: " + clr);
	System.out.println("OWNER NAME: " + ownr);
	System.out.println("PRODUCTIVITY: " + prodt);
	System.out.println("SOURCE: " + srce);
	System.out.println("HORNS: " + hrns);
	System.out.println("HORMONES: " + hrmnes);
	System.out.println("ANTIBIOTICS: " + anb);
	System.out.println("START WEIGHT: " + stw);
	System.out.println("FINISH WEIGHT: " + fnw);
	System.out.println("\n\n\n\n\n");

	}

	}// end supercalf
	
	
	//INSTANTIATE AN ARRAY OF THE SUBCLASS
	FeederCalves[] feeders = new FeederCalves[3];{
		
		//initialize the instances
		for (int f = 0; f < 3; f++){
			
			/*	
			try{
				feeders[s]= null;
			}
			catch(ArrayIndexOutOfBoundsException e){
				System.out.println(e);
			}
			*/	
			
			
			feeders[f] = new FeederCalves();
			
			String n = feeders[f].getName();
			String ear = feeders[f].getEarTag();	
			String b = feeders[f].getBreed();
			String c = feeders[f].getColor();
			String own = feeders[f].getOwner();
			String prod = feeders[f].getProductivity();
			String s = feeders[f].getSource();
			String hrn = feeders[f].getHorns();
			String hrmne = feeders[f].getHormones();
			String ab = feeders[f].getAntibiotics();
			double sw = feeders[f].getStartWeight();
			double fw = feeders[f].getFinishWeight();
			
			System.out.println("\n\n FEEDER CALVES");
			System.out.println("CALF NAME: " + n);
			System.out.println("EAR TAG: " + ear);
			System.out.println("BREED: " + b);
			System.out.println("COLOR: " + c);
			System.out.println("OWNER NAME: " + own);
			System.out.println("PRODUCTIVITY: " + prod);
			System.out.println("SOURCE: " + s);
			System.out.println("HORNS: " + hrn);
			System.out.println("HORMONES: " + hrmne);
			System.out.println("ANTIBIOTICS: " + ab);
			System.out.println("START WEIGHT: " + sw);
			System.out.println("FINISH WEIGHT: " + fw);
		}
	} //end feeders

	//INTANTIATE AN ARRAY MIXING THE SUBCLASSES
	
	/* FeederCalves[][] salebarn = new FeederCalves[3][3];
	 * for (int feed = 0; sb < 3; sb++){
	 * 		for (int breed = 0; breed m < 3; breed++){
	 * 
	 * 
	 * 	}
	 * }
	 */

	

	
	//Attempted using code suggestions found on StackOverflow
	// URL: http://stackoverflow.com/questions/2015538/arrays-with-different-datatypes-i-e-strings-and-integers-objectorientend
	
	//ArrayList<SuperCalf> mySupercalf = new ArrayList<SuperCalf>();
		//for (SuperCalf sc : mySupercalf){
			
	//	}

	
	//ArrayList<FeederCalves> myFeeders = new ArrayList<FeederCalves>();
	

	
	}		
}
