package daos;

import model.Jugadasrecibidas;

public class ReceptorJugadasDAO 
{
    public static boolean save(serializable.ReceptorJugadas receptorJugadas)
    {
        boolean ok = false;
        
        int fkConexion = ConexionesEntrantesDAO.save(receptorJugadas.getConexionEntrante());
        
        System.out.println("FKCONEXION:" + fkConexion);
        for(Jugadasrecibidas jugada : receptorJugadas.getWraperJugadasRecibidas().getArrJugadasRecibidas())
        {
            jugada.setFkConexionEntrante(fkConexion);
            daos.JugadasRecibidasDAO.save(jugada);
        }
        int contador = 0;
        for(String numero : receptorJugadas.getArrNumerosSorteados())
        {
            contador++;
            model.Numerosgenerados numeroGenerado = new model.Numerosgenerados();
            numeroGenerado.setFkConexionEntrante(fkConexion);
            numeroGenerado.setNumeroGeneradoPropiamente(numero);
            numeroGenerado.setOrden(contador);
            AbstractDAO.save(numeroGenerado);
        }
        
        return ok;
    }
    
}
