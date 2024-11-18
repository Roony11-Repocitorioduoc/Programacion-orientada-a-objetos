package controlador;

import bd.Conexion;
import java.sql.*;

public class EliminarAlumno 
{
    public boolean eliminarAlumno(int id)
    {
        try
        {
            Connection conexion = Conexion.getConexion();
            String query = "DELETE FROM ALUMNO WHERE id = ?";
            
            PreparedStatement del = conexion.prepareStatement(query);
            
            del.setInt(1, id);
            
            if (del.executeUpdate()>0)
                return true;
        }
        catch (Exception e)
        {
            System.out.println("Error al Eliminar "+e.getMessage());
        }
        return false;
    }
}