package feedlotFiles;

import javax.swing.ImageIcon;

public class BreederCalves extends SuperCalf {
	private String name;
	private String earTag;
	private String source;
	private String hormones;
	private String antibiotics;
	private String diet;
	private ImageIcon photo;
	private String info;
	
	// CONSTRUCTOR
	public BreederCalves(){
		earTag = "Breeder GREEN";
		source = "Homestead";
		hormones = "No Hormones";
		antibiotics = "Baytril (as needed)";
		diet = "Grass / Crystalix / Protein & Silage";
		photo = new ImageIcon(getClass().getResource("Breeders.jpg"));
		info = "\n\n\nThis page under contruction.  Please try back again soon.\n\n\n";
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
	 
	 @Override
	 public String getInfo(){
		 return(info);
	 }

	
}
