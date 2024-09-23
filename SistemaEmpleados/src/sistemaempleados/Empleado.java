package sistemaempleados;

public class Empleado 
{
    private String rut;
    private String nombre;
    private int edad;
    private char sexo;
    private String cargo;
    private double sueldoBase;

    public String getRut() 
    {
        return rut;
    }

    public void setRut(String rut) 
    {
        this.rut = rut;
    }

    public String getNombre() 
    {
        return nombre;
    }

    public void setNombre(String nombre) 
    {
        this.nombre = nombre;
    }

    public int getEdad() 
    {
        return edad;
    }

    public void setEdad(int edad) 
    {
        this.edad = edad;
    }

    public char getSexo() 
    {
        return sexo;
    }

    public void setSexo(char sexo) 
    {
        this.sexo = sexo;
    }

    public String getCargo() 
    {
        return cargo;
    }

    public void setCargo(String cargo) 
    {
        this.cargo = cargo;
    }

    public double getSueldoBase() 
    {
        return sueldoBase;
    }

    public void setSueldoBase(double sueldoBase) 
    {
        this.sueldoBase = sueldoBase;
    }

    public Empleado() 
    {
        setRut("0");
        setNombre("Sin nombre");
        setEdad(0);
        setSexo('X');
        setCargo("Sin cargo");
        setSueldoBase(0.0);
    }

    public Empleado(String rut, String nombre, int edad, char sexo, String cargo, double sueldoBase) 
    {
        setRut(rut);
        setNombre(nombre);
        setEdad(edad);
        setSexo(sexo);
        setCargo(cargo);
        setSueldoBase(sueldoBase);
    }
    
    public double descuentoSalud(double sueldoBase)
    {
        double desc;
        desc = 0.07;
        
        return sueldoBase*desc;
    }
    
    public double descuentoPension(double sueldoBase)
    {
        double desc;
        desc = 0.13;
        
        return sueldoBase*desc;
    }
    
    public double liquidoPagar(double sueldoBase, double descSalud, double descPension)
    {
        return sueldoBase-descSalud-descPension;
    }
    
    public void imprimirLiquidacionSueldo()
    {
        String info;
        String salud;
        String pension;
        
        salud = "(7%): ";
        pension = "(13%): ";
        
        info = "--Liquidacion de sueldo--\n"
                + "Rut: "+getRut()+"\n"
                + "Empleado: "+getNombre()+"\n"
                + "Cargo: "+getCargo()+"\n"
                + "Sueldo Base: "+getSueldoBase()+"\n"
                + "Salud "+salud+descuentoSalud(getSueldoBase())+"\n"
                + "Pension"+pension+descuentoPension(getSueldoBase())+"\n"
                + "Liquido a pagar: $"+liquidoPagar(getSueldoBase(), descuentoSalud(getSueldoBase()), descuentoPension(getSueldoBase()));
        
        System.out.println(info);
    }
            
}
