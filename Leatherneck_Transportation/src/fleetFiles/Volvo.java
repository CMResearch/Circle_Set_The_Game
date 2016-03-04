package fleetFiles;

public class Volvo extends Tractor {

	private String make;
	private String model;
	private double averageMPG;
	private double maintCost;
	private String color;
	private String licenseNo;
	private String driver;
	
	//default constructor
	public Volvo(){
		make = "Volvo";
		model = "780";
		averageMPG = 6.5;
		maintCost = .075;
		color = "White";
		licenseNo = "NEW";
		driver = "Unassigned";
		
	}
	//constructor receiving license number
	public Volvo (String tag){
		make = "Volvo";
		model = "780";
		averageMPG = 6.5;
		maintCost = .075;
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
}
