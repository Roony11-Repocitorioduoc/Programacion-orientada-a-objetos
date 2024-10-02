package herenciaabstraccion;

public class Main 
{
    public static void main(String[] args) 
    {
        EmpleadoContratado empc1 = new EmpleadoContratado("Juan", 22, "Hola", 200);
        EmpleadoHonorario emph1 = new EmpleadoHonorario("Joaquin", 23, "Chao", 10, 20);
        
        empc1.imprimir();
        empc1.imprimirLiquidacionSueldo();
        
        System.out.println("---");
        
        emph1.imprimir();
        emph1.imprimirLiquidacionSueldo();
    }
    
}
