package automotora;

public class VehiculoPasajero extends VehiculoArriendo
{
    private int cantPasajero;

    public VehiculoPasajero(String patente, int valorDiaArriendo, int cantDias, int cantPasajero) 
    {
        super(patente, valorDiaArriendo, cantDias);
        this.cantPasajero = cantPasajero;
    }
    
    public VehiculoPasajero()
    {
        super();
        this.cantPasajero = 4;
    }

    public int getCantPasajero() 
    {
        return cantPasajero;
    }

    public void setCantPasajero(int cantPasajero) 
    {
        this.cantPasajero = cantPasajero;
    }
    
    @Override
    public void imprimirDatosVehiculo()
    {
        String info;
        
        info = super.toString()+"Cantidad de pasajeros: "+this.cantPasajero;
        
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
