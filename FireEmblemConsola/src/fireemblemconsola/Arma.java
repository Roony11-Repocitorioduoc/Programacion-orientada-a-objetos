package fireemblemconsola;

public abstract class Arma 
{
    private int daño;
    private int acierto;
    
    public abstract void imprimirInformacion();
    public abstract void setNombre(String nombre);
    public abstract String getNombre();
    
    public Arma(int daño, int acierto)
    {
        this.daño = daño;
        this.acierto = acierto;
    }
    
    public int getDaño() { return daño; }
    public void setDaño(int daño) { this.daño = daño; }
    public int getAcierto() { return acierto; }
    public void setAcierto(int acierto) { this.acierto = acierto; }
}
