package fireemblemconsola;

public class CrecimientoPersonaje 
{
    private int vida;
    private int habilidad;
    private int ataque;
    private int defensa;
    private int velocidad;
    private int suerte;

    public CrecimientoPersonaje(int vida, int habilidad, int ataque, int defensa, int velocidad, int suerte) 
    {
        this.vida = vida;
        this.habilidad = habilidad;
        this.ataque = ataque;
        this.defensa = defensa;
        this.velocidad = velocidad;
        this.suerte = suerte;
    }

    public int getVida() { return vida; }
    public void setVida(int vida) { this.vida = vida; }
    public int getHabilidad() { return habilidad; }
    public void setHabilidad(int habilidad) { this.habilidad = habilidad; }
    public int getAtaque() { return ataque; }
    public void setFuerza(int ataque) { this.ataque = ataque; }
    public int getDefensa() { return defensa; }
    public void setDefensa(int defensa) { this.defensa = defensa; }
    public int getVelocidad() { return velocidad; }
    public void setVelocidad(int velocidad) { this.velocidad = velocidad; }
    public int getSuerte() { return suerte; }
    public void setSuerte(int suerte) { this.suerte = suerte; }
}
