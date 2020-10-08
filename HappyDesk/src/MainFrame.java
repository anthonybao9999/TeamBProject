import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.SwingUtilities;
// Main Panel OF the project
public class MainFrame extends JFrame {
	
	private TextPanel textPanel;
	private JButton btn;
	private ToolBar toolbar;
	private FormPanel formPanel;
	private FormPanel formPanel2;
	
	public MainFrame() { // Create The main windows for the app
		super("Happy Desk");
		
		setLayout(new BorderLayout());
		
		toolbar = new ToolBar(); //Create a toolbar object
		textPanel = new TextPanel(); // Create a textPanel Object
		formPanel = new FormPanel(); // Create a formPanel Object
		
		// Create Event Listener
		
		toolbar.setStringListener(new StringListener() {
			public void textEmitted(String text) {
				System.out.println(text);
			}
		});
		
		
		add(formPanel, BorderLayout.WEST); // add formPanel and set to the left
		
		add(textPanel, BorderLayout.CENTER); // add text Panel and set to the center
		

		add(toolbar, BorderLayout.NORTH); // add tool bar and set to the top
		
		setSize(600, 500);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setVisible(true);
	}
	

}
