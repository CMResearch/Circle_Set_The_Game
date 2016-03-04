package fleetFiles;

public class StepDeckTrailer extends Trailer{

	private String tmake;
	private String tmodel;
	private String ttype;
	private double length;
	private double dragAdjustment;
	
	public StepDeckTrailer(){
		tmake = "Great Dane";
		tmodel = "Freedom SE";
		ttype = "Step Deck Flatbed";
		length = 53;
		dragAdjustment = .99;
	}
	
	//GET METHODS
	
	public String getTrailerMake(){
		return(tmake);
	}
	
	public String getTrailerModel(){
		return(tmodel);
	}
	
	public String getTrailerType(){
		return(ttype);
	}
	
	public double getTrailerlength(){
		return(length);
	}
	
	public double getTrailerDrag(){
		return(dragAdjustment);
	}
	
}
