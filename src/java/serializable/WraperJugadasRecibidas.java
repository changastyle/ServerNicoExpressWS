package serializable;

import java.util.ArrayList;
import model.Jugadasrecibidas;

public class WraperJugadasRecibidas
{
    private java.util.ArrayList<model.Jugadasrecibidas> arrJugadasRecibidas;
    
    public WraperJugadasRecibidas()
    {
        arrJugadasRecibidas = new java.util.ArrayList<model.Jugadasrecibidas>();
    }
    public int calcularDineroTotalApostado()
    {
        int totalApostado = 0;
        
        for(Jugadasrecibidas jugada : arrJugadasRecibidas)
        {
            totalApostado += jugada.getDineroApostado();
        }
        
        return totalApostado;
    }
    
    
    //<editor-fold desc="GYS">
    public ArrayList<Jugadasrecibidas> getArrJugadasRecibidas() {
        return arrJugadasRecibidas;
    }

    public void setArrJugadasRecibidas(ArrayList<Jugadasrecibidas> arrJugadasRecibidas) {
        this.arrJugadasRecibidas = arrJugadasRecibidas;
    }
    //</editor-fold>


}
