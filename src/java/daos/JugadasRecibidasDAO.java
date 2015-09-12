/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daos;

public class JugadasRecibidasDAO
{
    public static java.util.ArrayList<model.Jugadasrecibidas> findAllJugadasRecibidas()
    {
        java.util.ArrayList<model.Jugadasrecibidas> arr = new java.util.ArrayList<model.Jugadasrecibidas>();
        java.util.List<Object> listaProvisoria = AbstractDAO.findAll(model.Jugadasrecibidas.class);
        
        for(Object o: listaProvisoria)
        {
            model.Jugadasrecibidas jugadasrecibidas = (model.Jugadasrecibidas) o;
            arr.add(jugadasrecibidas);
        }
        return arr;
    }
    
    public static boolean save(model.Jugadasrecibidas jugadarecibida)
    {
        boolean respuesta = false;
        
        if( daos.AbstractDAO.save(jugadarecibida) > 0 )
        {
            respuesta = true;
        }
        
        return respuesta;
    }
}
