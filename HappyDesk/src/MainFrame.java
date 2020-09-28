import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.SwingUtilities;

public class MainFrame extends JFrame {
	
	private TextPanel textPanel;
	private JButton btn;
	private ToolBar toolbar;
	private FormPanel formPanel;
	
	public MainFrame() {
		super("Happy Desk");
		
		setLayout(new BorderLayout());
		
		toolbar = new ToolBar();
		textPanel = new TextPanel();
		formPanel = new FormPanel();
	
		
		
		
		toolbar.setStringListener(new StringListener() {
			public void textEmitted(String text) {
				System.out.println(text);
			}
		});
		
		
		add(formPanel, BorderLayout.WEST);
		
		add(textPanel, BorderLayout.CENTER);

		add(toolbar, BorderLayout.NORTH);
		
		setSize(600, 500);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setVisible(true);
	}
	

}
