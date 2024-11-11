package fireemblemconsola;

public class Mirmidon extends ClaseBase 
{
    private String clase;
    
    public Mirmidon(String nombre, Arma arma, CrecimientoPersonaje crecimientos,
            EstadisticasMaximas estadisticasMaximas) 
    {
        super(nombre, 17, 3, 5, 9, 2, 0, 10, arma, crecimientos, estadisticasMaximas);
        this.setDescripcion("Genios de la espada,\ncon una muy buena suerte");
        this.clase = "Mirmidon";
    }
    
    @Override
    public double calcularCritico(Unidad atacante, Unidad victima)
    {
        double critico = atacante.getPuntosHabilidad()/2 + atacante.getArma().getCritico() - calcularResCritico(victima);
        
        if (this.getpromocionada())
            critico +=25;
        
        //System.out.println("Critico");
        return Math.max(0, Math.min(100, critico));
    }
    
    @Override
    public String getClase() { return this.clase; }
    @Override
    public void setClase(String clase) { this.clase = clase; }
}

