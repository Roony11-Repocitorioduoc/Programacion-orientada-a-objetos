package fireemblemconsola;

// Clase para almacenar los atributos de la unidad
class AtributosUnidad 
{
    String nombre;
    int hp, ataque, defensa, velocidad, habilidad, suerte, constitucion;
    Arma arma;

    public AtributosUnidad(String nombre, int hp, int fuerza, int defensa, int velocidad, int habilidad, int suerte, int constitucion ,Arma arma) 
    {
        this.nombre = nombre;
        this.hp = hp;
        this.ataque = fuerza;
        this.defensa = defensa;
        this.velocidad = velocidad;
        this.habilidad = habilidad;
        this.suerte = suerte;
        this.constitucion = constitucion;
        this.arma = arma;
    }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public int getHp() { return hp; }
    public void setHp(int hp) { this.hp = hp; }
    public int getAtaque() { return ataque; }
    public void setAtaque(int ataque) { this.ataque = ataque; }
    public int getDefensa() { return defensa; }
    public void setDefensa(int defensa) { this.defensa = defensa; }
    public int getVelocidad() { return velocidad; }
    public void setVelocidad(int velocidad) { this.velocidad = velocidad; }
    public int getHabilidad() { return habilidad; }
    public void setHabilidad(int habilidad) { this.habilidad = habilidad; }
    public int getSuerte() { return suerte; }
    public void setSuerte(int suerte) { this.suerte = suerte; }
    public int getConstitucion() { return constitucion; }
    public void setConstitucion(int constitucion) { this.constitucion = constitucion; }
    public Arma getArma() { return arma; }
    public void setArma(Arma arma) { this.arma = arma; }
}