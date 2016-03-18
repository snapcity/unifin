package helloworld;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

// A classe registra os métodos http GET usando @GET
// Usando @produces fornece tipos MIME


//configura o caminho para a base URL + /hello
@Path("/hello")
public class hello {

  // Esse método retorna um texto
  @GET
  @Produces(MediaType.TEXT_PLAIN)
  public String sayPlainTextHello() {
    return "Hello Jersey Projeto RESTFul";
  }

  // Esse método retorna como XML
  @GET
  @Produces(MediaType.TEXT_XML)
  public String sayXMLHello() {
    return "<?xml version=\"1.0\"?>" + "<hello> Hello Jersey" + "</hello>";
  }

  // Esse método retorna como HTML
  @GET
  @Produces(MediaType.TEXT_HTML)
  public String sayHtmlHello() {
    return "<html> " + "<title>" + "Hello Jersey" + "</title>"
        + "<body><h1>" + "Hello Jersey Projeto RESTFul SnapCity" + "</body></h1>" + "</html> ";
  }

} 