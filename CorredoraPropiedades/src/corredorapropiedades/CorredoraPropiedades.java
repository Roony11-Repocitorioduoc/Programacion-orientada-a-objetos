package corredorapropiedades;

import java.util.ArrayList;

public class CorredoraPropiedades 
{
    private ArrayList<Propiedad> propiedades;

    public CorredoraPropiedades() 
    {
        this.propiedades = new ArrayList<>();
    }
    
    public void agregarPropiedad(Propiedad propiedad)
    {
        this.propiedades.add(propiedad);
        System.out.println("Se ha agregado la propiedad! ");
    }
    
    public void buscarPropiedadesPorComuna(String comuna)
    {
        for (Propiedad propiedad : propiedades) 
        {
            if (comuna.equalsIgnoreCase(propiedad.getDireccion().getComuna()))
            {
                System.out.println("Se ha encontrado esta dirección!");
                propiedad.imprimirInformacion();
            }
        }
    }
    
    public void buscarDeptos(double minimo, double maximo)
    {
        for (Propiedad propiedad : propiedades) 
        {
            if (minimo<=propiedad.calcularTasacion() && propiedad.calcularTasacion()<=maximo)
            {
                System.out.println("Propiedad encontrada!");
                propiedad.imprimirInformacion();
            }
        }
    }
}
