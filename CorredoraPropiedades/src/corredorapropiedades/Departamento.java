package corredorapropiedades;

public class Departamento extends Propiedad
{
    private final double FACTOR_POR_PISO = 0.35;
    private int piso;
    private boolean bodega;
    private boolean estacionamiento;
    
    @Override
    public void imprimirInformacion()
    {
        String info;
        info = "Direccion: "+this.getDireccion().getDireccion()+" - Propietario: "+getPropietario().getNombre()
                +" - Metros cuadrados: "+this.getMetrosCuadrados()+" - Valor metro cuadrado"
                +" - Valor propiedad: "+this.getValorPropiedad()+" - Numero dormitorios: "
                +this.getNumDormitorios()+"Numero Baños: "+this.getNumBaños()+" - Piso: "
                +this.piso+" - Bodega: "+this.bodega+" - Estacionamiento: "+this.estacionamiento
                +"Tasacion: "+this.calcularTasacion();
        
        System.out.println(info);
    }

    public Departamento(Direccion direccion, Propietario propietario, double metrosCuadrados, double valorMetroCuadrado, double valorPropiedad, int numDormitorios, int numBaños, int piso, boolean bodega, boolean estacionamiento) 
    {
        super(direccion, propietario, metrosCuadrados, valorMetroCuadrado, valorPropiedad, numDormitorios, numBaños);
        this.piso = piso;
        this.bodega = bodega;
        this.estacionamiento = estacionamiento;
    }
    
    public Departamento()
    {
        super();
        this.piso = 1;
        this.bodega = true;
        this.estacionamiento = true;
    }

    public int getPiso() 
    {
        return piso;
    }

    public void setPiso(int piso) 
    {
        this.piso = piso;
    }

    public boolean isBodega() 
    {
        return bodega;
    }

    public void setBodega(boolean bodega) 
    {
        this.bodega = bodega;
    }

    public boolean isEstacionamiento() 
    {
        return estacionamiento;
    }

    public void setEstacionamiento(boolean estacionamiento) 
    {
        this.estacionamiento = estacionamiento;
    }

    @Override
    public double calcularTasacion() 
    {
        double tasacion  = (this.getMetrosCuadrados()*this.getValorMetroCuadrado()
                +getPiso()*this.FACTOR_POR_PISO)*Tasar.FACTOR_VENTA;
        
        return tasacion;
    }
}
