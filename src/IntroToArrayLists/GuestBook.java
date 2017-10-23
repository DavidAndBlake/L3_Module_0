package IntroToArrayLists;

import java.awt.GridLayout;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.plaf.ActionMapUIResource;

public class GuestBook implements ActionListener{
	// Create a GUI with two buttons. One button reads "Add Name" and the other
	// button reads "View Names".
	JFrame frame = new JFrame();
	JButton buttonToAddName = new JButton();
	JButton buttonToViewName = new JButton();
	JPanel panel = new JPanel();
	int nameNumber = 1;
	ArrayList<String> namesList = new ArrayList<String>();
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
		buttonToAddName.addActionListener(this);
		buttonToViewName.addActionListener(this);
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		
	}
	// When the "View Names" button is clicked, display a
	// message dialog that displays
	// all the names added to the list. Format the list as follows:
	// Guest #1: Bob Banders
	// Guest #2: Sandy Summers
	// Guest #3: Greg Ganders
	// Guest #4: Donny Doners
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		if (e.getSource() == buttonToAddName) {
			String name = JOptionPane.showInputDialog("Enter a name");
			namesList.add(name);
			nameNumber++;
		}
		if (e.getSource() == buttonToViewName) {
			String actualNamesList = "";
			for (int i = 0; i < namesList.size(); i++) {
				actualNamesList += "Guest #" + (i+1) + ": " + namesList.get(i) + "\n";
			}
			JOptionPane.showMessageDialog(null, actualNamesList);
		}
	}
}
