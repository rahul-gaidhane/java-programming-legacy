package mylistener;

import javax.swing.*;

@SuppressWarnings("serial")
public class ListenerDemo extends JFrame implements LineAddListener {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ListenerDemo();
	}

	public ListenerDemo() {
		
		this.setSize(600, 600);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("Listener Demo Application");
		
		OperationPanel myPanel = new OperationPanel();
		myPanel.addLineAddListener(this);
		this.add(myPanel);
		this.setVisible(true);
		
	}
	
	@Override
	public void additionOfLine(LineAddEvent e) {
		//we can show message which will say that textline1 field is empty so nothing is added to textArea
		e.thePanel.textArea.append(e.thePanel.textLine1.getText() + "\n");
		System.out.println("Added Line : " + e.thePanel.textLine1.getText());
		e.thePanel.textLine1.setText("");
		
	  }
	 
}
