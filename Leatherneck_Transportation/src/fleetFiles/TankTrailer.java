package fleetFiles;

public class TankTrailer extends Trailer {

	
	private String tmake;
	private String tmodel;
	private String ttype;
	private double length;
	private double dragAdjustment;
	
	public TankTrailer(){
		tmake = "Polar";
		tmodel = "Stainless";
		ttype = "Tanker";
		length = 50;
		dragAdjustment = .95;
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
