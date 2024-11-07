package fireemblemconsola;

public class Mirmidon extends Unidad
{
    private final String DESCRIPCION = "Genios de la espada,\ncon una muy buena suerte";

    public Mirmidon(String nombre, Arma arma) 
    {
        // nombre, vida, habilidad, fuerza, defensa, velocidad, suerte
        super(nombre, 16, 9, 4, 2, 10, 0, arma);
    }
    
    @Override
    public void imprimirInformacion()
    {
        String info;
        
        info = "Clase: "+this.getClass().getSimpleName()+"\nDescripción: "+this.DESCRIPCION+super.retornarInformación();
        
        System.out.println(info);
    }
}