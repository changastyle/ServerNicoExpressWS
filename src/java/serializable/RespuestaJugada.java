package serializable;

import model.Jugadasrecibidas;

public class RespuestaJugada 
{
    private model.Jugadasrecibidas jugadarecibida;
    private float dineroGanadoEstaJugada;
    
    public RespuestaJugada()
    {
        jugadarecibida = new Jugadasrecibidas();
        dineroGanadoEstaJugada = 0 ;
    }
    
    //<editor-fold desc="GYS">
    public Jugadasrecibidas getJugadarecibida() 
    {
        return jugadarecibida;
    }

    public void setJugadarecibida(Jugadasrecibidas jugadarecibida) {
        this.jugadarecibida = jugadarecibida;
    }

    public float getDineroGanadoEstaJugada() {
        return dineroGanadoEstaJugada;
    }

    public void setDineroGanadoEstaJugada(float dineroGanadoEstaJugada) {
        this.dineroGanadoEstaJugada = dineroGanadoEstaJugada;
    }

    //</editor-fold>

    @Override
    public String toString() {
        return "RespuestaJugada{" + "jugadarecibida=" + jugadarecibida + ", dineroGanadoEstaJugada=" + dineroGanadoEstaJugada + '}';
    }
    
}
