package fireemblemconsola;

import java.lang.reflect.InvocationTargetException;

public class GenerarUnidad 
{
    public static void generarUnidad(Class<? extends Unidad> tipoUnidad, String nombre, Arma arma) 
    {
        try 
        {
            // Obtener el constructor con los parámetros adecuados
             var constructor = tipoUnidad.getConstructor(String.class, Arma.class);

            // Crear instancia de unidad
            Unidad unidad = constructor.newInstance(nombre, arma);

            System.out.println("Unidad creada exitosamente: " + unidad.getNombre());
            unidad.imprimirInformacion();

        } 
        catch (IllegalArgumentException e) 
        {
            System.out.println("Error al crear la unidad: " + e.getMessage());
        } 
        catch (IllegalAccessException | InstantiationException | NoSuchMethodException | SecurityException | InvocationTargetException e) 
        {
            System.out.println("Error general al crear la unidad: " + e.getMessage());
        }
    }
}
