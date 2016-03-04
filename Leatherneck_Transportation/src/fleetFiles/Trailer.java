package fleetFiles;


//SUPERCLASS for Trailers

public class Trailer {

	private String tmake;
	private String tmodel;
	private String ttype;
	private double length;
	private double dragAdjustment;
	
	//CONSTRUCTOR
	public Trailer(){
		
		tmake = "Great Dane";
		tmodel = "Champion CP";
		ttype = "Box";
		length = 53;
		dragAdjustment = .89;
	
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
