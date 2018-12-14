package network;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class Server extends Thread{

	private DatagramSocket socket;
    private boolean running;
    private byte[] buffer = new byte[256];
    
    public Server() {
    	try {
			socket = new DatagramSocket(4446);
		} catch (SocketException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }//end constructor
    
    public void run() {
    	running = true;
    	
    	while(running) {
    		DatagramPacket packet = new DatagramPacket(buffer, buffer.length);
    		try {
				socket.receive(packet);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
    		
    		   
            InetAddress address = packet.getAddress();
            int port = packet.getPort();
            packet = new DatagramPacket(buffer, buffer.length, address, port);
            String received = new String(packet.getData(), 0, packet.getLength());
    		
            if (received.equals("end")) {
                running = false;
                continue;
            }
            
            try {
				socket.send(packet);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
            
            
    	}//end while loop
    	
    	socket.close();
    }//end run method
    
    
    
    
}
