package controlador;

import bd.Conexion;
import modelo.Alumno;
import java.sql.*;

public class RegistroAlumno 
{
    public boolean agregarAlumno(Alumno alumno)
    {
        try
        {
            Connection conexion = Conexion.getConexion();
            String query = "INSERT INTO ALUMNO(nombre, edad, carrera) VALUES"
                    + "(?, ?, ?)";
            
            PreparedStatement ins = conexion.prepareStatement(query);
            ins.setString(1, alumno.getNombre());
            ins.setInt(2, alumno.getEdad());
            ins.setString(3, alumno.getCarrera());
            
            if (ins.executeUpdate()>0)
                return true;
        }
        catch (Exception e)
        {
            System.out.println("Error al agregar "+e.getMessage());
        }
        return false;
    }
}
