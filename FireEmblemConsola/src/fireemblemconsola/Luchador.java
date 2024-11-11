package fireemblemconsola;

public class Luchador extends ClaseBase 
{
    private String clase;
    
    public Luchador(String nombre, Arma arma, CrecimientoPersonaje crecimientos, EstadisticasMaximas estadisticasMaximas) 
    {
        super(nombre, 17, 3, 5, 9, 2, 0, 10, arma, crecimientos, estadisticasMaximas);
        this.setDescripcion("Guerreros feroces,\nusan hachas");
        this.clase = "Luchador";
    }
    
    @Override
    public String getClase() { return this.clase; }
    @Override
    public void setClase(String clase) { this.clase = clase; }
}


