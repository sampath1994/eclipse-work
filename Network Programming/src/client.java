import java.io.*;
import java.net.Socket;
public class client {
 public static void main(String[] args) {
 try {
 Socket socClient = new Socket("localhost", 5001);
 InputStream is = socClient.getInputStream();
 BufferedReader br = new BufferedReader(new InputStreamReader(is));
 String receivedData = br.readLine();
 System.out.println("Received Data: " + receivedData);
 } catch (IOException e) {
 e.printStackTrace();
 }
 }
}