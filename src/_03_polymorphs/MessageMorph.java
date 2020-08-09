package _03_polymorphs;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;

public class MessageMorph extends Polymorph implements MouseListener {
	private int width = 50;
	private int height = 50;
	
	JFrame frame;

	MessageMorph(int x, int y) {
		super(x, y);
		
		// TODO Auto-generated constructor stub
	}
	
	public int getWidth() {
    	return width;
    }
    
    public void setWidth(int width) {
    	if (width > 0) this.width = width;
    	else this.width = 50;
    }
    
    public int getHeight() {
    	return height;
    }
    
    public void setHeight(int height) {
    	if (height > 0) this.height = height;
    	else this.height = 10;
    }

	@Override
	public void draw(Graphics g) {
		// TODO Auto-generated method stub
		g.setColor(Color.pink);
		
		g.fillRect(getX(), getY(), width, height);
		
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

}
