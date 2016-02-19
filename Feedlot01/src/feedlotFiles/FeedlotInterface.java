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
import javax.swing.JTextField;
import feedlotFiles.*;

public class FeedlotInterface {
	
	JButton ImageButton;
	JButton ArchiveButton;
	JButton UserInputButton;
	JButton FeederButton;
	JButton BreederButton;
	JButton BackgroundButton;
	JButton ExitButton;
	
	JFrame Fframe = new JFrame("Big Sky Ranch");
	String intro = "  Welcome to Big Sky Ranch, a third-generation ranching"
			+ " operation.\n  In addition to raising our own herds, we also provide custom feeding, "
			+ "and backgrounding services.\n\n  Please select from the following options for your report.\n ";
	

	// Constructor
	public FeedlotInterface(){
		// Create the interface window and set it up
		addFrameElements();			
		Fframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Fframe.setResizable(false);
		Fframe.pack();
		Fframe.setLocation(50, 250);
		Fframe.setVisible(true);
	}

	private void addFrameElements(){
		
		//Photo Panel at the top
		JPanel picture = new JPanel();
		picture.setLayout(new GridLayout (1, 1));
		
		ImageIcon topPicture = new ImageIcon(getClass().getResource("Ranch.jpg"));
		ImageButton = new JButton();
		ImageButton.setBackground(Color.GRAY);
		ImageButton.setPreferredSize(new Dimension (800,250));
		ImageButton.setIcon(topPicture);
		picture.add(ImageButton);
		
		// Greeting panel in the center
		JTextArea greeting = new JTextArea (intro);
		
		greeting.setBackground(Color.CYAN);
		greeting.setForeground(Color.BLACK);
		greeting.setFont(new Font("Monospace", Font.PLAIN, 16));
		greeting.setLineWrap(true);
		greeting.setWrapStyleWord(true);
		
		// Buttons at the bottom
		
		JPanel buttons = new JPanel();
		buttons.setLayout(new GridLayout(1,6));
		
		// BUTTONS WITH ACTION LISTENERS
		// Took advantage from sample code found on
		//javaprogrammingforums: 
		// http://www.javaprogrammingforums.com/java-swing-tutorials/278-how-add-actionlistener-jbutton-swing.html
		
		FeederButton = new JButton("FEEDER");
		FeederButton.addActionListener(new ActionListener(){
		
			public void actionPerformed(ActionEvent a){
				// Access the array symchro method/class
				//NaaviClass blue = new NaaviClass();
				//blue.displayXfile();
		}
	});
		BreederButton = new JButton("BREEDER");
		BreederButton.addActionListener(new ActionListener(){
		
			public void actionPerformed(ActionEvent b){
				// 
				BreederCalves herd = new BreederCalves();
				herd.ReportDisplay();
		}
	});
		
		BackgroundButton = new JButton("BACKGROUND");
		BackgroundButton.addActionListener(new ActionListener(){
		
			public void actionPerformed(ActionEvent c){
				// Access the array symchro method/class
				//NaaviClass blue = new NaaviClass();
				//blue.displayXfile();
		}
	});
		
			ArchiveButton = new JButton("ARCHIVE");
			ArchiveButton.addActionListener(new ActionListener(){
			
				public void actionPerformed(ActionEvent d){
					// Access the array symchro class
					//ConsoleClass runMe = new ConsoleClass();
					//runMe.SynchronizeArrays();
					FirstAttempt oldschool = new FirstAttempt();
					
				
			}
		});
		
			UserInputButton = new JButton("USER INPUT");
			UserInputButton.addActionListener(new ActionListener(){
				
				public void actionPerformed(ActionEvent e){
					//Access the user input class /method
					//
					//
				}
			});
			
			ExitButton = new JButton("EXIT");
			ExitButton.addActionListener(new ActionListener(){
				
				public void actionPerformed(ActionEvent f){
					//close the window
					//
					//
					
				}
			});
			
			buttons.add(FeederButton);
			buttons.add(BreederButton);
			buttons.add(BackgroundButton);		
			buttons.add(ArchiveButton);
			buttons.add(UserInputButton);
			buttons.add(ExitButton);
			
			//Main panel
			BorderLayout borderLayout = new BorderLayout();
			JPanel mainP = new JPanel(borderLayout);
			mainP.setSize(1024, 2048);
			mainP.add(picture, borderLayout.PAGE_START);
			mainP.add(greeting, borderLayout.CENTER);
			mainP.add(buttons, borderLayout.PAGE_END);
			
			Fframe.getContentPane().add(mainP);
	}
		
	
}
