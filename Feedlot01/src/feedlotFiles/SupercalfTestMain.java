package feedlotFiles;

public class SupercalfTestMain {

	public static void main(String[] args) {
		
		// First, test the Super Class
		/*
		SuperCalf myC = new SuperCalf();
		
		String n = myC.getName();
		String ear = myC.getEarTag();		
		String b = myC.getBreed();
		String c = myC.getColor();
		String own = myC.getOwner();
		String prod = myC.getProductivity();
		String s = myC.getSource();
		String hrn = myC.getHorns();
		String hrmne = myC.getHormones();
		String ab = myC.getAntibiotics();
		double sw = myC.getStartWeight();
		double fw = myC.getFinishWeight();
		
		
		System.out.println("CALF NAME: " + n);
		System.out.println("EAR TAG: " + ear);
		System.out.println("BREED: " + b);
		System.out.println("COLOR: " + c);
		System.out.println("OWNER: " + own);
		System.out.println("PRODUCTIVITY: " + prod);
		System.out.println("SOURCE: " + s);
		System.out.println("HORNS: " + hrn);
		System.out.println("HORMONES: " + hrmne);
		System.out.println("ANTIBIOTICS: " + ab);
		System.out.println("START WEIGHT: " + sw);
		System.out.println("FINISH WEIGHT: " + fw);
		*/

		//Now to test the second contructor, 
		// and the ability to set values using the set methods
		SuperCalf myC2 = new SuperCalf("Bodacious", "Ted Turner"); // Setting Calf Name and Owner
		myC2.setBreed("Charolais");
		myC2.setColor("Blond");
		
		String nombre = myC2.getName();
		String eart = myC2.getEarTag();
		String brd = myC2.getBreed();
		String clr = myC2.getColor();
		String ownr = myC2.getOwner();
		String prodt = myC2.getProductivity();
		String srce = myC2.getSource();
		String hrns = myC2.getHorns();
		String hrmnes = myC2.getHormones();
		String anb = myC2.getAntibiotics();
		double stw = myC2.getStartWeight();
		double fnw = myC2.getFinishWeight();
		
		
		System.out.println("\n\n SECOND CONSTRUCTOR");		
		System.out.println("CALF NAME: " + nombre);
		System.out.println("BREED: " + brd);
		System.out.println("COLOR" + clr);
		System.out.println("OWNER NAME: " + ownr);
		System.out.println("PRODUCTIVITY: " + prodt);
		System.out.println("SOURCE: " + srce);
		System.out.println("HORNS: " + hrns);
		System.out.println("HORMONES: " + hrmnes);
		System.out.println("ANTIBIOTICS: " + anb);
		System.out.println("START WEIGHT: " + stw);
		System.out.println("FINISH WEIGHT: " + fnw);

		FeederCalves myF = new FeederCalves();
		
		String n = myF.getName();
		String ear = myF.getEarTag();	
		String b = myF.getBreed();
		String c = myF.getColor();
		String own = myF.getOwner();
		String prod = myF.getProductivity();
		String s = myF.getSource();
		String hrn = myF.getHorns();
		String hrmne = myF.getHormones();
		String ab = myF.getAntibiotics();
		double sw = myF.getStartWeight();
		double fw = myF.getFinishWeight();
		
		System.out.println("\n\n FEEDER CALVES");
		System.out.println(n);
		System.out.println(ear);
		System.out.println(b);
		System.out.println(c);
		System.out.println(own);
		System.out.println(prod);
		System.out.println(s);
		System.out.println(hrn);
		System.out.println(hrmne);
		System.out.println(ab);
		System.out.println(sw);
		System.out.println(fw);
	}

}
