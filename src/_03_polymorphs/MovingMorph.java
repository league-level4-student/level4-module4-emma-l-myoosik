package _03_polymorphs;

import java.awt.Color;
import java.awt.Graphics;

public class MovingMorph extends Polymorph {
	private int width = 50;
	private int height = 50;

	MovingMorph(int x, int y) {
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
    
    public void setheight(int height) {
    	if (height > 0) this.height = height;
    	else this.height = 10;
    }
    
    @Override
    public void update() {
    	if (getX() < PolymorphWindow.WIDTH) setX(getX() + 1);
    	else setX(10);
    	
    	if (getY() < PolymorphWindow.HEIGHT) setY(getY() + 1);
    	else setY(10);
    }

	@Override
	public void draw(Graphics g) {
		// TODO Auto-generated method stub
		g.setColor(Color.cyan);
		
		g.fillRect(getX(), getY(), width, height);
	}

}
