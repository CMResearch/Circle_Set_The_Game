package fleetFiles;

public class FLaero extends Tractor{

	private String make;
	private String model;
	private double averageMPG;
	private double maintCost;
	private String color;
	private String licenseNo;
	private String driver;
	
	//DEFAULT CONSTRUCTOR
	public FLaero (){
		
		make = "Freightliner";
		model = "Cascadia";
		averageMPG = 6.25;
		maintCost = .078;
		color = "White";
		licenseNo = "NEW";
		driver = "Unassigned";
	}
	
	//constructor receiving license number
	public FLaero (String tag){
		make = "Freightliner";
		model = "Cascadia";
		averageMPG = 6.25;
		maintCost = .078;
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
