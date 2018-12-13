import javax.swing.JFrame;
import java.awt.Dimension;


public class Main extends JFrame{
	
	private static final long serialVersionUID = 1L;
	private static final int WIDTH = 1080, HEIGHT = 720;
	private static final Dimension screensize = new Dimension(WIDTH,HEIGHT);

	Main(){
		this.setTitle("CS:2D");
		this.setSize(screensize);
		this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);	
	}
	
	
	public static void main(String[] args) {
		TestPlayer player = new TestPlayer(0,0,50,50,"image.png");
		Main frame = new Main();
		player.displayHeight();
		player.displayImgPath();
		
	}

}
