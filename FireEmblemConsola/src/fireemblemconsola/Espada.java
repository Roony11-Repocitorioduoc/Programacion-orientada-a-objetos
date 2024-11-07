package fireemblemconsola;

public class Espada extends Arma
{
    private final String NOMBRE = this.getClass().getSimpleName();  
    private final String DESCRIPCION = "Arma balanceada,\npierde ante las lanzas,\ngana contra las hachas";
    private String nombre;
    
    public Espada(int da�o, int acierto,String material)
    {
        super(da�o, acierto);
        this.nombre = this.NOMBRE+" de "+material;
    }
    
    @Override
    public void imprimirInformacion()
    {
        String info;
        
        info = "Arma: "+this.nombre+"\nDescripcion: "+this.DESCRIPCION+
                "\nDa�o: "+this.getDa�o()+"\n";
        
        System.out.println(info);
    }
    
    @Override
    public String getNombre() { return nombre; }
    @Override
    public void setNombre(String nombre) { this.nombre = nombre; }
    
    
}
