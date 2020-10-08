import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

// Create Toolbar class, with include add and delete Button
public class ToolBar extends JPanel implements ActionListener  {
	
	private JButton addButton;
	private JButton deleteButton;
	
	private StringListener textListener;
	
	
	
	public ToolBar() {
		addButton = new JButton("Add");
		deleteButton = new JButton("Delete");
		
		
		addButton.addActionListener(this);
		deleteButton.addActionListener(this);
		
		setLayout(new FlowLayout(FlowLayout.LEFT));
		add(addButton);
		add(deleteButton);
		
	}

	
	public void setStringListener(StringListener listener) {
		this.textListener = listener;
	}
	// Event Handler for click button
	@Override
	public void actionPerformed(ActionEvent e) {
		JButton clicked = (JButton)e.getSource();
		
		if(clicked == addButton) {
			if(textListener != null) {
				textListener.textEmitted("Added\n");
			}
		} else if(clicked == deleteButton) {
			if(textListener != null) {
				textListener.textEmitted("Deleted\n");
			}
		}
		
	}
}
