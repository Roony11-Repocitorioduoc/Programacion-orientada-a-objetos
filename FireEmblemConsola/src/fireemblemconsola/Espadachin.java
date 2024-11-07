package fireemblemconsola;

public class Espadachin extends Unidad
{
    private final String DESCRIPCION = "Genios de la espada,\ncon una muy buena suerte\nSkill: +25% Crit-Rate";

    public Espadachin(String nombre, Arma arma) 
    {
        super(nombre, 21, 11, 6, 5, 11, 5, arma);
    }
    
    @Override
    public void imprimirInformacion()
    {
        String info;
        
        info = "Clase: "+this.getClass().getSimpleName()+"\nDescripción: "+this.DESCRIPCION+super.retornarInformación();
        
        System.out.println(info);
    }
    
    @Override
    // Retorna el porcentaje de acierto de critico
    public double retornarCritico(Unidad atacante, Unidad victima)
    {
        double critico;
        
        if (atacante.getPuntosHabilidad()>20)
            critico = atacante.getPuntosHabilidad()-10;
        else
            critico = atacante.getPuntosHabilidad()/2;
        
        critico = (critico - retornarResCritico(victima))+25;
        
        if (critico<0)
            critico = 0;
        
        //System.out.println("Critico");
        return critico;
    }
}