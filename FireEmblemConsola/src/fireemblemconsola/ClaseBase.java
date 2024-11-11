package fireemblemconsola;

public abstract class ClaseBase extends Unidad 
{
    // Clase que almacena los crecimientos del personaje.
    private CrecimientoPersonaje crecimientos;
    private EstadisticasMaximas estadisticasMaximas;
    private boolean promocionada = false;
    
    // Constructor que recibe la lista de tipos de armas permitidos
    protected ClaseBase(String nombre, int vida, int habilidad, int fuerza, int defensa, int velocidad, int suerte, int constitucion, Arma arma, CrecimientoPersonaje crecimientos,
            EstadisticasMaximas estadisticasMaximas) 
    {
        super(nombre, vida, habilidad, fuerza, defensa, velocidad, suerte, constitucion, arma);
        this.crecimientos = crecimientos;
        this.estadisticasMaximas = estadisticasMaximas;
    }
    
    @Override
    public void setPuntosVida(int puntosVida) { super.setPuntosVida(Math.min(puntosVida, estadisticasMaximas.getMaxVida())); }
    @Override
    public void setPuntosHabilidad(int puntosHabilidad) { super.setPuntosHabilidad(Math.min(puntosHabilidad, estadisticasMaximas.getMaxHabilidad())); }
    @Override
    public void setPuntosAtaque(int puntosAtaque) { super.setPuntosAtaque(Math.min(puntosAtaque, estadisticasMaximas.getMaxAtaque())); }
    @Override
    public void setPuntosDefensa(int puntosDefensa) { super.setPuntosDefensa(Math.min(puntosDefensa, estadisticasMaximas.getMaxDefensa())); }
    @Override
    public void setPuntosVelocidad(int puntosVelocidad) { super.setPuntosVelocidad(Math.min(puntosVelocidad, estadisticasMaximas.getMaxVelocidad())); }
    @Override
    public void setPuntosSuerte(int puntosSuerte) { super.setPuntosSuerte(Math.min(puntosSuerte, estadisticasMaximas.getMaxSuerte())); }
    public boolean getpromocionada()  { return promocionada; }
    public void setpromocionada(boolean promocionada) { this.promocionada = promocionada; }
    @Override
    public CrecimientoPersonaje getCrecimientos()  { return crecimientos; }
    public void setCrecimientos(CrecimientoPersonaje crecimientos) { this.crecimientos = crecimientos; }
    @Override
    public EstadisticasMaximas getEstadisticasMaximas() { return estadisticasMaximas; }
    public void setEstadisticasMaximas(EstadisticasMaximas estadisticasMaximas) { this.estadisticasMaximas = estadisticasMaximas; }
    
    @Override
    public AtributosUnidad guardarAtributos() 
    {
        // Asumiendo que tienes getters para los atributos relevantes, puedes almacenarlos en un objeto o base de datos
        String nombre = this.getNombre();
        int hp = this.getPuntosVida();
        int ataque = this.getPuntosAtaque();
        int defensa = this.getPuntosDefensa();
        int velocidad = this.getPuntosVelocidad();
        int habilidad = this.getPuntosHabilidad();
        int suerte = this.getPuntosSuerte();
        int constitucion = this.getPuntosConstitucion();
        Arma arma = this.getArma();

        // Ahora puedes guardar esos atributos en cualquier estructura, aquí te muestro un ejemplo usando una clase personalizada
        return new AtributosUnidad(nombre, hp, ataque, defensa, velocidad, habilidad, suerte, constitucion,arma);
    }
    
    private boolean chanceSubirEstadistica(int crecimiento, int roll) 
    {
        return Unidad.ocurrencia(crecimiento) && roll > 0;
    }

    private void subirEstadistica(int roll) 
    {
        // Lógica de subida de nivel para cada estadística en CrecimientoPersonaje
        while (roll != 0)
        {
            if (chanceSubirEstadistica(crecimientos.getVida(), roll)) {
                this.setPuntosVida(this.getPuntosVida() + 1);
                roll--;
            }
            if (chanceSubirEstadistica(crecimientos.getHabilidad(), roll)) {
                this.setPuntosHabilidad(this.getPuntosHabilidad()+ 1);
                roll--;
            }
            if (chanceSubirEstadistica(crecimientos.getAtaque(), roll)) {
                this.setPuntosAtaque(this.getPuntosAtaque()+ 1);
                roll--;
            }
            if (chanceSubirEstadistica(crecimientos.getDefensa(), roll)) {
                this.setPuntosDefensa(this.getPuntosDefensa()+ 1);
                roll--;
            }
            if (chanceSubirEstadistica(crecimientos.getVelocidad(), roll)) {
                this.setPuntosVelocidad(this.getPuntosVelocidad()+ 1);
                roll--;
            }
            if (chanceSubirEstadistica(crecimientos.getSuerte(), roll)) {
                this.setPuntosSuerte(this.getPuntosSuerte()+ 1);
                roll--;
            }
        }
    }

    // Método para subir de nivel
    @Override
    public void subirNivel() 
    {
        int roll = 6;
        this.setNivel(this.getNivel() + 1);

        subirEstadistica(roll);

        this.setPuntosExperiencia(this.getPuntosExperiencia()-100);
    }
    
    public void promocionar(ManejoPromociones promocionManager) {
        if (!this.getpromocionada()) 
        {
            promocionManager.aplicarPromocion(this);
            this.setpromocionada(true);
        }
    }
}