package engine;
import java.awt.Color;
import java.awt.Graphics;

public class TestPlayer extends Entity{

	
	
	
	public TestPlayer(int xPos, int yPos, int width, int height, String imgPath) {
		super(xPos, yPos, width, height, imgPath);
		
	}

	public void playerDim() {
		setHeight(100);
		setWidth(100);
		
	}
	
	public void displayDim() {
		System.out.println("Player height = " + getHeight() + " , width = " + getWidth());
	}
	
	public void drawPlayer(Graphics g) {
		g.setColor(Color.RED);
		g.drawRect(getXPos(), getYPos(), getWidth(), getHeight());
		g.fillRect(getXPos(), getYPos(), getWidth(), getHeight());
	}
	
	public void movePlayer() {
		if(KeyInput.Keys[0] == true) {
			setYPos(getYPos() - 2);
		}
		if(KeyInput.Keys[1] == true) {
			setXPos(getXPos() - 2);
		}
		if(KeyInput.Keys[2] == true) {
			setYPos(getYPos() + 2);
		}
		if(KeyInput.Keys[3] == true) {
			setXPos(getXPos() + 2);
		}
		
	}
	
	
	
	
}
