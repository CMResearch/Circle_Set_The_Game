package feedlotFiles;

import javax.swing.ImageIcon;

public class BackgroundCalves extends SuperCalf{
	private String name;
	private String owner;
	private String earTag;
	private String source;
	private String hormones;
	private String antibiotics;
	private String diet;
	private double startWeight;
	private double finishWeight;
	private ImageIcon photo;
	
	// CONSTRUCTOR
	public BackgroundCalves(){
		earTag = "YELLOW";
		owner = "D-Bar-D Farms";
		source = "Contracted";
		hormones = "No Hormones";
		antibiotics = "LA-200 (as needed)";
		diet = "Grass / Hay / Crystalix / Silage";
		startWeight = 350.0;
		finishWeight = 750.0;		
		photo = new ImageIcon(getClass().getResource("Backgrounders.jpg"));
	}
	
	
	// GET METHODS (Specific to this subclass)
	@Override
	public String getEarTag(){
		return(earTag);
	}
	@Override
	public String getSource(){
		return(source);
	}
	
	@Override
	public String getHormones(){
		return(hormones);
	}
	
	@Override
	public String getAntibiotics(){
		return(antibiotics);
	}
	
	@Override
	public String getDiet(){
		return(diet);
	}
	 @Override
	 public ImageIcon getPhoto(){
		 return(photo);
	 }
}
