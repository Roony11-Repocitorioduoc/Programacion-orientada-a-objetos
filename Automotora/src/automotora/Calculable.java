package automotora;

public interface Calculable 
{
    double IVA = 0.19;
    double DESCUENTO_CARGA = 0.03;
    double DESCUENTO_PASAJERO = 0.07;
    
    abstract double calcularDescuento();
    abstract double calcularTotalArriendo();
    abstract void imprimirBoleta();
}
