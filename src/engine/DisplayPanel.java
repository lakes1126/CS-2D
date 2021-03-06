package engine;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JPanel;

public class DisplayPanel extends JPanel {
	
	TestPlayer player = new TestPlayer(0,0,50,50,"image.png");

	private KeyInput keyInput = new KeyInput();
	
	
	
	public DisplayPanel() {
		this.addKeyListener(keyInput);
		this.setDoubleBuffered(true);
	}
	
	
	public void paintComponent(Graphics g) {
		
		g.clearRect(0, 0, 2000, 2000);
		
		
		player.movePlayer();
		player.drawPlayer(g);
		
		
		
		this.setFocusable(true);
		this.requestFocusInWindow();
		
		
		
		sleepRefresh();
		
		
	}
	
	public void sleepRefresh() {
		try {
			Thread.sleep(500/30);
		}catch(Exception e){
			System.out.println("Problem");
		}//end try/catch
		//System.out.println("Running");
		

		repaint();
	}

	
	

	
}
