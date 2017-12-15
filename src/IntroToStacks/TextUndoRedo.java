package IntroToStacks;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Stack;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class TextUndoRedo implements KeyListener {
	Stack<String> deleted = new Stack<String>();
	public TextUndoRedo() {
		frame.add(panel);
		panel.add(label);
		frame.setVisible(true);
		frame.addKeyListener(this);
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
	}

	/*
	 * Create a JFrame with a JPanel and a JLabel.
	 * 
	 * Every time a key is pressed, add that character to the JLabel. It should look
	 * like a basic text editor.
	 * 
	 * Make it so that every time the BACKSPACE key is pressed, the last character
	 * is erased from the JLabel. Save that deleted character onto a Stack of
	 * Characters.
	 * 
	 * Choose a key to be the Undo key. Make it so that when that key is pressed,
	 * the top Character is popped off the Stack and added back to the JLabel.
	 * 
	 */
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JLabel label = new JLabel();

	public static void main(String[] args) {
		new TextUndoRedo();

	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		frame.pack();
		label.setText(label.getText() + e.getKeyChar());
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		deleted.add(label.getText().substring(0, label.getText().length()-2));
		if (e.getKeyCode() == KeyEvent.VK_BACK_SPACE) {
			label.setText(label.getText().substring(0, label.getText().length()-2));
			System.out.println(deleted);
			// String newText = label.getText();
			// newText = newText.substring(0, newTextLength()-1);
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub

	}

}
