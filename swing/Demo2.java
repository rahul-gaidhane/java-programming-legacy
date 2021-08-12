import javax.swing.*;

import java.awt.event.*;

public class Demo2 {

	JFrame myFrame;
	JPanel myPanel;
	JButton myButton;
	JTextField myTextField;
	JTextArea myTextArea;
	int buttonClicked = 0;
//	JTextArea newtextarea;
		
	public static void main(String[] args) {
		JFrame newframe = new JFrame("this is my new frame");
		newframe.setSize(400,400);
		newframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		newframe.setVisible(true);
	
		JTextArea newtextarea = new JTextArea(15,20);
		ListenForMouse mlistner = new ListenForMouse();
		mlistner.addMouseListner(mlistner);
		newframe.add(newtextarea);

		new Demo2();
		
	}
	public Demo2() {
		myFrame = new JFrame("This is my Frame");
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		myFrame.setSize(400,400);
		myPanel = new JPanel();

		myButton = new JButton("kick me!");
		ListenForButton lButton = new ListenForButton();
		myButton.addActionListener(lButton);
		myPanel.add(myButton);		

		myTextField = new JTextField("should i type here ?", 25);
		ListenForKeys lKeys = new ListenForKeys();
		myTextField.addKeyListener(lKeys);
		myPanel.add(myTextField);

		myTextArea = new JTextArea(15,20);
		myTextArea.setText("trace...");
		myTextArea.setLineWrap(true);
		myTextArea.setWrapStyleWord(true);

		JScrollPane myScrool = new JScrollPane(myTextArea, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		myPanel.add(myScrool);
 
		myFrame.add(myPanel);

		ListenForWindow lWindow = new ListenForWindow();
		myFrame.addWindowListener(lWindow);
		
		ListenForMouse lMouse = new ListenForMouse();
		myPanel.addMouseListener(lMouse);		
		 
		myFrame.setVisible(true);		
	}
	
	private class ListenForButton implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			if(e.getSource() == myButton) {
				buttonClicked++;
				myTextArea.append("Button clicked" + buttonClicked + " times\n");
			}
				
		}
	}
	
	private class ListenForKeys implements KeyListener {
		public void keyTyped(KeyEvent e) {
			myTextArea.append("Key Hit : " + e.getKeyChar() + "\n");
		}

		public void keyPressed(KeyEvent e) {}
	
		public void keyReleased(KeyEvent e) {}
	}

	private class ListenForMouse implements MouseListener {
		public void mouseClicked(MouseEvent e) {
			myTextArea.append("mouse panel pos: " + e.getX() + " " + e.getY() + "\n");
			myTextArea.append("mouse screen pos: " + e.getXOnScreen() + " " + e.getYOnScreen() + "\n");
			myTextArea.append("mouse button : " + e.getButton() + "\n");
			myTextArea.append("mouse clicks : " + e.getClickCount() + "\n");
		}
		
		public void mouseEntered(MouseEvent arg0) {
			newtextarea.append("mouse on new window\n");
		}
		public void mouseExited(MouseEvent arg0) {} 
		public void mousePressed(MouseEvent arg0) {}
		public void mouseReleased(MouseEvent arg0) {}
	}

	private class ListenForWindow implements WindowListener {
		public void windowActivated(WindowEvent e) {
			myTextArea.append("window activated\n");
		}
		
		public void windowClosed(WindowEvent arg0) {}

		public void windowClosing(WindowEvent arg0) {}

		public void windowDeactivated(WindowEvent e) {
			myTextArea.append("window deactivated\n");
		}

		public void windowDeiconified(WindowEvent e) {
			myTextArea.append("window in normal state\n");
		}
		
		public void windowIconified(WindowEvent e) {
			myTextArea.append("Window Minimized\n");
		}

		public void windowOpened(WindowEvent e) {
			myTextArea.append("Window created\n");
		}
 	}
	
}	
