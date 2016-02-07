package feedlotFiles;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;


public class FeedlotInterface {
	JButton ImageButton;
	JButton ArchiveButton;
	JButton UserInputButton;
	JButton ExitButton;
	
	JFrame Fframe = new JFrame("Big Sky Ranch");
	String instruct = " Welcome to Big Sky Ranch.\nWe are a third-generation ranching"
			+ " operation.\n\nIn addition to raising our own herds, we also provide custom feeding, "
			+ "and backgrounding services.\n\nPlease select from the following options for your report. ";
	

	// Constructor
	public FeedlotInterface(){
		// Create the interface window and set it up
		addFrameComps();			
		Fframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Fframe.setResizable(false);
		Fframe.pack();
		Fframe.setLocation(50, 250);
		Fframe.setVisible(true);
	}

		
	private void addFrameComps(){
		// set layout

		
		//Image Panel
		JPanel Image = new JPanel();
		Image.setLayout(new GridLayout(1, 1));
		
		//ImageIcon header = new ImageIcon(getClass().getResource("Ranch.jpg"));			
		ImageIcon header = new ImageIcon(getClass().getResource("Ranch.jpg"));
		ImageButton = new JButton();
		ImageButton.setBackground(Color.GREEN);
		ImageButton.setForeground(Color.BLACK);
		ImageButton.setPreferredSize(new Dimension(720, 350));
		ImageButton.setIcon(header);
		Image.add(ImageButton);
		
		
		//INstructions Panel
		JTextArea instructions = new JTextArea (instruct);

		instructions.setBackground(Color.CYAN);
		instructions.setForeground(Color.WHITE);
		instructions.setFont(new Font("Monospace", Font.PLAIN, 16));
		instructions.setLineWrap(true);
		instructions.setWrapStyleWord(true);
		
		//Button Headings Panel
		JPanel headliner = new JPanel();
		headliner.setLayout(new GridLayout(1, 2));
		
		// BUTTONS WITH ACTION LISTENERS
		// Took advantage from sample code found on
		//javaprogrammingforums: 
		// http://www.javaprogrammingforums.com/java-swing-tutorials/278-how-add-actionlistener-jbutton-swing.html
			 ArchiveButton = new JButton("ARCHIVE");
			 /*ArchiveButton.addActionListener(new ActionListener(){
			
	            public void actionPerformed(ActionEvent e){
	            
	                //Execute when button is pressed
	        		NaaviClass blue = new NaaviClass();
	        		blue.displayXfile();
	            
	        });*/
				
			UserInputButton = new JButton("USER INPUT");
			/*UserInputButton.addActionListener(new ActionListener(){
				
	            public void actionPerformed(ActionEvent e){
	            
	                //Execute when button is pressed
	        		ArachnidClass tiger = new ArachnidClass();
	        		tiger.displayXfile();
	            }
	        });*/
			
			ExitButton = new JButton("EXIT");
						
			
			
						
		
		
		headliner.add(ArchiveButton);
		headliner.add(UserInputButton);

		headliner.add(ExitButton);
		
		
	
		
		//Main Panel
		BorderLayout FborderLayout = new BorderLayout();
		
		JPanel mainPanel = new JPanel(FborderLayout);
		
		mainPanel.setSize(1024, 1024);
		mainPanel.add(Image, FborderLayout.PAGE_START);
		mainPanel.add(instructions, FborderLayout.CENTER);
		mainPanel.add(headliner, FborderLayout.PAGE_END);
		//mainPanel.add(characteristics, borderLayout.PAGE_END);
		//mainPanel.add(entry, borderLayout.EAST);
		
		
		Fframe.getContentPane().add(mainPanel);
					
	}
	
	
	
	
	
}
