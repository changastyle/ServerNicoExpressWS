package controller;

import XML.XMLHandler;
import daos.ConexionesEntrantesDAO;
import daos.ReceptorJugadasDAO;
import java.util.ArrayList;
import model.Conexionentrantes;
import model.ConjuntoDevuelto;
import model.Jugadasrecibidas;
import model.ParametrosNicoExpress;
import model.Tarjeta;
import serializable.ReceptorJugadas;
import serializable.RespuestaJugada;

public class Controller 
{
    public static ParametrosNicoExpress recargarParametrosNicoExpress()
    {
        ParametrosNicoExpress parametrosNicoExpress = new ParametrosNicoExpress();
        parametrosNicoExpress.setPuertoServer(XMLHandler.leerInt("puerto"));
        parametrosNicoExpress.setImporteMinimoPorApuesta(XMLHandler.leerInt("importeMinimoPorApuesta"));
        parametrosNicoExpress.setImporteMaximoPorApuesta(XMLHandler.leerInt("importeMaximoPorApuesta"));
        parametrosNicoExpress.setImportePorDefault(XMLHandler.leerInt("importePorDefault"));
        parametrosNicoExpress.setAlcanze(XMLHandler.leerInt("alcanze"));
        parametrosNicoExpress.setImporteMaximoDiario(XMLHandler.leerInt("importeMaximoDiario"));
        parametrosNicoExpress.setGananciaUNDigito(XMLHandler.leerInt("gananciaUNDigito"));
        parametrosNicoExpress.setGananciaDOSDigitos(XMLHandler.leerInt("gananciaDOSDigitos"));
        parametrosNicoExpress.setGananciaTRESDigitos(XMLHandler.leerInt("gananciaTRESDigitos"));
        parametrosNicoExpress.setCantidadNumerosGeneradosEnElSorteo(XMLHandler.leerInt("cantidadNumerosGeneradosEnElSorteo"));
        parametrosNicoExpress.setMayorNumeroParaSorteo(XMLHandler.leerInt("MayorNumeroParaSorteo"));
        System.out.println("Se recargaron los ParametrosNicoExpress: \n" + parametrosNicoExpress.toString());
        return parametrosNicoExpress;
    }
    public static Tarjeta pedirDatosTarjeta(int numeroTarjeta)
    {
        Tarjeta respuesta = new Tarjeta();
        
        for(Tarjeta tarjeta : daos.TarjetasDAO.findAllTarjetas())
        {
            if(tarjeta.getSerial().trim().equalsIgnoreCase(String.valueOf(numeroTarjeta).trim()))
            {
                respuesta = tarjeta;
                break;
            }
        }
        return respuesta;
    }
    public static ConjuntoDevuelto recibirJugadas(String direccionIP,serializable.WraperJugadasRecibidas wraperJugadasRecibidas)
    {
        System.out.println("RECIBI JUGADAS:");
        ConjuntoDevuelto conjuntoDevuelto = new ConjuntoDevuelto();
        Conexionentrantes conexionentrantes = new Conexionentrantes(direccionIP);
        model.ParametrosNicoExpress parametrosJuego = recargarParametrosNicoExpress();
        int alcanze = parametrosJuego.getAlcanze();
        
        //ConexionesEntrantesDAO.save(conexionentrantes);
        for(model.Jugadasrecibidas jugadaRecibida : wraperJugadasRecibidas.getArrJugadasRecibidas())
        {
            System.out.println("" +  jugadaRecibida.toString());
        }
        //GENERO UN ARRAY DE NUMEROS GANADORES:
        ArrayList<String> arrNumerosGanadores = sortear();
        
        serializable.ReceptorJugadas receptorJugadas = new ReceptorJugadas();
        receptorJugadas.setConexionEntrante(conexionentrantes);
        receptorJugadas.setWraperJugadasRecibidas(wraperJugadasRecibidas);
        receptorJugadas.setArrNumerosSorteados(arrNumerosGanadores);
        ReceptorJugadasDAO.save(receptorJugadas);
        
        conjuntoDevuelto.setReceptorJugadas(receptorJugadas);
        for(Jugadasrecibidas jugadarecibida : receptorJugadas.getWraperJugadasRecibidas().getArrJugadasRecibidas())
        {
            serializable.RespuestaJugada respuestaJugadaAUX = new RespuestaJugada();
            respuestaJugadaAUX.setJugadarecibida(jugadarecibida);
            int dineroGanadoEstaJugada = 0;
            for(String s : receptorJugadas.getArrNumerosSorteados())
            {
                if(s.endsWith(jugadarecibida.getNumeroJugado()))
                {
                        float dineroCorrespondiente = 0;

                        float multiplicador = resolverMultiplicador(jugadarecibida);

                        dineroCorrespondiente = (( jugadarecibida.getDineroApostado() * multiplicador ) / alcanze);
                        
                        System.out.println("DINERO APOSTADO:" + jugadarecibida.getDineroApostado());
                        System.out.println("MULTIPLICADOR: " + multiplicador);
                        System.out.println("ALCANZE:" + alcanze );
                        System.out.println("RESULTADO:" + ( jugadarecibida.getDineroApostado() * multiplicador ) / alcanze );

                        dineroGanadoEstaJugada += dineroCorrespondiente;

                        //System.out.println("Ganador: (SORTEADO)" + numeroGanador +" -> (JUGADO)" + jugadaDelUsuario.getNumero());

                }
                respuestaJugadaAUX.setDineroGanadoEstaJugada(dineroGanadoEstaJugada);
            }
            conjuntoDevuelto.getArrRespuestaJugadas().add(respuestaJugadaAUX);
        }

        return conjuntoDevuelto;
    }
    private static float resolverMultiplicador(Jugadasrecibidas jugadarecibida) 
    {
        float multiplicador = 0;
        model.ParametrosNicoExpress parametrosJuego = recargarParametrosNicoExpress();
        
        switch(jugadarecibida.getNumeroJugado().length())
        {
            case 1: multiplicador = parametrosJuego.getGananciaUNDigito(); 
                 break;
            case 2: multiplicador = parametrosJuego.getGananciaDOSDigitos(); 
                 break; 
            case 3: multiplicador = parametrosJuego.getGananciaTRESDigitos(); 
                 break;
        }
          
        return multiplicador;
    }
    private static ArrayList<String> sortear() 
    {
        ArrayList<String> arrSalida = new ArrayList<String>();
        model.ParametrosNicoExpress parametrosJuego = recargarParametrosNicoExpress();
        
        for (int numerosSorteados = 0; numerosSorteados < parametrosJuego.getCantidadNumerosGeneradosEnElSorteo(); numerosSorteados++) 
        {
            int numeroGenerado = (int) ( Math.random() * parametrosJuego.getMayorNumeroParaSorteo() );
            String strNumeroGenerado ="";
            
            if(numeroGenerado < 10 )
            {
                strNumeroGenerado = "00" + numeroGenerado;
            }
            else if(numeroGenerado < 100)
            {
                strNumeroGenerado = "0" + numeroGenerado;
            }
            else
            {
                strNumeroGenerado = "" + numeroGenerado;
            }

            arrSalida.add(strNumeroGenerado);
        }
        
        return arrSalida;
    }
}
