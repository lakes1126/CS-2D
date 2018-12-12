import java.awt.Dimension;
import javax.swing.JFrame;

public class Frame extends JFrame{
	private static final long serialVersionUID = 1L;
	private static final int WIDTH = 1080, HEIGHT = 720;
	private static final Dimension screensize = new Dimension(WIDTH,HEIGHT);

	public Frame() {
		this.setTitle("CS:2D");
		this.setSize(screensize);
		this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}

	public static void main(String[] args) {
		Frame frame = new Frame();
	}
}
