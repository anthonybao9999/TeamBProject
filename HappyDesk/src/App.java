import javax.swing.JFrame;
import javax.swing.SwingUtilities;

// Create a main class APP
public class App {

	public static void main(String[] args) {
		
		SwingUtilities.invokeLater(new Runnable() {

			public void run() {
				
				new MainFrame();
				JFrame frame = new JFrame("Happy Desk");

			}
			
		});
		
		

	}

}
