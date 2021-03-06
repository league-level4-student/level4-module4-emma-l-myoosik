package _03_polymorphs;

import java.awt.Color;
import java.awt.Graphics;

public class BluePolymorph extends Polymorph{
	private int width = 50;
	private int height = 50;

	BluePolymorph(int x, int y) {
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
    
    public void setheight(int height) {
    	if (height > 0) this.height = height;
    	else this.height = 10;
    }

	@Override
	public void draw(Graphics g) {
		g.setColor(Color.blue);
		
		g.fillRect(getX(), getY(), width, height);
	}
	
}
