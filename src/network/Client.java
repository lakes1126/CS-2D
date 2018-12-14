package network;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;

public class Client {

	private DatagramSocket socket;
    private InetAddress address;
 
    private byte[] buffer;
	
    public Client() {
    	try {
			socket = new DatagramSocket();
			address = InetAddress.getByName("localhost");
		} catch (SocketException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
       
    }//end constructor
    
    public String getMessage(String msg) throws IOException {
        buffer = msg.getBytes();
        DatagramPacket packet = new DatagramPacket(buffer, buffer.length, address, 4446);
        socket.send(packet);
        packet = new DatagramPacket(buffer, buffer.length);
        socket.receive(packet);
        String received = new String(packet.getData(), 0, packet.getLength());
        
        System.out.println(received);
        
        return received;
    }//end send
    
    public void close() {
        socket.close();
    }
}
