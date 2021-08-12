package mycomponent;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.geom.*;

public class PaintApp {
	JFrame canvas;
	JButton buttonDrawRect;/*, buttonDrawCircle, buttonDrawEclipse, buttonDrawLine, buttonBrush, buttonDrawCurve;*/
	JTextArea textArea;	
//	enum Shapes { RECTANGEL, CIRCLE, ECLIPSE, LINE, CURVE };
//	Shapes drawShape;
	Point2D point1, point2;
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new PaintApp();				//call for object creation
	}
	
	public PaintApp() {
		canvas = new JFrame("Paint Application");		
		canvas.setSize(800, 800);
		canvas.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ListenerForMouse lOnCanvas = new ListenerForMouse();
		canvas.addMouseListener(lOnCanvas);
		JPanel mainPanel = new JPanel();
		JPanel toolPanel = new JPanel();
		//JPanel drawPanel = new JPanel();
		
		//drawPanel.setBounds(10, 201, 500, 550);
		//drawPanel.setBackground(Color.WHITE);
		
		ListenerForAction lOnDrawRect = new ListenerForAction();
	
		buttonDrawRect = new JButton("Rectangle");
		buttonDrawRect.addActionListener(lOnDrawRect);
		toolPanel.add(buttonDrawRect);
		
/*		buttonDrawCircle = new JButton("Circle");
		toolPanel.add(buttonDrawCircle);	
		
		buttonDrawLine = new JButton("Line");
		toolPanel.add(buttonDrawLine);	
		
		buttonDrawEclipse = new JButton("Eclipse");
		toolPanel.add(buttonDrawEclipse);
		
		buttonBrush = new JButton("Brush");
		toolPanel.add(buttonBrush);
		
		buttonDrawCurve = new JButton("Curve");
		toolPanel.add(buttonDrawCurve);
		
	*/	
		toolPanel.setBounds(0, 0, 120, 200);
		toolPanel.setBackground(Color.cyan);
	
		//canvas.add(new DrawStuff());
		
		textArea = new JTextArea(10, 20);
		textArea.setLineWrap(true);
		textArea.setWrapStyleWord(true);
		
		JScrollPane textScroll = new JScrollPane(textArea, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		mainPanel.add(textScroll);
		
		canvas.add(toolPanel);
		//canvas.add(drawPanel);
		canvas.add(mainPanel);
		//canvas.add(new DrawStuff());
		canvas.setVisible(true);
		
		textArea.append("object created...\n");
	}
	
	private class ListenerForAction implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			if(e.getSource() == buttonDrawRect) {
				textArea.append("Rectangle to be drawn... \n");
//				drawShape = Shapes.RECTANGEL;
			}
		}
	}
	
	private class ListenerForMouse implements MouseListener {
		@Override
		public void mouseClicked(MouseEvent e) {
	//		textArea.append("mouse clicked...\n");
		}

		@Override
		public void mouseEntered(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseExited(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mousePressed(MouseEvent e) {
			// TODO Auto-generated method stub
			 point1 = e.getPoint();
			 textArea.append("point1 obtained...\n");
		}

		@Override
		public void mouseReleased(MouseEvent e) {
			// TODO Auto-generated method stub 
			point2 = e.getPoint();
			textArea.append("point2 obtained...\n");
			canvas.add(new DrawStuff(), BorderLayout.CENTER);
			canvas.setVisible(true);
		}
		
	}
	
	public class DrawStuff extends JComponent {
		public void paint(Graphics g) {
			Graphics2D graph2 = (Graphics2D)g;
			graph2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
			textArea.append("object to be ready...\n");
			canvas.repaint();
			Shape drawRect = new Rectangle2D.Double(point1.getX(), point1.getY(), point2.getX(), point2.getY());
			graph2.draw(drawRect);
		}
	}
}
