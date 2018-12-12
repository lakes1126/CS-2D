
public class TestPlayer extends Entity{

	
	
	
	public TestPlayer(int xPos, int yPos, int width, int height, String imgPath) {
		super(xPos, yPos, width, height, imgPath);
		
	}

	public void displayHeight() {
		System.out.println(getHeight());
	}
	
	public void displayImgPath() {
		System.out.println(getImgPath());
	}
	
	
	
}
