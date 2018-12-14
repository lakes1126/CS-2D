package engine;
import javax.swing.JFrame;
import java.awt.Dimension;
import java.io.IOException;


public class Main extends JFrame{
	
	private static final long serialVersionUID = 1L;
	private static final int WIDTH = 1080, HEIGHT = 720;
	private static final Dimension screensize = new Dimension(WIDTH,HEIGHT);

	Main(){
		
	}
	
	
	public static void main(String[] args) throws IOException {
		//TestNetwork network = new TestNetwork();
		//network.setup();
		//network.testMessage();
		//network.tearDown();
		
		
		JFrame frame = new JFrame();	
		
		frame.setTitle("CS:2D");
		frame.setSize(screensize);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);	
		
		
		frame.add(new DisplayPanel());
		
		
		
	}

}
