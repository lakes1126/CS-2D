package engine;
public abstract class Entity {

	private int xPos;
	private int yPos;
	private int width;
	private int height;
	
	private String imgPath;
	
	public Entity(int xPos, int yPos, int width, int height, String imgPath) {
		this.xPos = xPos;
		this.yPos = yPos;
		this.width = width;
		this.height = height;
		this.imgPath = imgPath;
	}
	
	public int getHeight() {
		return height;
	}
	
	public int getWidth() {
		return width;
	}
	
	public int getXPos() {
		return xPos;
	}
	
	public int getYPos() {
		return yPos;
	}
	
	public String getImgPath() {
		return imgPath;
	}
	
	public void setHeight(int newHeight) {
		height = newHeight;
	}
	
	public void setWidth(int newWidth) {
		width = newWidth;
	}
	
	public void setXPos(int newXPos) {
		xPos = newXPos;
	}
	
	public void setYPos(int newYPos) {
		yPos = newYPos;
	}
	
	public void setImgPath(String newImgPath) {
		imgPath = newImgPath;
	}
	
	
	
	
}
