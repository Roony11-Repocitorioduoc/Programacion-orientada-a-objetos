package fireemblemconsola;

import java.util.Random;

public abstract class Unidad 
{
    private String nombre;
    private int puntosVida;
    private int puntosHabilidad;
    private int puntosAtaque;
    private int puntosDefensa;
    private int puntosVelocidad;
    private int puntosSuerte;
    private Arma arma;
    
    public abstract void imprimirInformacion();
    
    // Retorna el porcentaje de esquiva de la victima
    public double retornarEsquiva(Unidad victima)
    {
        return victima.puntosVelocidad+(victima.puntosSuerte/2);
    }
    
    // Retorna la resistencia de critico de la victima
    public double retornarResCritico(Unidad victima)
    {
        return victima.puntosSuerte;
    }
    
    // Retorna la el porcetaje de golpe del atacante hacia una victima
    public double retornarGolpear(Unidad atacante, Unidad victima)
    {
        double golpear;
        
        golpear = (atacante.puntosHabilidad*2+atacante.puntosSuerte/2+atacante.getArma().getAcierto())-retornarEsquiva(victima);
        
        //System.out.println("Golpe");
        return golpear;
    }
    
    // Retorna el porcentaje de acierto de critico
    public double retornarCritico(Unidad atacante, Unidad victima)
    {
        double critico;
        
        critico = atacante.puntosHabilidad/2 - retornarResCritico(victima);
        
        //System.out.println("Critico");
        return critico;
    }
    
    // Retorna el da�o del arma equipada
    public int retonarDa�oArma(Unidad atacante)
    {
        return atacante.getArma().getDa�o();
    }
    
    // Retorna el da�o realizado por un atacante hacia una victima
    public int retornarDa�o(Unidad atacante, Unidad victima)
    {
        return atacante.puntosAtaque + retonarDa�oArma(atacante) - victima.getPuntosDefensa();
    }
    
    // Calcula la chance de que ocurra un porcentaje
    public static boolean ocurrencia(double porcentaje) 
    {
        if (porcentaje==0.0)
            return false;
                
        Random random = new Random();
        
        int chance = random.nextInt(100) + 1; // Genera un n�mero entre 1 y 100
        
        // Debug
        System.out.println("Porcentaje: "+porcentaje+" Chance: "+chance);
        
        return chance <= porcentaje;
    }
    
    public String retornarInformaci�n()
    {
        String info;
        
        info = "\nNombre: "+this.nombre+"\nVida: "+this.puntosVida+"\nAtaque: "+
                this.puntosAtaque+"\nHabilidad: "+this.puntosHabilidad+"\nDefensa: "+this.puntosDefensa+"\nVelocidad: "+
                this.puntosVelocidad+"\nSuerte: "+this.puntosSuerte+"\nArma: "+
                this.getArma().getNombre()+"\nDa�o arma: "+this.getArma().getDa�o()+"\nGolpe arma: "+
                this.getArma().getAcierto()+"\n";
        
        return info;
    }

    public Unidad(String nombre, int puntosVida, int puntosHabilidad,int puntosAtaque, int putosDefensa, int puntosVelocidad, int puntosSuerte, Arma arma) 
    {
        this.nombre = nombre;
        this.puntosVida = puntosVida;
        this.puntosHabilidad = puntosHabilidad;
        this.puntosAtaque = puntosAtaque;
        this.puntosDefensa = putosDefensa;
        this.puntosVelocidad = puntosVelocidad;
        this.puntosSuerte = puntosSuerte;
        this.arma = arma;
    }

    public boolean isAlive() { return (this.puntosVida>0); }
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
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
    public double getPuntosSuerte() { return puntosSuerte; }
    public void setPuntosSuerte(int puntosSuerte) { this.puntosSuerte = puntosSuerte; }
    public Arma getArma() { return arma; }
    public void setArma(Arma arma) { this.arma = arma; }
    
    // M�todo para recibir da�o
    public void recibirDa�o(int da�o) 
    {   
        this.puntosVida -= da�o;
        if (puntosVida < 0) 
            puntosVida = 0;
    }
    
        // M�todo de ataque principal
    public void atacar(Unidad victima) {
        int da�o = calcularDa�o(this, victima);

        if (da�o > 0) 
        {
            if (isCritico(this, victima)) 
            {
                da�o *= 2;
                victima.recibirDa�o(da�o);
                System.out.println("-- " + this.nombre + " hizo un golpe cr�tico! --");
            } 
            else if (puedeGolpear(this, victima)) 
            {
                victima.recibirDa�o(da�o);
                System.out.println(this.nombre + " atac� a " + victima.getNombre() + " causando " + da�o + " puntos de da�o");
            } 
            else
                System.out.println("-- " + victima.nombre + " evit� el ataque! --");
        } 
        else 
            System.out.println("-- " + this.nombre + " no pudo hacer da�o a " + victima.getNombre() + " --");
    }

    private int calcularDa�o(Unidad atacante, Unidad victima) {
        return atacante.puntosAtaque+atacante.getArma().getDa�o()-victima.getPuntosDefensa();
    }

    private boolean isCritico(Unidad atacante, Unidad victima) {
        double probabilidadCritico = atacante.puntosHabilidad/2-victima.puntosSuerte;
        return ocurrencia(Math.max(0, Math.min(100, probabilidadCritico)));
    }

    private boolean puedeGolpear(Unidad atacante, Unidad victima) {
        double probabilidadGolpear = atacante.puntosHabilidad*2+atacante.puntosSuerte/2+atacante.getArma().getAcierto()-(victima.puntosVelocidad+victima.puntosSuerte/2);
        return ocurrencia(Math.max(0, Math.min(100, probabilidadGolpear)));
    }
}
