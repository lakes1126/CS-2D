import javax.swing.JFrame;
import java.awt.Dimension;


public class Main extends JFrame{
	
	private static final long serialVersionUID = 1L;
	private static final int WIDTH = 1080, HEIGHT = 720;
	private static final Dimension screensize = new Dimension(WIDTH,HEIGHT);

	Main(){
		
	}
	
	
	public static void main(String[] args) {
		
		JFrame frame = new JFrame();	
		
		frame.setTitle("CS:2D");
		frame.setSize(screensize);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);	
		
		
		frame.add(new DisplayPanel());
		
	}

}
