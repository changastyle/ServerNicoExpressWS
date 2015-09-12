
package daos;
public class ConexionesEntrantesDAO 
{
    public static java.util.ArrayList<model.Conexionentrantes> findAllConexionesEntrantes()
    {
        java.util.ArrayList<model.Conexionentrantes> arrConexionesEntrantes = new java.util.ArrayList<model.Conexionentrantes>();
        java.util.List<Object> listaProvisoria = daos.AbstractDAO.findAll(model.Conexionentrantes.class);
        
        for(Object o : listaProvisoria)
        {
            model.Conexionentrantes conexionEntranteAUX = (model.Conexionentrantes) o;
            
            arrConexionesEntrantes.add(conexionEntranteAUX);
        }
        return arrConexionesEntrantes;
    }
    public static int save(model.Conexionentrantes conexionentrante)
    {
        int respuesta = -1;
        
        respuesta = daos.AbstractDAO.save(conexionentrante);

        return respuesta;
    }
}
