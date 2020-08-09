package _03_polymorphs;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;

import javax.imageio.ImageIO;

public class ImageMorph extends Polymorph {
	private int width = 50;
	private int height = 50;
	
	public static BufferedImage image;
	public static boolean needImage = true;
	public static boolean gotImage = false;

	ImageMorph(int x, int y) {
		super(x, y);
		if (needImage) {
		    loadImage ("cat.png");
		}
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
    
    void loadImage(String imageFile) {
	    if (needImage) {
	        try {
	            image = ImageIO.read(this.getClass().getResourceAsStream(imageFile));
		    gotImage = true;
	        } catch (Exception e) {
	            
	        }
	        needImage = false;
	    }
	}
    
    @Override
    public void update() {
    	
    }

	@Override
	public void draw(Graphics g) {
		if (gotImage) {
			g.drawImage(image, getX(), getY(), width, height, null);
		} else {
			g.setColor(Color.blue);
			
			g.fillRect(getX(), getY(), width, height);
		}

	}
	
	

}
