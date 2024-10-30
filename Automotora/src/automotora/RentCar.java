package automotora;

import java.util.ArrayList;

public class RentCar 
{
    private ArrayList<VehiculoArriendo> vehiculos;
    
    public RentCar()
    {
        this.vehiculos = new ArrayList<>();
    }
    
    public boolean buscarPatente(String patente)
    {
        boolean encontrado = false;
        
        for (VehiculoArriendo vehiculo : vehiculos) 
        {
            if (vehiculo.getPatente().equalsIgnoreCase(patente))
                encontrado = true;
        }
        
        return encontrado;
    }
    
    public void agregarVehiculo(VehiculoArriendo vehiculo)
    {
        if (buscarPatente(vehiculo.getPatente()))
            System.out.println("Ya esta registrada esta patente");
        else
            vehiculos.add(vehiculo);
    }
    
    public void listarVehiculos()
    {
        if (vehiculos.isEmpty())
            System.out.println("No hay vehiculos registrados");
        else
        {
            for (VehiculoArriendo vehiculo : vehiculos) 
            {
                vehiculo.imprimirDatosVehiculo();
            }
        }
    }
    
    public void listarPorPatente(String patente)
    {
        if (vehiculos.isEmpty())
            System.out.println("No hay vehiculos registrados");
        else
        {
            if (buscarPatente(patente))
                System.out.println("sisisisi ya te la imprimo");
        }
            
    }
}
