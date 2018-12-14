import java.io.IOException;

public class TestNetwork {

	Client client;
	
	
	 
	    public void setup(){
	        new Server().start();
	        client = new Client();
	    }
	    
	    public void testMessage() throws IOException {
	        String msg = client.getMessage("hello server");
	        
	        msg = client.getMessage("server is working");
	        
	    }
	    
	    
	    public void tearDown() throws IOException {
	        client.getMessage("end");
	        client.close();
	        
	    }
}
