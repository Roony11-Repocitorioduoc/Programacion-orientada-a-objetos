package herenciaabstraccion;

public class EmpleadoContratado extends Empleado
{
    private double sueldoBase;

    public double getSueldoBase() 
    {
        return sueldoBase;
    }

    public void setSueldoBase(double sueldoBase) 
    {
        this.sueldoBase = sueldoBase;
    }

    public EmpleadoContratado(String nombre, int edad, String cargo, double sueldoBase) 
    {
        super(nombre, edad, cargo);
        this.sueldoBase = sueldoBase;
    }

    public EmpleadoContratado() 
    {
        super();
        this.sueldoBase = 0;
    }
    
    private String calcularAFP(double sueldoBase, double descuento)
    {
        String info = "Descuento AFP ("+(descuento*100)+"%) : "+sueldoBase*descuento;
        
        return info;
    }
    
    private String calcularSalud(double sueldoBase, double descuento)
    {
        String info = "Descuento Salud ("+(descuento*100)+"%) : "+sueldoBase*descuento;
        
        return info;
    }
    
    @Override
    public double calcularSueldoLiquido()
    {
        return this.sueldoBase*(1-0.07-0.07);
    }
    
    @Override
    public void imprimirLiquidacionSueldo()
    {
        String info;
        
        this.imprimir();
        info = "Sueldo base: $"+this.sueldoBase+"\n"
                +calcularAFP(this.sueldoBase, 0.07)+"\n"+calcularAFP(this.sueldoBase, 0.07)+
                "\nLiquido a pagar: $"+calcularSueldoLiquido();
        
        System.out.println(info);
    }
}
