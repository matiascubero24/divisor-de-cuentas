import com.sun.net.httpserver.HttpServer;
import java.net.InetSocketAddress;
import java.io.IOException;

public class ServidorWeb {
    public static void main (String [] args) throws IOException{
        HttpServer servidor = HttpServer.create(new InetSocketAddress(8080), 0);
        servidor.start();
        System.out.println("Servidor listo en http://localhost:8080");
    }
}
