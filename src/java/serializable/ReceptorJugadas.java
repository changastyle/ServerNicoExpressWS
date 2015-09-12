package serializable;

import java.util.ArrayList;
import model.Conexionentrantes;

public class ReceptorJugadas 
{
    private model.Conexionentrantes conexionEntrante;
    private serializable.WraperJugadasRecibidas wraperJugadasRecibidas;
    private java.util.ArrayList<String> arrNumerosSorteados;
    
    public ReceptorJugadas()
    {
        conexionEntrante = new model.Conexionentrantes();
        wraperJugadasRecibidas = new WraperJugadasRecibidas();
        arrNumerosSorteados = new java.util.ArrayList<String>();
    }   
    
    //<editor-fold desc="GYS">
    public Conexionentrantes getConexionEntrante() {
        return conexionEntrante;
    }

    public void setConexionEntrante(Conexionentrantes conexionEntrante) {
        this.conexionEntrante = conexionEntrante;
    }

    public WraperJugadasRecibidas getWraperJugadasRecibidas() {
        return wraperJugadasRecibidas;
    }

    public void setWraperJugadasRecibidas(WraperJugadasRecibidas wraperJugadasRecibidas) {
        this.wraperJugadasRecibidas = wraperJugadasRecibidas;
    }

    public ArrayList<String> getArrNumerosSorteados() {
        return arrNumerosSorteados;
    }

    public void setArrNumerosSorteados(ArrayList<String> arrNumerosSorteados) {
        this.arrNumerosSorteados = arrNumerosSorteados;
    }
    
    //</editor-fold>

    @Override
    public String toString() 
    {
        return "ReceptorJugadas{" + "conexionEntrante=" + conexionEntrante + ", wraperJugadasRealizadas=" + wraperJugadasRecibidas + '}';
    }
}
