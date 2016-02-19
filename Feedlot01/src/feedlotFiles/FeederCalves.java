package feedlotFiles;

import javax.swing.ImageIcon;

public class FeederCalves extends SuperCalf{

	private String name;
	private String earTag;
	private String hormones;
	private String antibiotics;
	private String diet;
	private double startWeight;
	private double finishWeight;
	private ImageIcon photo;
	private String info;
	
	// CONSTRUCTOR
	public FeederCalves(){
		earTag = " Feeder BLUE";
		hormones = "Ral-Gro";
		antibiotics = "Nu-Floor / LA-200";
		diet = "Grain + Protein Supplement";
		startWeight = 175.0;
		finishWeight = 550.0;
		photo = new ImageIcon(getClass().getResource("Feeders.jpg"));
		info = "\n\n\nThis page under contruction.  Please try back again soon.\n\n\n";
	}
	
	// GET METHODS (Specific to this subclass)
	@Override
	public String getEarTag(){
		return(earTag);
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
	public double getStartWeight(){
		return(startWeight);
	}
	
	@Override
	public double getFinishWeight(){
		return(finishWeight);
	}
	
	 @Override
	 public ImageIcon getPhoto(){
		 return(photo);
	 }
	
}
