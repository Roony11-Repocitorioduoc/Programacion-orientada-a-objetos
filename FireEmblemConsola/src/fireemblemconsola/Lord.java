package fireemblemconsola;

public class Lord extends ClaseBase 
{
    public Lord(String nombre, Arma arma, CrecimientoPersonaje crecimientos) 
    {
        super(nombre, 17, 3, 5, 9, 2, 0, 10, arma, crecimientos);
        this.setDescripcion("Noble de una casa, con un gran potencial");
    }
}

