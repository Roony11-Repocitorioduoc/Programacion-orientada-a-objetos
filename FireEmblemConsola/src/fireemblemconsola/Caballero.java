package fireemblemconsola;

public class Caballero extends ClaseBase 
{
    private String clase;
    
    public Caballero(String nombre, Arma arma, CrecimientoPersonaje crecimientos, EstadisticasMaximas estadisticasMaximas) 
    {
        super(nombre, 17, 3, 5, 9, 2, 0, 10, arma, crecimientos, estadisticasMaximas);
        this.setDescripcion("Con un gran coraje,\ntienen una gran defensa");
        this.clase = "Caballero";
    }
    
    @Override
    public String getClase() { return this.clase; }
    @Override
    public void setClase(String clase) { this.clase = clase; }
}