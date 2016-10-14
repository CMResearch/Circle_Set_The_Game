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


public class ReportDisplay {
	
	
	
	JButton ImageButton;
	
	
	JFrame reportFrame = new JFrame("REPORT");
	String info = "This is the feeder cattle report\n\n\n\nBlah blah....\n\n\nad infinitem.";
	
	public ReportDisplay(){
		
		
		
		addFrameComponents();
		reportFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		reportFrame.setResizable(false);
		reportFrame.setSize(600,800);
		reportFrame.pack();
		reportFrame.setLocationRelativeTo(null);
		reportFrame.setVisible(true);
		}
	
	private void addFrameComponents(){
		
		//Photo Panel at the top
				JPanel picture = new JPanel();
				picture.setLayout(new GridLayout (1, 1));
				
				ImageIcon upperPicture = new ImageIcon(getClass().getResource("Feeders.jpg"));
				ImageButton = new JButton();
				ImageButton.setBackground(Color.GRAY);
				ImageButton.setPreferredSize(new Dimension (800,250));
				ImageButton.setIcon(upperPicture);
				picture.add(ImageButton);
				
				// Greeting panel in the center
				JTextArea greeting = new JTextArea(info);
				
				greeting.setBackground(Color.CYAN);
				greeting.setForeground(Color.BLACK);
				greeting.setFont(new Font("Monospace", Font.PLAIN, 16));
				greeting.setLineWrap(true);
				greeting.setWrapStyleWord(true);
				
				//Main Panel
				BorderLayout borderLayout = new BorderLayout();
				JPanel mainP = new JPanel(borderLayout);
				mainP.setSize(800, 800);;
				mainP.add(picture, borderLayout.PAGE_START);
				mainP.add(greeting, borderLayout.CENTER);
				
				reportFrame.getContentPane().add(mainP);

	}
	public void getPicture(){
		return(photo);
	}
	
	
}
