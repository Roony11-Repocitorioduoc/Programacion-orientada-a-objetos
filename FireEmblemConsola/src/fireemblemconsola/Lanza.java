package fireemblemconsola;

public class Lanza extends Arma
{
    private final String NOMBRE = this.getClass().getSimpleName();  
    private final String DESCRIPCION = "Arma balanceada,\npierde ante las hachas,\ngana contra las espadas";
    private String nombre;
    
    public Lanza(int daño, int acierto,String material)
    {
        super(daño, acierto);
        this.nombre = this.NOMBRE+" de "+material;
    }
    
    @Override
    public void imprimirInformacion()
    {
        String info;
        
        info = "Arma: "+this.nombre+"\nDescripcion: "+this.DESCRIPCION+
                "\nDaño: "+this.getDaño()+"\n";
        
        System.out.println(info);
    }
    
    @Override
    public String getNombre() { return nombre; }
    @Override
    public void setNombre(String nombre) { this.nombre = nombre; }
}