package serializable;

public class Jugada
{
    private int numeroApostado;
    private int dineroApostado;

    public Jugada() 
    {
        numeroApostado = 0 ;
        dineroApostado = 0;
    }
    public Jugada(int numeroApostado , int dineroApostado) 
    {
        this.numeroApostado = numeroApostado ;
        this.dineroApostado = dineroApostado;
    }


    //<editor-fold desc="GYS">
    public int getNumeroApostado() {
        return numeroApostado;
    }

    public void setNumeroApostado(int numeroApostado) {
        this.numeroApostado = numeroApostado;
    }

    public int getDineroApostado() {
        return dineroApostado;
    }

    public void setDineroApostado(int dineroApostado) {
        this.dineroApostado = dineroApostado;
    }
    //</editor-fold>

    @Override
    public String toString() {
        return "Jugada{" + "numeroApostado=" + numeroApostado + ", dineroApostado=" + dineroApostado + '}';
    }
    
    
}
