import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyInput implements KeyListener{

	
	static boolean[] Keys = new boolean[4];
	
	
	public void keyPressed(KeyEvent e) {
		//System.out.println("key pressed");
		if(e.getKeyCode() == KeyEvent.VK_W) {
			Keys[0] = true;
		}
		if(e.getKeyCode() == KeyEvent.VK_A) {
			Keys[1] = true;
		}
		if(e.getKeyCode() == KeyEvent.VK_S) {
			Keys[2] = true;
		}
		if(e.getKeyCode() == KeyEvent.VK_D) {
			Keys[3] = true;
		}
		
	}

	
	public void keyReleased(KeyEvent e) {
	
		if(e.getKeyCode() == KeyEvent.VK_W) {
			Keys[0] = false;
		}
		if(e.getKeyCode() == KeyEvent.VK_A) {
			Keys[1] = false;
		}
		if(e.getKeyCode() == KeyEvent.VK_S) {
			Keys[2] = false;
		}
		if(e.getKeyCode() == KeyEvent.VK_D) {
			Keys[3] = false;
		}
		
	}

	
	public void keyTyped(KeyEvent e) {
		
		
	}
	
	
}
