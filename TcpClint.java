import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class TcpClint {
    public static void main(String[] args) {
        try{
            InetAddress inetAddress = InetAddress.getByName("127.0.0.1");
            int port = 9999;

            Socket socket = new Socket(inetAddress, port);

            OutputStream outputStream = socket.getOutputStream();
            outputStream.write("hihihihi".getBytes());
            outputStream
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
