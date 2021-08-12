/*import	java.awt.Graphics;

public class Demo4 extends JFrame {
	
	public static void main(String[] args) {
		new Demo4();
	}
	
	public Demo4() {
		this.setSize(400,400);
		paint();
	}

	public void paint(Graphics g) {
		g.drawString("hello", 10,10);
	}
	
}
*/
import javax.swing.JComponent;
import javax.swing.JFrame;

import java.awt.*;
import java.awt.geom.*;

@SuppressWarnings("serial")

public class Demo4 {
	public static void main(String[] args) {
		new Demo4();
	}

	public Demo4() {
		JFrame myFrame = new JFrame("Drawing Shapes");
		myFrame.setSize(500,500);
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
	
		myFrame.add(new DrawStuff(), BorderLayout.CENTER);
		myFrame.setVisible(true);
	}

	private class DrawStuff extends JComponent {
		public void paint(Graphics g) {
			Graphics2D graph2 = (Graphics2D)g;
			
			graph2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
 
			Shape drawLine = new Line2D.Float(200, 150, 200, 200);
			Shape drawLine1 = new Line2D.Float(300, 200, 300, 250); 
			Shape drawArc2D = new Arc2D.Double(200, 150, 100, 100, 0, 360, Arc2D.OPEN);
			Shape drawArc2D1 = new Arc2D.Double(200, 200, 100, 100, 0, 270, Arc2D.CHORD);
			Shape drawArc2D2 = new Arc2D.Double(200, 250, 100, 100, 0, 270, Arc2D.PIE);
			
			graph2.setPaint(Color.BLACK);
			graph2.draw(drawArc2D);
			Shape drawRect = new Rectangle2D.Double(350, 350, 100, 100);
			graph2.draw(drawRect);	
			graph2.setPaint(Color.RED);
			graph2.draw(drawArc2D1);

			graph2.setPaint(Color.BLUE);
			graph2.draw(drawArc2D2);
		
			graph2.draw(drawLine);
			graph2.draw(drawLine1);
		}
	}
}
