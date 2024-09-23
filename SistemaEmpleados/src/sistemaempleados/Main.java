package sistemaempleados;

public class Main 
{

    public static void main(String[] args) 
    {
        Empleado emp1 = new Empleado();
        Empleado emp2 = new Empleado("200", "asd", 123, 'H', "CArgo", 20000);
        Empleado emp3 = new Empleado("201", "Juaquin", 200, 'M', "Marquez", 1000);
        
        Empresa empresa1 = new Empresa("La juanita");
        
        emp1.imprimirLiquidacionSueldo();
        emp2.imprimirLiquidacionSueldo();
        emp3.imprimirLiquidacionSueldo();
        
        empresa1.agregarEmpleado(emp1);
        empresa1.agregarEmpleado(emp2);
        empresa1.agregarEmpleado(emp3);
        
        empresa1.listarEmpleados();
        
        empresa1.buscarEmpleado("202");
    }
    
}
