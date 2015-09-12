package model;

import java.util.ArrayList;
import serializable.ReceptorJugadas;
import serializable.RespuestaJugada;

public class ConjuntoDevuelto 
{
    private serializable.ReceptorJugadas receptorJugadas;
    private ArrayList<serializable.RespuestaJugada> arrRespuestaJugadas;
    
    public ConjuntoDevuelto()
    {
        receptorJugadas = new ReceptorJugadas();
        arrRespuestaJugadas = new ArrayList<RespuestaJugada>();
    }
    
    //<editor-fold desc="GYS">
    public ReceptorJugadas getReceptorJugadas() {
        return receptorJugadas;
    }

    public void setReceptorJugadas(ReceptorJugadas receptorJugadas) {
        this.receptorJugadas = receptorJugadas;
    }

    public ArrayList<RespuestaJugada> getArrRespuestaJugadas() {
        return arrRespuestaJugadas;
    }

    public void setArrRespuestaJugadas(ArrayList<RespuestaJugada> arrRespuestaJugadas) {
        this.arrRespuestaJugadas = arrRespuestaJugadas;
    }
    //</editor-fold>


}
