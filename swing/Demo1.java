import javax.swing.*;

class Demo {
	public static void main(String[] args) {
		JFrame frame = new JFrame("My Frame");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.setSize(400, 400);
//		frame.setToolTipText("it works"); it didn't identified the "." symbol
//		frame.setResizable(false); quite useless it seems
		
		JPanel mypanel = new JPanel();
		
		JLabel mylabel = new JLabel("my label");
		mylabel.setToolTipText("it works now");
		mypanel.add(mylabel);

		JButton mybutts = new JButton("send");
		mybutts.setToolTipText("yep it is nuts");
		mypanel.add(mybutts);

		JTextArea myspeech = new JTextArea(5, 5);
		myspeech.setToolTipText("it works too");
		myspeech.setText("you are like a poetry on my lips and\n Like a dream I stay in your eyes");
		myspeech.setLineWrap(true);	//it wraps the line
		myspeech.setWrapStyleWord(true);	//breaks line before the word
		myspeech.append("\nnumber of lines " + myspeech.getLineCount());
		mypanel.add(myspeech);
		
		JScrollPane scroolbar = new JScrollPane(myspeech, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		mypanel.add(scroolbar);	
		frame.add(mypanel);
		
		JTextField mytext = new JTextField("why type here ? ", 25);
		mytext.setToolTipText("this is text box");
		mypanel.add(mytext);	
		
		frame.setVisible(true);	
		mytext.requestFocus();
	}
}
