package fleetFiles;

public class KWaero extends Tractor{

	private String make;
	private String model;
	private double averageMPG;
	private double maintCost;
	private String color;
	private String licenseNo;
	private String driver;
	
	public KWaero(){
		
		make = "Kenworth";
		model = "T680";
		averageMPG = 7.0;
		maintCost = .065;
		color = "White";
		licenseNo = "NEW";
		driver = "Unassigned";
	}
	public KWaero (String tag){
		make = "Kenworth";
		model = "T680";
		averageMPG = 7.0;
		maintCost = .055;
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
