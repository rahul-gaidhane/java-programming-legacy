package drawShape;

import java.awt.image.BufferedImage;
import java.io.*;
import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.geom.*;
import java.awt.*;
import java.awt.event.*;
import java.lang.Math;

@SuppressWarnings("serial")
public class MyPaintApp extends JFrame implements ActionListener, MouseListener, MouseMotionListener {
	
	JButton drawRectangle, drawCircle, drawInScale;
	String whatToDraw = "SQUARE";
	Point p1, p2;
	BufferedImage img = null;
	boolean scale = false;
	
	public static void main(String[] args) {
		new MyPaintApp();
	}
	
	public MyPaintApp() {
		
		this.setSize(500, 500);
		this.setTitle("My Painting Application");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel toolPanel = new JPanel();
		this.addMouseListener(this);
		this.addMouseMotionListener(this);
		
		p1 = new Point();
		p2 = new Point();
		
		drawRectangle = new JButton("RECTANGLE");
		drawRectangle.addActionListener(this);
		toolPanel.add(drawRectangle);
		
		drawCircle = new JButton("CIRCLE");
		drawCircle.addActionListener(this);
		toolPanel.add(drawCircle);
		
		drawInScale = new JButton("SCALE");
		drawInScale.addActionListener(this);
		toolPanel.add(drawInScale);
		
		toolPanel.setBackground(Color.gray);
		this.setLayout(new FlowLayout());
		this.add(toolPanel);
		this.setVisible(true);
		
		try {
			img = ImageIO.read(new File("kk.png"));
		} catch(IOException e) {
			System.out.println("error: file not found");
		}
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == drawRectangle) {
			System.out.println("draw Rectangle");
			whatToDraw = "RECTANGLE";
		}
		if(e.getSource() == drawCircle) {
			System.out.println("draw Circle");
			whatToDraw = "CIRCLE";
		}
		if(e.getSource() == drawInScale) {
			System.out.println("drawInScale");
			scale = true;
		}
	}
	
	public void paint(Graphics g) {
		super.paint(g);
		Graphics2D graph = (Graphics2D)g;
		System.out.println("Paint Invoked");
		double x = Math.min(p1.getX(), p2.getX());
		
		double y = Math.min(p1.getY(), p2.getY());
		double width = Math.abs(p2.getX()-p1.getX());
		double height = Math.abs(p2.getY() - p1.getY());
		
		if(scale) {
			graph.drawImage(img, 100, 100, null);
		}
		
		if(whatToDraw == "RECTANGLE") {
			Shape drawrect = new Rectangle2D.Double(x, y, width, height);
			graph.draw(drawrect);
		}
		
		if(whatToDraw == "CIRCLE") {
			Shape drawcircle = new Ellipse2D.Double(x, y, width, height);
			graph.draw(drawcircle);
		}
		
		
	}

	@Override
	public void mouseClicked(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
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
		p1 = new Point(e.getX(), e.getY());
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		p2 = new Point(e.getX(), e.getY());
		repaint();
	}

	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		p2 = new Point(e.getX(), e.getY());
		repaint();
	}

	@Override
	public void mouseMoved(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
}