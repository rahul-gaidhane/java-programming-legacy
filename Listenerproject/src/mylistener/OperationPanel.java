package mylistener;

import javax.swing.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.Iterator;

@SuppressWarnings("serial")
public class OperationPanel extends JPanel implements ActionListener {

	JButton addButton;
	JTextField textLine1;
	JTextArea textArea;
	private ArrayList<LineAddListener> mylisteners = new ArrayList<LineAddListener>();
	
	public OperationPanel() {
		addButton = new JButton("ADD");
		textLine1 = new JTextField(25);
		textArea = new JTextArea(20, 25);
		
		addButton.addActionListener(this);
		
		this.add(addButton);
		this.add(textLine1);
		this.add(textArea);
	
		this.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		fireLineAddEvent();
	}
	
	public void addLineAddListener(LineAddListener l) {
		mylisteners.add(l);
	}
	
	public void removeLineAddListener(LineAddListener l) {
		mylisteners.remove(l);
	}
	
	private void fireLineAddEvent() {
		LineAddEvent addALine = new LineAddEvent(this);
		Iterator<LineAddListener> lineAddIterator = mylisteners.iterator();
		while(lineAddIterator.hasNext()) {
			((LineAddListener)lineAddIterator.next()).additionOfLine(addALine);
		}
	}
}
