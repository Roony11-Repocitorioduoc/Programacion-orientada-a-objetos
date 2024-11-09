package fireemblemconsola;

public abstract class ClaseBase extends Unidad 
{
    // Array que almacena los crecimientos del personaje.
    private CrecimientoPersonaje crecimientos;
    
    // Constructor que recibe la lista de tipos de armas permitidos
    protected ClaseBase(String nombre, int vida, int habilidad, int fuerza, int defensa, int velocidad, int suerte, int constitucion, Arma arma, CrecimientoPersonaje crecimientos) 
    {
        super(nombre, vida, habilidad, fuerza, defensa, velocidad, suerte, constitucion, arma);
        this.crecimientos = crecimientos;
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
    public void subirNivel() {
        int roll = 4;  // Número de subidas permitidas
        this.setNivel(this.getNivel() + 1);

        // Llama a subirEstadistica para aplicar los crecimientos
        subirEstadistica(roll);

        this.setPuntosExperiencia(this.getPuntosExperiencia()-100);

        // Imprimir información al subir de nivel
        System.out.println(this.getNombre() + " ha subido al nivel " + this.getNivel() + "!");
    }
    
    public CrecimientoPersonaje getCrecimientos() 
    {
        return crecimientos;
    }

    public void setCrecimientos(CrecimientoPersonaje crecimientos) 
    {
        this.crecimientos = crecimientos;
    }
}