package fireemblemconsola;

public abstract class Arma 
{
    private int da�o;
    private int acierto;
    
    public abstract void imprimirInformacion();
    public abstract void setNombre(String nombre);
    public abstract String getNombre();
    
    public Arma(int da�o, int acierto)
    {
        this.da�o = da�o;
        this.acierto = acierto;
    }
    
    public int getDa�o() { return da�o; }
    public void setDa�o(int da�o) { this.da�o = da�o; }
    public int getAcierto() { return acierto; }
    public void setAcierto(int acierto) { this.acierto = acierto; }
}
