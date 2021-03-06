package IntroToHashMaps;

import java.awt.List;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class LogSearch implements ActionListener {
	HashMap<Integer, String> hashbrown = new HashMap<Integer, String>();
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton button1 = new JButton();
	JButton button2 = new JButton();
	JButton button3 = new JButton();
	int IDinteger;
	int widthOfScreen = java.awt.Toolkit.getDefaultToolkit().getScreenSize().width;
	int heightOfScreen = java.awt.Toolkit.getDefaultToolkit().getScreenSize().height;

	public static void main(String[] args) {
		LogSearch Log = new LogSearch();
		Log.gui();
	}

	public void gui() {
		frame.setLocation(widthOfScreen / 2, heightOfScreen / 2);
		frame.setVisible(true);
		frame.add(panel);
		panel.add(button1);
		panel.add(button2);
		panel.add(button3);
		button1.setText("Add Entry");
		button2.setText("Seach ID");
		button3.setText("View List");
		button1.addActionListener((ActionListener) this);
		button2.addActionListener((ActionListener) this);
		button3.addActionListener((ActionListener) this);
		frame.pack();
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == button1) {
			String enterID = JOptionPane.showInputDialog("Please enter an ID number");
			IDinteger = Integer.parseInt(enterID);
			String enterName = JOptionPane.showInputDialog("Enter a name");
			hashbrown.put(IDinteger, enterName);
		}
		if (e.getSource() == button2) {
			String searchID = JOptionPane.showInputDialog("Enter an ID to search");
			JOptionPane.showMessageDialog(null, hashbrown.get(Integer.parseInt(searchID)));
		}
		if (e.getSource() == button3) {
			String finalString="";
			
			Collection<Integer>list = hashbrown.keySet();
			for (Integer each: list) {
				finalString += "id:" + each + " = " + "name " + hashbrown.get(each) + "  ";
			}
			JOptionPane.showMessageDialog(null, finalString);
		}
	}

	/*
	 * Crate a HashMap of Integers for the keys and Strings for the values. Create a
	 * GUI with three buttons. Button 1: Add Entry When this button is clicked, use
	 * an input dialog to ask the user to enter an ID number. After an ID is
	 * entered, use another input dialog to ask the user to enter a name. Add this
	 * information as a new entry to your HashMap.
	 * 
	 * Button 2: Search by ID When this button is clicked, use an input dialog to
	 * ask the user to enter an ID number. If that ID exists, display that name to
	 * the user. Otherwise, tell the user that that entry does not exist.
	 * 
	 * Button 3: View List When this button is clicked, display the entire list in a
	 * message dialog in the following format: ID: 123 Name: Harry Howard ID: 245
	 * Name: Polly Powers ID: 433 Name: Oliver Ortega etc...
	 * 
	 * When this is complete, add a fourth button to your window. Button 4: Remove
	 * Entry When this button is clicked, prompt the user to enter an ID using an
	 * input dialog. If this ID exists in the HashMap, remove it. Otherwise, notify
	 * the user that the ID is not in the list.
	 *
	 */
}
