package fireemblemconsola;

import java.util.Random;

public abstract class Unidad 
{
    private String nombre;
    private String descripcion;
    private int puntosVida;
    private int puntosHabilidad;
    private int puntosAtaque;
    private int puntosDefensa;
    private int puntosVelocidad;
    private int puntosSuerte;
    private int puntosConstitucion;
    private int puntosExperiencia;
    private int nivel;
    private Arma arma;
    
    // Método para subir de nivel
    public abstract void subirNivel();
    public abstract CrecimientoPersonaje getCrecimientos();
    public abstract EstadisticasMaximas getEstadisticasMaximas();
    public abstract AtributosUnidad guardarAtributos();
    public abstract String getClase();
    public abstract void setClase(String clase);
    
    // Calcula la chance de que ocurra un porcentaje
    public static boolean ocurrencia(double porcentaje) 
    {
        if (porcentaje==0.0)
            return false;
                
        Random random = new Random();
        
        int chance = random.nextInt(100) + 1; // Genera un número entre 1 y 100
        
        // Debug
        //System.out.println("Porcentaje: "+porcentaje+" Chance: "+chance);
        
        return chance <= porcentaje;
    }
    
    // Método para obtener el ajuste de ventaja entre dos armas
    private int obtenerAjusteVentaja(Arma armaAtacante, Arma armaVictima) {
        if ((armaAtacante instanceof Espada && armaVictima instanceof Hacha) ||
            (armaAtacante instanceof Hacha && armaVictima instanceof Lanza) ||
            (armaAtacante instanceof Lanza && armaVictima instanceof Espada)) {
            return 1;  // +1 de daño o +15 de precisión por ventaja
        } else if ((armaAtacante instanceof Espada && armaVictima instanceof Lanza) ||
                   (armaAtacante instanceof Hacha && armaVictima instanceof Espada) ||
                   (armaAtacante instanceof Lanza && armaVictima instanceof Hacha)) {
            return -1; // -1 de daño o -15 de precisión por desventaja
        }
        return 0;  // Sin ventaja ni desventaja
    }
    
    // Retorna el porcentaje de esquiva de la victima
    public double calcularEsquiva(Unidad victima)
    {
        return victima.puntosVelocidad+(victima.puntosSuerte/2);
    }
    
    private int calcularVelocidadAtaque()
    {
        int velocidadAtaque = this.puntosVelocidad-(this.arma.getPeso()-this.puntosConstitucion);
        return Math.max(0, velocidadAtaque);
    }
    
    public boolean isDoble(Unidad victima)
    {
        int velocidad = Math.max(0, this.calcularVelocidadAtaque()-victima.calcularVelocidadAtaque());
        return velocidad>=4;
    }
    
    public int cantidadAtaques(Unidad victima)
    {
        int cantidadAtaques=1;
        if (isDoble(victima))
            cantidadAtaques=2;
        return cantidadAtaques;
    }
    
    // Retorna la el porcetaje de golpe del atacante hacia una victima
    public double calcularGolpe(Unidad atacante, Unidad victima)
    {
        double golpear;
        
        golpear = (atacante.puntosHabilidad*2+atacante.puntosSuerte/2+atacante.getArma().getAcierto())-calcularEsquiva(victima);
        
        // Ajuste de precisión según ventaja/desventaja entre atacante y víctima
        golpear += obtenerAjusteVentaja(atacante.getArma(), victima.getArma()) * 15;
        
        //System.out.println("Golpe");
        return Math.max(0, Math.min(100, golpear));
    }
    
    public int calcularDaño(Unidad atacante, Unidad victima) 
    {
        int daño = atacante.puntosAtaque+atacante.getArma().getDaño()-victima.getPuntosDefensa();   
        return Math.max(0, daño);
    }
    
    // Retorna la resistencia de critico de la victima
    public double calcularResCritico(Unidad victima)
    {
        return victima.puntosSuerte;
    }
    
    // Retorna el porcentaje de acierto de critico
    public double calcularCritico(Unidad atacante, Unidad victima)
    {
        double critico = atacante.puntosHabilidad/2 + atacante.getArma().getCritico() - calcularResCritico(victima);
        
        //System.out.println("Critico");
        return Math.max(0, Math.min(100, critico));
    }
    
        private boolean isCritico(Unidad atacante, Unidad victima) 
    {
        double probabilidadCritico = calcularCritico(atacante, victima);       
        return ocurrencia(Math.max(0, Math.min(100, probabilidadCritico)));
    }

    private boolean puedeGolpear(Unidad atacante, Unidad victima) 
    {
        double probabilidadGolpear = calcularGolpe(atacante, victima);        
        return ocurrencia(Math.max(0, Math.min(100, probabilidadGolpear)));
    }
        
    public String retornarInformación() {
        StringBuilder info = new StringBuilder();

        info.append("\n-Nombre: ").append(this.nombre)
            .append("\n-Descripcion: ").append(this.descripcion)
            .append("\n-Nivel: ").append(this.nivel)
            .append("\n-Experiencia: ").append(this.puntosExperiencia).append("/100")
            .append("\n-Vida: ").append(this.puntosVida)
            .append("\n-Ataque: ").append(this.puntosAtaque)
            .append("\n-Habilidad: ").append(this.puntosHabilidad)
            .append("\n-Defensa: ").append(this.puntosDefensa)
            .append("\n-Velocidad: ").append(this.puntosVelocidad)
            .append("\n-Suerte: ").append(this.puntosSuerte)
            .append("\n-Constitucion: ").append(this.puntosConstitucion);

        return info.toString();
    }
    
    public void imprimirInformacion() {
        StringBuilder info = new StringBuilder();

        info.append("-Clase: ").append(this.getClase())
            .append(retornarInformación());

        System.out.println(info.toString());
    }
    
    public Unidad(String nombre, int puntosVida, int puntosHabilidad,int puntosAtaque, int putosDefensa, int puntosVelocidad, int puntosSuerte, int puntosConstitucion,Arma arma) 
    {
        this.nombre = nombre;
        this.puntosVida = puntosVida;
        this.puntosHabilidad = puntosHabilidad;
        this.puntosAtaque = puntosAtaque;
        this.puntosDefensa = putosDefensa;
        this.puntosVelocidad = puntosVelocidad;
        this.puntosSuerte = puntosSuerte;
        this.puntosConstitucion = puntosConstitucion;
        this.nivel = 1;
        this.puntosExperiencia = 0;
        this.arma = arma;
    }

    public boolean isAlive() { return (this.puntosVida>0); }
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public String getDescripcion() { return descripcion; }
    public void setDescripcion(String descripcion) { this.descripcion = descripcion; }
    public int getPuntosVida() { return puntosVida; }
    public void setPuntosVida(int puntosVida) { this.puntosVida = puntosVida; }
    public int getPuntosHabilidad() { return puntosHabilidad; }
    public void setPuntosHabilidad(int habilidad) { this.puntosHabilidad = habilidad; }
    public int getPuntosAtaque() { return puntosAtaque; }
    public void setPuntosAtaque(int puntosAtaque) { this.puntosAtaque = puntosAtaque; }
    public int getPuntosDefensa() { return puntosDefensa; }
    public void setPuntosDefensa(int putosDefensa) { this.puntosDefensa = putosDefensa; }
    public int getPuntosVelocidad() { return puntosVelocidad; }
    public void setPuntosVelocidad(int puntosVelocidad) { this.puntosVelocidad = puntosVelocidad; }
    public int getPuntosSuerte() { return puntosSuerte; }
    public void setPuntosSuerte(int puntosSuerte) { this.puntosSuerte = puntosSuerte; }
    public int getPuntosConstitucion() { return puntosConstitucion; }
    public void setPuntosExperiencia(int puntosExperiencia) { this.puntosExperiencia = puntosExperiencia; }
    public int getPuntosExperiencia() { return puntosExperiencia; }
    public void setNivel(int nivel) { this.nivel = nivel; }
    public int getNivel() { return nivel; }
    public void setPuntosConstitucion(int puntosConstitucion) { this.puntosConstitucion = puntosConstitucion; }
    public Arma getArma() { return arma; }
    public void setArma(Arma arma) { this.arma = arma; }
    
    // Método para ganar experiencia
    public void ganarExperiencia(int puntos) 
    {
        if (this.nivel<20)
            this.puntosExperiencia += puntos;
        
        while (this.puntosExperiencia>=100 && this.nivel<20)
        {
            subirNivel();
        }
    }
    
    // Método para recibir daño
    public void recibirDaño(int daño) 
    {   
        this.puntosVida -= daño;
        if (puntosVida < 0) 
            puntosVida = 0;
    }
    
        // Método de ataque principal
    public void atacar(Unidad victima) {
        int daño = calcularDaño(this, victima);

        if (daño > 0) 
        {
            if (isCritico(this, victima)) 
            {
                daño *= 2;
                victima.recibirDaño(daño);
                System.out.println("-- " + this.nombre + " hizo un golpe crítico! --");
                System.out.println(this.nombre + " atacó a " + victima.getNombre() + " causando " + daño + " puntos de daño");
            } 
            else if (puedeGolpear(this, victima)) 
            {
                victima.recibirDaño(daño);
                System.out.println(this.nombre + " atacó a " + victima.getNombre() + " causando " + daño + " puntos de daño");
            } 
            else
                System.out.println("-- " + victima.nombre + " evitó el ataque! --");
        } 
        else 
            System.out.println("-- " + this.nombre + " no pudo hacer daño a " + victima.getNombre() + " --");
    }
}
