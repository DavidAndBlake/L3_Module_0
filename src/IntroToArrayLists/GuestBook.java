package IntroToArrayLists;

import java.awt.GridLayout;
import java.awt.LayoutManager;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class GuestBook {
	// Create a GUI with two buttons. One button reads "Add Name" and the other
	// button reads "View Names".
	JFrame frame = new JFrame();
	JButton buttonToAddName = new JButton();
	JButton buttonToViewName = new JButton();
	JPanel panel = new JPanel();
public static void main(String[]args)
{
	GuestBook g = new GuestBook();
	g.getGoing();
}
	public void getGoing() {
		frame.setVisible(true);
		frame.add(panel);
		panel.add(buttonToAddName);
		panel.add(buttonToViewName);
		buttonToAddName.setText("Add Name");
		buttonToViewName.setText("View Name");
		panel.setLayout(new GridLayout());
		frame.pack();
		System.out.println("This is getting accessed");
	}
	// When the add name button is clicked, display an input dialog that asks the
	// user to enter a name. Add
	// that name to an ArrayList. When the "View Names" button is clicked, display a
	// message dialog that displays
	// all the names added to the list. Format the list as follows:
	// Guest #1: Bob Banders
	// Guest #2: Sandy Summers
	// Guest #3: Greg Ganders
	// Guest #4: Donny Doners
}
