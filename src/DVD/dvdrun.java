package DVD;
import java.awt.*;

import javax.swing.*;
import java.awt.event.*;


public class dvdrun extends JFrame {

	public static void main(String[] args) {
			
		new dvdrun();
		
	}

    MyPanel panel;
    dvdrun(){
		
		panel = new MyPanel();
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.add(panel);
		this.pack();
		this.setLocationRelativeTo(null);
		this.setVisible(true);
	}  
    final int PANEL_WIDTH = 1280;
	final int PANEL_HEIGHT = 800;
	Image logo;
	Timer timer;
	int xVelocity = 5;
	int yVelocity = 5;
	int x = 0;
	int y = 0;
	
    public class MyPanel extends JPanel implements ActionListener{

	MyPanel(){
		this.setPreferredSize(new Dimension(PANEL_WIDTH,PANEL_HEIGHT));
		this.setBackground(Color.black);
		logo = new ImageIcon("c:\\OOP\\src\\DVD\\dvd_logo.png").getImage();	
		
		timer = new Timer(10, this);
		timer.start();
	}

	public void paint(Graphics g) {
		
		super.paint(g); 
		
		Graphics2D g2D = (Graphics2D) g;
		g2D.drawImage(logo, x, y, null);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(x>=PANEL_WIDTH-logo.getWidth(null) || x<0) {
			xVelocity = xVelocity * -1;
		}
		x = x + xVelocity;
		
		if(y>=PANEL_HEIGHT-logo.getHeight(null) || y<0) {
			yVelocity = yVelocity * -1;
		}
		y = y + yVelocity;
		repaint();
    }
	}
}