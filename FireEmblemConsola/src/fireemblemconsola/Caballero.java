package fireemblemconsola;

public class Caballero extends Unidad
{
    private final String DESCRIPCION = "Con un gran coraje,\ntienen una gran defensa";


    public Caballero(String nombre, Arma arma) 
    {
        // nombre, vida, habilidad, fuerza, defensa, velocidad, suerte
        super(nombre, 17, 3, 5, 9, 2, 0, arma);
    }
    
    @Override
    public void imprimirInformacion()
    {
        String info;
        
        info = "Clase: "+this.getClass().getSimpleName()+"\nDescripci�n: "+this.DESCRIPCION+super.retornarInformaci�n();
        
        System.out.println(info);
    }
}