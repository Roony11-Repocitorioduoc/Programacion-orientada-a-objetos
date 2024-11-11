package fireemblemconsola;

public class EstadisticasMaximas 
{
    private final int maxVida;
    private final int maxHabilidad;
    private final int maxAtaque;
    private final int maxDefensa;
    private final int maxVelocidad;
    private final int maxSuerte;

    public EstadisticasMaximas(int maxVida, int maxHabilidad, int maxAtaque, int maxDefensa, int maxVelocidad, int maxSuerte) 
    {
        this.maxVida = maxVida;
        this.maxHabilidad = maxHabilidad;
        this.maxAtaque = maxAtaque;
        this.maxDefensa = maxDefensa;
        this.maxVelocidad = maxVelocidad;
        this.maxSuerte = maxSuerte;
    }

    public int getMaxVida() { return maxVida; }
    public int getMaxHabilidad() { return maxHabilidad; }
    public int getMaxAtaque() { return maxAtaque; }
    public int getMaxDefensa() { return maxDefensa; }
    public int getMaxVelocidad() { return maxVelocidad; }
    public int getMaxSuerte() { return maxSuerte; }
}
