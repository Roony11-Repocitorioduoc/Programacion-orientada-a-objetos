package automotora;

public class VehiculoCarga extends VehiculoArriendo
{
    private int capacidadCarga;

    public VehiculoCarga(String patente, int valorDiaArriendo, int cantDias, int capacidadCarga) 
    {
        super(patente, valorDiaArriendo, cantDias);
        this.capacidadCarga = capacidadCarga;
    }
    
    public VehiculoCarga()
    {
        super();
        this.capacidadCarga = 1000;
    }

    public int getCapacidadCarga() 
    {
        return capacidadCarga;
    }

    public void setCapacidadCarga(int capacidadCarga) 
    {
        this.capacidadCarga = capacidadCarga;
    }
    
    @Override
    public void imprimirDatosVehiculo()
    {
        String info;
        
        info = super.toString()+"\nCapacidad de carga: "+
                this.capacidadCarga+"\n";
        
        System.out.println(info);
    }
    
    @Override
    public double calcularDescuento()
    {
        double dsct;
        
        dsct = (this.getCantDias()*this.getValorDiaArriendo())*Calculable.DESCUENTO_CARGA;
        
        return dsct;
    }
    
    @Override
    public double calcularTotalArriendo()
    {
        double total;
        
        total = (this.getCantDias()*this.getValorDiaArriendo())-calcularDescuento()*(1+Calculable.IVA);
        
        return total;
    }
    
    @Override
    public void imprimirBoleta()
    {
        String info;
        
        this.imprimirDatosVehiculo();
        
        info = "Descuento: $"+calcularDescuento()+"\nTotal Arriendo: $"+
                calcularTotalArriendo()+" IVA incluido";
        
        System.out.println(info);
    }
}
