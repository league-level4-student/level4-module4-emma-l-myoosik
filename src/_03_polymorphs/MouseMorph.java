package _03_polymorphs;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

public class MouseMorph extends Polymorph implements MouseMotionListener{
	private int width = 50;
	private int height = 50;
	
	int newX = 0;
	int newY = 0;

	MouseMorph(int x, int y) {
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
    public void update() {
    	
    }

	@Override
	public void draw(Graphics g) {
		// TODO Auto-generated method stub
		g.setColor(Color.cyan);
		
		g.fillRect(getX(), getY(), width, height);
	}

	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		setX(e.getX());
		setY(e.getY());
	}

}
