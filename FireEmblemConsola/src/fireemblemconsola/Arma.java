package fireemblemconsola;

public abstract class Arma 
{
    private String nombre;
    private String descripcion;
    private int daño;
    private int acierto;
    private int critico;
    private int peso;
    
    public Arma(int daño, int acierto, int critico, int peso, String nombre, String descipcion)
    {
        this.daño = daño;
        this.acierto = acierto;
        this.critico = critico;
        this.nombre = nombre;
        this.descripcion = descipcion;
        this.peso = peso;
    }
    
    public int getDaño() { return this.daño; }
    public void setDaño(int daño) { this.daño = daño; }
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
            .append("-Descripción: ").append(getDescripcion()).append("\n")
            .append("-Daño: ").append(getDaño()).append("\n")
            .append("-Acierto: ").append(getAcierto()).append("\n")
            .append("-Crítico: ").append(getCritico()).append("\n")
            .append("-Peso: ").append(getPeso());
        return info.toString();
    }
    
    public void imprimirInformacion() 
    {
        System.out.println(aString());
    }
}
