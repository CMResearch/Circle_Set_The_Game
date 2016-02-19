package feedlotFiles;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


//Super class for calves, as part of the Feed Lot concept
//Unless otherwise indicated, all code is original,
//Created by Steve Creigh as part of 
//CS-120-A-2016P Data Structures and Program Design
//February 2016, Carroll College, Helena MT


public class SuperCalf {
	
	// DECLARE THE VARIABLES
	private String type;
	private String name; //Calf name
	private String earTag;
	private String breed;
	private String color; 
	private String owner; //Name of the owner
	private String productivity; //Productivity level (low, Average, High)
	private String source; // where the calf came from:  home or state where purchased
	private String horns;
	private String hormones;
	private String diet;
	private String antibiotics;
	private double startWeight;
	private double finishWeight;
	private ImageIcon photo;
	private String info;
	
	private JButton cpicButton;
	private JFrame ReportFrame = new JFrame("Report");
	private BorderLayout borderLayout = new BorderLayout();
	private JPanel mainPanel = new JPanel(borderLayout);
	
	// CONSTRUCTORS
	
	public SuperCalf(){
		type = "Unspecified Type";
		name = "Unregistered";
		earTag = "N/A";
		breed = "n/a";
		color = "n/a";
		owner = "n/a";
		productivity = "n/a";
		source = "n/a";
		horns = "No horns";
		hormones = "n/a";
		diet = "n/a";		
		antibiotics = "No meds";
		startWeight = 0.0;
		finishWeight = 0.0;
		info = "no info";
		photo = new ImageIcon(getClass().getResource("Cow.jpg"));
		}
	
	public SuperCalf(String n, String o){ // n for name, o for owner
		type = "Unspecified Type";
		name = n;
		earTag = "None";
		breed = "Anyone's Guess";
		color = "Polkadot";
		owner = o;
		productivity = "Unspecified";
		source = "Home";
		horns = "No horns";
		hormones = "No hormones";
		antibiotics = "Unmedicated";
		startWeight = 0.0;
		finishWeight = 0.0;	
		info = "";
		photo = new ImageIcon(getClass().getResource("Cow.jpg"));
	}	
		
	//GET METHODS
	public String getName(){
		return(name);
	}
	
	public String getEarTag(){
		return(earTag);
	}
	
	public String getBreed(){
		return(breed);
	}
	
	public String getColor(){
		return(color);
	}
	
	public String getOwner(){
		return(owner);
	}
	public String getProductivity(){
		return(productivity);
	}
	public String getSource(){
		return(source);
	}
	public String getHorns(){
		return(horns);
	}
	public String getHormones(){
		return(hormones);
	}
	
	public String getDiet(){
		return(diet);
	}
	
	public String getAntibiotics(){
		return(antibiotics);
	}
	public double getStartWeight(){
		return(startWeight);
	}
	public double getFinishWeight(){
		return(finishWeight);
	}
	
	public ImageIcon getPhoto(){
		return (photo);
	}
	public String getInfo(){
		return(info);
	}
	
	//SET METHODS
	public void setName(String n){
		color = n;
		return;
	}
	public void setEarTag(String et){
		earTag = et;
		return;
	}
	
	public void setBreed(String b){
		breed = b;
		return;
	}
	public void setColor(String c){
		color = c;
		return;
	}
		
	public void setOwner(String own){
		owner = own;
		return;
	}
	public void setProductivity(String prod){
		productivity = prod;
		return;
	}
	public void setSource(String s){
		source = s;
		return;
	}
	public void setHorns(String hrn){
		horns = hrn;
		return;
	}
	public void setHormones(String hrm){
		hormones = hrm;
		return;
	}
	public void setDiet(String dt){
		diet = dt;
		return;
	}
	public void setAntibiotics(String antb){
		antibiotics = antb;
		return;
	}
	public void setStartWeight(double stw){
		startWeight = stw;
		return;
	}
	public void setFinishWeight(double fnw){
		finishWeight = fnw;
		return;
	}

	public void setPhoto(ImageIcon pic){
		photo = pic;
		return;
	}
	
	//Method for displaying information
	public void displayReport(){
		ReportFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ReportFrame.setResizable(false);
		assembleFrame();		
		
		ReportFrame.pack();// display the window
		ReportFrame.setLocation(800, 250);
		ReportFrame.setVisible(true);
		
	}
	//Method to assemble frame components
	public void assembleFrame(){
		
		//Image Panel
		JPanel cpic = new JPanel();
		cpic.setLayout(new GridLayout(1, 1));
		cpicButton = new JButton();
		cpicButton.setBackground(Color.BLACK);
		cpicButton.setPreferredSize(new Dimension(700, 200));
		cpicButton.setIcon(this.getPhoto());
		cpic.add(cpicButton);

		
		//Text Pane
			JTextArea textArea = new JTextArea (this.getInfo());

			textArea.setBackground(Color.BLACK);
			textArea.setForeground(Color.CYAN);
			textArea.setFont(new Font("Monospace", Font.PLAIN, 16));
			textArea.setLineWrap(true);
			textArea.setWrapStyleWord(true);
			
			//Main Panel
			mainPanel.add(cpic, borderLayout.PAGE_START);
			mainPanel.add(textArea, borderLayout.CENTER);
			//mainPanel.add(entry, borderLayout.EAST);
			

			ReportFrame.getContentPane().add(mainPanel);
}
	

}
