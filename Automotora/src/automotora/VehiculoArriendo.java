package automotora;

public abstract class VehiculoArriendo implements Calculable
{
    private String patente;
    private int valorDiaArriendo;
    private int cantDias;
    
    // Metodos abstractos
    public abstract void imprimirDatosVehiculo();
    @Override
    public abstract double calcularDescuento();
    @Override
    public abstract double calcularTotalArriendo();
    @Override
    public abstract void imprimirBoleta();
    // toString
    @Override
    public String toString()
    {
        String info;
        
        info = "--Informacion Vehiculo-- \nPatente: "+this.patente+"\nValor arriendo día: $"+this.valorDiaArriendo+
                "\nCantidad días arriendo: "+this.cantDias;
        
        return info;
    }

    public VehiculoArriendo(String patente, int valorDiaArriendo, int cantDias) 
    {
        this.patente = patente;
        this.valorDiaArriendo = valorDiaArriendo;
        this.cantDias = cantDias;
    }
    
    public VehiculoArriendo()
    {
        this("XXXX-11", 10, 1);
    }

    public String getPatente() 
    {
        return patente;
    }

    public void setPatente(String patente) 
    {
        this.patente = patente;
    }

    public int getValorDiaArriendo() 
    {
        return valorDiaArriendo;
    }

    public void setValorDiaArriendo(int valorDiaArriendo) 
    {
        this.valorDiaArriendo = valorDiaArriendo;
    }

    public int getCantDias()
    {
        return cantDias;
    }

    public void setCantDias(int cantDias) 
    {
        this.cantDias = cantDias;
    }
    
    
}
