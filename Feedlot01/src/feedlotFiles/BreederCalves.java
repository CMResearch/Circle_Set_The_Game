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
	
	// CONSTRUCTOR
	public BreederCalves(){
		earTag = "Breeder GREEN";
		source = "Homestead";
		hormones = "No Hormones";
		antibiotics = "Baytril (as needed)";
		diet = "Grass / Crystalix / Protein & Silage";
		photo = new ImageIcon(getClass().getResource("Breeders.jpg"));
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
