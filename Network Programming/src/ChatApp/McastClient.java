package ChatApp;

import java.io.*;
import java.net.*;
public class McastClient{
	public final static int MCAST_PORT =50001;
	public final static String MCAST_GROUP_IP ="224.0.0.1";
	
    public static void main(String args[]){
	try{
		
		//1. create socket and bind it to the listning port
		MulticastSocket clientSocket = new MulticastSocket(MCAST_PORT);
		
		//2.join to group
		clientSocket.joinGroup(InetAddress.getByName(MCAST_GROUP_IP));
		
		//3. buffer
		byte[] buffData = new byte[1024];
		
		//4. DatagramPacket to wrap incoming data.
		DatagramPacket packetIn = new DatagramPacket(buffData,buffData.length);
		
		//5. receive data
		clientSocket.receive(packetIn);
		
		//6. Display data
		String str = new String(packetIn.getData());
			System.out.println("received data "+str);
			
		//7. leave group
        clientSocket.leaveGroup(InetAddress.getByName(MCAST_GROUP_IP));		
		
		//8. close DatagramSocket
		clientSocket.close();
		
	}catch(IOException e){
		e.printStackTrace();
	}
	}
}