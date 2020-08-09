package _03_polymorphs;

import java.awt.Graphics;

public abstract class Polymorph {
    private int x;
    private int y;
    
    Polymorph(int x, int y){
   	 this.x = x;
   	 this.y = y;
    }
    
    public int getX() {
    	return x;
    }
    
    public void setX(int x) {
    	if (x > 0) this.x = x;
    	else this.x = 10;
    }
    
    public int getY() {
    	return y;
    }
    
    public void setY(int y) {
    	if (y > 0) this.y = y;
    	else this.y = 10;
    }
    
    public void update(){
   	 
    }
    
    public abstract void draw(Graphics g);
}
