package fireemblemconsola;

public class Lord extends ClaseBase 
{
    private String clase;
    
    public Lord(String nombre, Arma arma, CrecimientoPersonaje crecimientos, EstadisticasMaximas estadisticasMaximas) 
    {
        super(nombre, 17, 3, 5, 9, 2, 0, 10, arma, crecimientos, estadisticasMaximas);
        this.setDescripcion("Noble de una casa, con un gran potencial");
        this.clase = "Lord";
    }
    
    @Override
    public String getClase() { return this.clase; }
    @Override
    public void setClase(String clase) { this.clase = clase; }
}

