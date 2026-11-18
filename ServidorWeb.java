import com.sun.net.httpserver.HttpServer;
import java.net.InetSocketAddress;
import java.io.IOException;
import com.sun.net.httpserver.HttpExchange;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;

public class ServidorWeb {
    public static void main (String [] args) throws IOException{
        HttpServer servidor = HttpServer.create(new InetSocketAddress(8080), 0);
        servidor.createContext("/", ServidorWeb::mostrarPagina);
        servidor.start();
        System.out.println("Servidor listo en http://localhost:8080");
    }

    public static void responder (HttpExchange intercambio, String html) throws IOException{
        byte[] bytes = html.getBytes(StandardCharsets.UTF_8);
        intercambio.getResponseHeaders().set("Content-Type", "text/html; charset=utf-8");
        intercambio.sendResponseHeaders(200, bytes.length);
        OutputStream salida = intercambio.getResponseBody();
        salida.write(bytes);    
        
        salida.close();
    }

    public static void mostrarPagina(HttpExchange intercambio) throws IOException{
        responder(intercambio, "<h1>Hola</h1>");
    }
}
