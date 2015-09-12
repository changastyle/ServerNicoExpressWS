package model;

public class ParametrosNicoExpress 
{
    private int puertoServer;
    private int importeMinimoPorApuesta;
    private int importeMaximoPorApuesta;
    private int importePorDefault;
    private int alcanze;
    private int importeMaximoDiario;
    private int gananciaUNDigito;
    private int gananciaDOSDigitos;
    private int gananciaTRESDigitos;
    private int cantidadNumerosGeneradosEnElSorteo;
    private int mayorNumeroParaSorteo;
    
    public ParametrosNicoExpress()
    {
        puertoServer = -1;
        importeMinimoPorApuesta = -1;
        importeMaximoPorApuesta = -1;
        importePorDefault = -1;
        alcanze = -1;
        importeMaximoDiario = -1;
        gananciaUNDigito = -1;
        gananciaDOSDigitos = -1; 
        gananciaTRESDigitos = -1;   
        cantidadNumerosGeneradosEnElSorteo = -1;
        mayorNumeroParaSorteo = -1;
    }
    
    //<editor-fold desc="GYS">
    public int getPuertoServer() {
        return puertoServer;
    }

    public void setPuertoServer(int puertoServer) {
        this.puertoServer = puertoServer;
    }

    public int getImporteMinimoPorApuesta() {
        return importeMinimoPorApuesta;
    }

    public void setImporteMinimoPorApuesta(int importeMinimoPorApuesta) {
        this.importeMinimoPorApuesta = importeMinimoPorApuesta;
    }

    public int getImporteMaximoPorApuesta() {
        return importeMaximoPorApuesta;
    }

    public void setImporteMaximoPorApuesta(int importeMaximoPorApuesta) {
        this.importeMaximoPorApuesta = importeMaximoPorApuesta;
    }

    public int getImportePorDefault() {
        return importePorDefault;
    }

    public void setImportePorDefault(int importePorDefault) {
        this.importePorDefault = importePorDefault;
    }

    public int getAlcanze() {
        return alcanze;
    }

    public void setAlcanze(int alcanze) {
        this.alcanze = alcanze;
    }

    public int getImporteMaximoDiario() {
        return importeMaximoDiario;
    }

    public void setImporteMaximoDiario(int importeMaximoDiario) {
        this.importeMaximoDiario = importeMaximoDiario;
    }

    public int getGananciaUNDigito() {
        return gananciaUNDigito;
    }

    public void setGananciaUNDigito(int gananciaUNDigito) {
        this.gananciaUNDigito = gananciaUNDigito;
    }

    public int getGananciaDOSDigitos() {
        return gananciaDOSDigitos;
    }

    public void setGananciaDOSDigitos(int gananciaDOSDigitos) {
        this.gananciaDOSDigitos = gananciaDOSDigitos;
    }

    public int getGananciaTRESDigitos() {
        return gananciaTRESDigitos;
    }

    public void setGananciaTRESDigitos(int gananciaTRESDigitos) {
        this.gananciaTRESDigitos = gananciaTRESDigitos;
    }

    public int getCantidadNumerosGeneradosEnElSorteo() {
        return cantidadNumerosGeneradosEnElSorteo;
    }

    public void setCantidadNumerosGeneradosEnElSorteo(int cantidadNumerosGeneradosEnElSorteo) {
        this.cantidadNumerosGeneradosEnElSorteo = cantidadNumerosGeneradosEnElSorteo;
    }

    public int getMayorNumeroParaSorteo() {
        return mayorNumeroParaSorteo;
    }

    public void setMayorNumeroParaSorteo(int mayorNumeroParaSorteo) {
        this.mayorNumeroParaSorteo = mayorNumeroParaSorteo;
    }
    //</editor-fold>

    @Override
    public String toString() 
    {
        return "ParametrosNicoExpress\n{\n" 
                + " puertoServer=" + puertoServer + "\n importeMinimoPorApuesta=" + importeMinimoPorApuesta + "\n"
                + " importeMaximoPorApuesta=" + importeMaximoPorApuesta + "\n importePorDefault=" + importePorDefault + "\n"
                + " alcanze=" + alcanze + "\n importeMaximoDiario=" + importeMaximoDiario + "\n"
                + " gananciaUNDigito=" + gananciaUNDigito + "\n gananciaDOSDigitos=" + gananciaDOSDigitos + "\n"
                + " gananciaTRESDigitos=" + gananciaTRESDigitos + "\n cantidadNumerosGeneradosEnElSorteo=" + cantidadNumerosGeneradosEnElSorteo + "\n"
                + " mayorNumeroParaSorteo=" + mayorNumeroParaSorteo + "\n}";
    }

    
    
}
