package tree;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JFrame;

public class Treepane extends JFrame implements MouseMotionListener,
		WindowListener {
	private static final long serialVersionUID = -3381795219977706120L;

	public Treepane() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// setSize(1920, 1080);
		setSize(600, 480);
		setVisible(true);
		repaint();
	}

	@Override
	public void paint(Graphics g) {
		for (double x = -0.5; x < 0.5625; x = x + 0.0625) {
			for (double y = -0.5; y < 0.5625; y = y + 0.0625) {
				g.setColor(Color.BLACK);
				String content = "" + (int)(25 - ((x * x - y * y)*100));
				System.out.println("painting this: " + content);
				g.drawString(content, (int) ((x + 0.5) * 500)+100+(int)(8 - ((x * x - y * y)*100))*0,
						(int) ((y + 0.5) * 500)+100+(int)(8 - ((x * x - y * y)*100))*0);
			}
		}
	}

	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	public static void main(String[] args) {
		final Treepane t = new Treepane();
		t.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
	}

	public void windowClosed(WindowEvent e) {
		System.exit(0);
	}

	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub
	}

	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub
	}

	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub

	}

	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub

	}

	public void windowClosing(WindowEvent e) {
		System.exit(0);
	}

}
