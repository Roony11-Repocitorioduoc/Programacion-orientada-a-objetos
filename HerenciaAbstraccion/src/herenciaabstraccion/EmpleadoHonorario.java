package herenciaabstraccion;

public class EmpleadoHonorario extends Empleado
{
    private double valorHora;
    private double horasTrabajadas;

    public double getValorHora() 
    {
        return valorHora;
    }

    public void setValorHora(double valorHora) 
    {
        this.valorHora = valorHora;
    }

    public double getHorasTrabajadas() 
    {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(double horasTrabajadas) 
    {
        this.horasTrabajadas = horasTrabajadas;
    }

    public EmpleadoHonorario(String nombre, int edad, String cargo, double valorHora, double horasTrabajadas) 
    {
        super(nombre, edad, cargo);
        this.valorHora = valorHora;
        this.horasTrabajadas = horasTrabajadas;
    }

    public EmpleadoHonorario() 
    {
        super();
        this.valorHora = 1;
        this.horasTrabajadas = 1;
    }
    
    @Override
    public double calcularSueldoLiquido()
    {
        return this.valorHora*this.horasTrabajadas;
    }
    
    @Override
    public void imprimirLiquidacionSueldo()
    {
        String info;
        
        info = "Horas Trabajadas: "+this.horasTrabajadas+"\nValor hora: $"+this.valorHora+
                "\nLiquido a pagar: $"+calcularSueldoLiquido();
        this.imprimir();
        System.out.println(info);
    }
}
