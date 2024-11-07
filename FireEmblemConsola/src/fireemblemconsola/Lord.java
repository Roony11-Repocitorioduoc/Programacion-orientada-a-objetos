package fireemblemconsola;

public class Lord extends Unidad
{
    private final String DESCRIPCION = "Noble de una casa,\ncon un gran potencial";

    public Lord(String nombre, Arma arma) 
    {
        super(nombre, 18, 5, 5, 5, 7, 7, arma);
    }
    
    @Override
    public void imprimirInformacion()
    {
        String info;
        
        info = "Clase: "+this.getClass().getSimpleName()+"\nDescripción: "+this.DESCRIPCION+super.retornarInformación();
        
        System.out.println(info);
    }
}
