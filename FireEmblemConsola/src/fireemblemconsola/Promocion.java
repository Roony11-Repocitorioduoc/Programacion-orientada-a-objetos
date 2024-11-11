package fireemblemconsola;

public class Promocion 
{
    private String nuevaClase;
    private String nuevaDescripcion;
    private EstadisticasMaximas estadisticasPromocionadas;

    public Promocion(String nuevaClase, String nuevaDescripcion, EstadisticasMaximas estadisticasPromocionadas) 
    {
        this.nuevaClase = nuevaClase;
        this.nuevaDescripcion = nuevaDescripcion;
        this.estadisticasPromocionadas = estadisticasPromocionadas;
    }

    public String getNuevaClase() { return nuevaClase; }
    public String getNuevaDescripcion() { return nuevaDescripcion; }
    public EstadisticasMaximas getEstadisticasPromocionadas() { return estadisticasPromocionadas; }
}
