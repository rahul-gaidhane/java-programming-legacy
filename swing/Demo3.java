import javax.swing.*;
import java.awt.event.*;

import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;

import java.text.NumberFormat;
import javax.swing.border.*;

public class Demo3 {
	JFrame frame1;
	JButton button1;
	JLabel label1, label2, label3;
	JTextField textfield1, textfield2;
	JRadioButton addNums, subtractNums, multNums, divideNums;
	JCheckBox dollarSign, commaSeparator;	 
	JSlider howManyTimes;
	double number1, number2, calculated;

	public static void main(String[] args) {
		new Demo3(); 
	}

	public Demo3() {
		frame1 = new JFrame("This is my third frame");
		frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame1.setSize(400,400);
		frame1.setLocationRelativeTo(null);
	
		JPanel panel1 = new JPanel();
		
		button1 = new JButton("Calculate");
		ListenForButton lForButton = new ListenForButton();
		button1.addActionListener(lForButton);
		panel1.add(button1);

		label1 = new JLabel("Number 1");
		panel1.add(label1);

		textfield1 = new JTextField("", 5);
		panel1.add(textfield1);

		label2 = new JLabel("Number 2");
		panel1.add(label2);

		textfield2 = new JTextField("", 5);
		panel1.add(textfield2);

		dollarSign = new JCheckBox("$");
		commaSeparator = new JCheckBox(",");

		panel1.add(dollarSign);
		panel1.add(commaSeparator, true);

		addNums = new JRadioButton("+");
		subtractNums = new JRadioButton("-");
		multNums = new JRadioButton("*");
		divideNums = new JRadioButton("/");

		ButtonGroup operation = new ButtonGroup();
		
		operation.add(addNums);
		operation.add(subtractNums);
		operation.add(multNums);
		operation.add(divideNums);

		JPanel operPanel = new JPanel();

		Border operBorder = BorderFactory.createTitledBorder("Operation");

		operPanel.setBorder(operBorder);

//		operPanel.add(operation);	this operation cannot be done as Buttongroup
//									is not a Component class object
	
		operPanel.add(addNums);
		operPanel.add(subtractNums);
		operPanel.add(multNums);
		operPanel.add(divideNums);

		addNums.setSelected(true);
 
		panel1.add(operPanel);
		
		label3 = new JLabel("Perform How Many Times ?");
		panel1.add(label3);

		howManyTimes = new JSlider(0, 99, 1);				
		
		howManyTimes.setMinorTickSpacing(1);
		howManyTimes.setMajorTickSpacing(10);
		
		howManyTimes.setPaintTicks(true);
		
		howManyTimes.setPaintLabels(true);

		ListenForSlider lForSlider = new ListenForSlider();

		howManyTimes.addChangeListener(lForSlider);	
		
		panel1.add(howManyTimes);
		
		frame1.add(panel1);
		frame1.setVisible(true); 
		textfield1.requestFocus();		
	}

	private class ListenForButton implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			if(e.getSource() == button1) {
				try {
					number1 = Double.parseDouble(textfield1.getText());
					number2 = Double.parseDouble(textfield2.getText());
				}
				catch(NumberFormatException excep) {
					JOptionPane.showMessageDialog(frame1, "Please enter the correct info", "Error", JOptionPane.ERROR_MESSAGE);
					System.exit(0);
				}
			}

			if(addNums.isSelected()) { 
				calculated = addNumbers(number1, number2, howManyTimes.getValue());
			}
			else if(subtractNums.isSelected()) {
				calculated = subtractNumbers(number1, number2, howManyTimes.getValue());
			}
			else if(multNums.isSelected()) {
  				calculated = multiplyNumbers(number1, number2, howManyTimes.getValue());
			}
			else {
				calculated = divideNumbers(number1, number2, howManyTimes.getValue());
			}
			
			if(dollarSign.isSelected()) {
				NumberFormat numFormat = NumberFormat.getCurrencyInstance();

				JOptionPane.showMessageDialog(frame1, numFormat.format(calculated), "solution", JOptionPane.INFORMATION_MESSAGE);
			}
			else if(commaSeparator.isSelected()) {
				NumberFormat numFormat = NumberFormat.getNumberInstance();
				
				JOptionPane.showMessageDialog(frame1, numFormat.format(calculated), "solution", JOptionPane.INFORMATION_MESSAGE);
			} 
			else {
				JOptionPane.showMessageDialog(frame1, calculated, "solution", JOptionPane.INFORMATION_MESSAGE);
			}
		}
		
	}
	
	private class ListenForSlider implements ChangeListener {
		@Override
		public void stateChanged(ChangeEvent e) {
			if(e.getSource() == howManyTimes) {
				label3.setText("Perform How Many Times ? " + howManyTimes.getValue());
			}
		}
	}
		
	public static double addNumbers(double number1, double number2, int howMany) {
		double total = 0;
		
		int i = 1;
		while(i <= howMany) {
			total = total + (number1 + number2);
			i++;
		}
		
		return total;
	}

	public static double subtractNumbers(double number1, double number2, int howMany) {
		double total = 0; 
		int i = 1;
		
		while(i <= howMany) {
			total = total + (number1 - number2);
			i++;
		} 
		return total;
	}
	
	public static double divideNumbers(double number1, double number2, int howMany) {
		double total = 0;
		int i = 1;
		
		while(i <= howMany) {
			total = total + (number1 / number2);
			i++;
		}
		return total;
	}

	public static double multiplyNumbers(double number1, double number2, int howMany) {
		double total = 0;
		int i = 1;
		
		while(i <= howMany) {
			total = total + (number1 * number2);
			i++;
		}
		return total;
	
	}
}
	
