import java.net.InetSocketAddress;

public class test08 {
    public static void main(String[] args) throws InterruptedException{
        InetSocketAddress inetSocketAddress = new InetSocketAddress("localhost",8080);
        System.out.println(inetSocketAddress);
        System.out.println(inetSocketAddress.getAddress());
        System.out.println(inetSocketAddress.getHostName());
        System.out.println(inetSocketAddress.getPort());
    }
}

