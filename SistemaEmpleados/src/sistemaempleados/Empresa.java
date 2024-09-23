package sistemaempleados;

import java.util.ArrayList;

public class Empresa 
{
    private String nombre;
    private ArrayList<Empleado> empleados;

    public Empresa(String nombre) 
    {
        this.nombre = nombre;
        this.empleados = new ArrayList<>();
    }
    
    public void agregarEmpleado(Empleado empleado)
    {
        this.empleados.add(empleado);
    }
    
    public void listarEmpleados()
    {
        System.out.println("Lista empleados: "+this.nombre);
        for (Empleado empleado : empleados) 
        {
            System.out.println(empleado.getNombre()+" "+empleado.getCargo());
        }
    }
    
    public void buscarEmpleado(String rut)
    {
        for (Empleado empleado : empleados) 
        {
            if (empleado.getRut().equalsIgnoreCase(rut))
                empleado.imprimirLiquidacionSueldo();
        }
    }
}
