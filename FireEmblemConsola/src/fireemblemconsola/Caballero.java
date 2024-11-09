package fireemblemconsola;

public class Caballero extends ClaseBase 
{
    
    public Caballero(String nombre, Arma arma, CrecimientoPersonaje crecimientos) 
    {
        super(nombre, 17, 3, 5, 9, 2, 0, 10, arma, crecimientos);
        this.setDescripcion("Con un gran coraje,\ntienen una gran defensa");
    }
}