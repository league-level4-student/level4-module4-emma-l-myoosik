package _03_polymorphs;

import java.awt.Color;
import java.awt.Graphics;

public class CircleMorph extends Polymorph {
	private int width = 50;
	private int height = 50;
	
	int angle = (int) Math.PI/180;

	CircleMorph(int x, int y) {
		super(x, y);
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
    	setX(getX() + (int) (Math.cos(Math.PI/180 * angle) * 5));
    	setY(getY() + (int) (Math.sin(Math.PI/180 * angle) * 5));
    	
    	angle++;
    }

	@Override
	public void draw(Graphics g) {
		g.setColor(Color.magenta);
		
		g.fillRect(getX(), getY(), width, height);
	}

}
