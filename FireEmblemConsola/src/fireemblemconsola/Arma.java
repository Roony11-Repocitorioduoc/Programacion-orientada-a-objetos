package fireemblemconsola;

public abstract class Arma 
{
    private String nombre;
    private String descripcion;
    private int da�o;
    private int acierto;
    private int critico;
    private int peso;
    
    public Arma(int da�o, int acierto, int critico, int peso, String nombre, String descipcion)
    {
        this.da�o = da�o;
        this.acierto = acierto;
        this.critico = critico;
        this.nombre = nombre;
        this.descripcion = descipcion;
        this.peso = peso;
    }
    
    public int getDa�o() { return this.da�o; }
    public void setDa�o(int da�o) { this.da�o = da�o; }
    public int getAcierto() { return this.acierto; }
    public void setAcierto(int acierto) { this.acierto = acierto; }
    public int getCritico() { return this.critico; }
    public void setCritico(int critico) { this.critico = critico; }
    public int getPeso() { return this.peso; }
    public void setPeso(int peso) { this.peso = peso; }
    public String getNombre() { return this.nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public String getDescripcion() { return this.descripcion; }
    public void setDescipcion(String descripcion) { this.descripcion = descripcion; }
    
    public String aString() 
    {
        StringBuilder info = new StringBuilder();
        info.append("-Arma: ").append(getNombre()).append("\n")
            .append("-Descripci�n: ").append(getDescripcion()).append("\n")
            .append("-Da�o: ").append(getDa�o()).append("\n")
            .append("-Acierto: ").append(getAcierto()).append("\n")
            .append("-Cr�tico: ").append(getCritico()).append("\n")
            .append("-Peso: ").append(getPeso());
        return info.toString();
    }
    
    public void imprimirInformacion() 
    {
        System.out.println(aString());
    }
}
