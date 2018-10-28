import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
public class server {
 public static void main(String[] args) {
 try {
 ServerSocket server = new ServerSocket(5001);
 Socket client = server.accept();
 DataOutputStream os = new DataOutputStream(client.getOutputStream());
 os.writeBytes("Hello Sockets\n");
 client.close();
 server.close();
 } catch (IOException e) {
 e.printStackTrace();
 }
 }
}
