package fleetFiles;


//SUPERCLASS for tractors

public class Tractor {

	private String make;
	private String model;
	private double averageMPG;
	private double maintCost;
	private String color;
	private String licenseNo;
	private String driver;
	
	//default constructor
	public Tractor(){
		make = "Kenworth";
		model = "W900";
		averageMPG = 5.5;
		maintCost = .062;
		color = "White";
		licenseNo = "NEW";
		driver = "Unassigned";
		
	}
	
	public Tractor (String mk, String mod, double mpg, double maint, String clr, String lic, String drvr){
		make = mk;
		model = mod;
		averageMPG = mpg;
		maintCost = maint;
		color = clr;
		licenseNo = lic;
		driver = drvr;
	}
	public Tractor (String tag){
		make = "Kenworth";
		model = "W900";
		averageMPG = 5.5;
		maintCost = .062;
		color = "White";
		licenseNo = tag;
		driver = "Unassigned";
	}
	
	//GET METHODS
	
	public String getMake(){
		return(make);
	}
	
	public String getModel(){
		return(model);
	}
	public double getAverageMPG(){
		return(averageMPG);
	}
	public double getMaintenanceCost(){
		return(maintCost);
	}
	
	public String getColor(){
		return(color);
	}
	
	public String getLicenseNumber(){
		return(licenseNo);
	}
	
	public String getDriver(){
		return(driver);
	}
	
	//SET METHODS
	
}
