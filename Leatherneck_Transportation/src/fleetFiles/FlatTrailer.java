package fleetFiles;

public class FlatTrailer extends Trailer {

	private String tmake;
	private String tmodel;
	private String ttype;
	private double length;
	private double dragAdjustment;
	
	public FlatTrailer(){
		tmake = "Great Dane";
		tmodel = "Freedom SE";
		ttype = "Spread-axle Flat";
		length = 50;
		dragAdjustment = .97;
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
