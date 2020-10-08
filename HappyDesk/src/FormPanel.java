import java.awt.*;


import javax.swing.*;
import javax.swing.border.Border;

//Create a FromPanel class from JPanel Library
public class FormPanel extends JPanel{
	
	private JLabel nameLabel; // Create Label Instance for the name
	private JLabel occupationLabel; // Create label Instance for Occupation
	private	JTextField nameField;	// Create Instance Object
	private JTextField occupationField; 
	private JButton submitBtn; //Create Instance Object
	
	public FormPanel() {
	// Set size for Form Panel
		Dimension dim = getPreferredSize();
		dim.width = 250;
		setPreferredSize(dim);
		
		nameLabel = new JLabel("Full name:"); // create nameLabel Object
		occupationLabel = new JLabel("Occupation:"); //create Occupation Object
		nameField = new JTextField(10); // create nameField object with length of 10 
		occupationField = new JTextField(10); 
		
		submitBtn = new JButton("Submit");
		
		
		Border innerBorder = BorderFactory.createTitledBorder("Info"); // Create Boder for the Form panel
		Border outerBorder = BorderFactory.createEmptyBorder(5, 5, 5, 5); // Set layout for the border
		setBorder(BorderFactory.createCompoundBorder(outerBorder, innerBorder));
		
		
		setLayout(new GridBagLayout());
		
		GridBagConstraints gc = new GridBagConstraints();
		
		
// Set Layout for part
		////////////////First Row////////////
		
		gc.weightx = 1;
		gc.weighty = 0.1;
		
		gc.gridx = 0;
		gc.gridy = 0;
		gc.fill = GridBagConstraints.NONE;
		gc.anchor = GridBagConstraints.LINE_END;
		gc.insets = new Insets(0, 0, 0, 5);
		add(nameLabel, gc);
		
		gc.gridx = 1;
		gc.gridy = 0;
		gc.insets = new Insets(0, 0, 0, 0);
		gc.anchor = GridBagConstraints.LINE_START;
		add(nameField, gc);
		
		////////////////Second Row////////////
		
		gc.weightx = 1;
		gc.weighty = 0.1;
		
		gc.gridy = 1;
		gc.gridx = 0;
		gc.anchor = GridBagConstraints.LINE_END;
		gc.insets = new Insets(0, 0, 0, 5);		
		add(occupationLabel, gc);
		
		gc.gridy = 1;
		gc.gridx = 1;
		gc.insets = new Insets(0, 0, 0, 0);
		gc.anchor = GridBagConstraints.LINE_START;
		add(occupationField, gc);
		
		////////////////Third Row////////////

		gc.weightx = 1;
		gc.weighty = 1.0;
		
		gc.gridy = 2;
		gc.gridx = 1;
		gc.anchor = GridBagConstraints.FIRST_LINE_START;
		add(submitBtn, gc);
		
		
		
		
	}

}
