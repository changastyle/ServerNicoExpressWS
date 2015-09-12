package webservices;


import java.util.ArrayList;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import model.ConjuntoDevuelto;
import model.Tarjeta;
import serializable.WraperJugadasRecibidas;

@WebService(serviceName = "ParametrosNicoExpress")
public class ParametrosNicoExpress 
{
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) 
    {
        return "Hello " + txt + " !";
    }

    @WebMethod(operationName = "pedirParametrosDeNicoExpress")
    public model.ParametrosNicoExpress pedirParametrosDeNicoExpress() 
    {
        return controller.Controller.recargarParametrosNicoExpress();
    }

    @WebMethod(operationName = "pedirDatosTarjeta")
    public Tarjeta pedirDatosTarjeta(@WebParam(name = "numeroSerie") int numeroSerie) 
    {
        return controller.Controller.pedirDatosTarjeta(numeroSerie);
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "enviarJugadas")
    public ConjuntoDevuelto enviarJugadas(@WebParam(name = "listaJugadas") WraperJugadasRecibidas listaJugadas) {
        //TODO write your implementation code here:
        return controller.Controller.recibirJugadas("127.0.0.1", listaJugadas);
    }




}
