package daos;

import model.Tarjeta;

public class TarjetasDAO 
{
    public static java.util.ArrayList<model.Tarjeta> findAllTarjetas()
    {
        java.util.ArrayList<model.Tarjeta> arrTarjetas = new java.util.ArrayList<model.Tarjeta>();
        java.util.List<Object> listaProvisoria = AbstractDAO.findAll(model.Tarjeta.class);
        
        for(Object o : listaProvisoria)
        {
            Tarjeta tarjetaProvisoria = (Tarjeta) o;
            
            arrTarjetas.add(tarjetaProvisoria);
        }
        
        return arrTarjetas;
    }
}
