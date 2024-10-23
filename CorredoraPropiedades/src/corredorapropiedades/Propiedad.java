package corredorapropiedades;

public abstract class Propiedad implements Tasar
{
    private Direccion direccion;
    private Propietario propietario;
    private double metrosCuadrados;
    private double valorMetroCuadrado;
    private double valorPropiedad;
    private int numDormitorios;
    private int numBaños;

    public abstract void imprimirInformacion();
    
    @Override
    public abstract double calcularTasacion();
    
    public Propiedad(Direccion direccion, Propietario propietario, double metrosCuadrados, double valorMetroCuadrado, double valorPropiedad, int numDormitorios, int numBaños) 
    {
        this.direccion = direccion;
        this.propietario = propietario;
        this.metrosCuadrados = metrosCuadrados;
        this.valorMetroCuadrado = valorMetroCuadrado;
        this.valorPropiedad = valorPropiedad;
        this.numDormitorios = numDormitorios;
        this.numBaños = numBaños;
    }
    
    public Propiedad()
    {
        this(new Direccion(), new Propietario(), 2, 1, 1, 1, 1);
    }

    public Direccion getDireccion() 
    {
        return direccion;
    }

    public void setDireccion(Direccion direccion) 
    {
        this.direccion = direccion;
    }

    public Propietario getPropietario() 
    {
        return propietario;
    }

    public void setPropietario(Propietario propietario) 
    {
        this.propietario = propietario;
    }

    public double getMetrosCuadrados() 
    {
        return metrosCuadrados;
    }

    public void setMetrosCuadrados(double metrosCuadrados) 
    {
        this.metrosCuadrados = metrosCuadrados;
    }

    public double getValorMetroCuadrado() 
    {
        return valorMetroCuadrado;
    }

    public void setValorMetroCuadrado(double valorMetroCuadrado) 
    {
        this.valorMetroCuadrado = valorMetroCuadrado;
    }

    public double getValorPropiedad() 
    {
        return valorPropiedad;
    }

    public void setValorPropiedad(double valorPropiedad) 
    {
        this.valorPropiedad = valorPropiedad;
    }

    public int getNumDormitorios() 
    {
        return numDormitorios;
    }

    public void setNumDormitorios(int numDormitorios) 
    {
        this.numDormitorios = numDormitorios;
    }

    public int getNumBaños() 
    {
        return numBaños;
    }

    public void setNumBaños(int numBaños) 
    {
        this.numBaños = numBaños;
    }
}
