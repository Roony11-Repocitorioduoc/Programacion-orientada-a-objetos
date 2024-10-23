package corredorapropiedades;

public class Casa extends Propiedad
{
    private boolean entradaDeAuto;

    @Override
    public void imprimirInformacion()
    {
        String info = "Direccion: "+this.getDireccion().getDireccion()+" - Propietario: "+getPropietario().getNombre()
                +" - Metros cuadrados: "+this.getMetrosCuadrados()+" - Valor metro cuadrado"
                +" - Valor propiedad: "+this.getValorPropiedad()+" - Numero dormitorios: "
                +this.getNumDormitorios()+"Numero Baños: "+this.getNumBaños()+" - Estada de auto: "
                +this.entradaDeAuto+"Tasacion: "+this.calcularTasacion();
        
        System.out.println(info);
    }
    
    public Casa(Direccion direccion, Propietario propietario, double metrosCuadrados, double valorMetroCuadrado, double valorPropiedad, int numDormitorios, int numBaños, boolean entradaDeAuto)
    {
        super(direccion, propietario, metrosCuadrados, valorMetroCuadrado, valorPropiedad, numDormitorios, numBaños);
        this.entradaDeAuto = entradaDeAuto;
    }

    public Casa() 
    {
        super();
        this.entradaDeAuto = true;
    }

    public boolean isEntradaDeAuto() {
        return entradaDeAuto;
    }

    public void setEntradaDeAuto(boolean entradaDeAuto) {
        this.entradaDeAuto = entradaDeAuto;
    }

    @Override
    public double calcularTasacion() 
    {
        double tasacion  = (this.getMetrosCuadrados()*this.getValorMetroCuadrado())*
                Tasar.FACTOR_VENTA;
        
        if (this.isEntradaDeAuto())
            tasacion = tasacion+300000;
        
        return tasacion;
    }
}
