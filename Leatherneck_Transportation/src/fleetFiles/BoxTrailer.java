package fleetFiles;

public class BoxTrailer extends Trailer{

	private String tmake;
	private String tmodel;
	private String ttype;
	private double length;
	private double dragAdjustment;
	
	public BoxTrailer(){
		
		tmake = "Great Dane";
		tmodel = "Champion CP";
		ttype = "Box";
		length = 53;
		dragAdjustment = .11; // could also be .89 and straight multiply
		
	}
	
}
