package fireemblemconsola;

import java.util.Random;

public abstract class Unidad 
{
    private String nombre;
    private int puntosVida;
    private int puntosHabilidad;
    private int puntosAtaque;
    private int putosDefensa;
    private int puntosVelocidad;
    private double puntosSuerte;
    private Arma arma;
    
    public abstract void imprimirInformacion();
    
    // Retorna el porcentaje de esquiva de la victima
    public double retonarEsquiva(Unidad victima)
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
        
        golpear = (atacante.puntosHabilidad*2+atacante.puntosSuerte/2+atacante.getArma().getAcierto())-retonarEsquiva(victima);
        
        if (golpear<0)
            golpear = 0;
        else if (golpear>100)
            golpear = 100;
        
        //System.out.println("Golpe");
        return golpear;
    }
    
    // Retorna el porcentaje de acierto de critico
    public double retornarCritico(Unidad atacante, Unidad victima)
    {
        double critico;
        
        critico = atacante.puntosHabilidad/2 - retornarResCritico(victima);
        
        if (critico<0)
            critico = 0;
        else if (critico>100)
            critico = 100;
        
        //System.out.println("Critico");
        return critico;
    }
    
    // Retorna el daño del arma equipada
    public int retonarDañoArma(Unidad atacante)
    {
        return atacante.getArma().getDaño();
    }
    
    // Retorna el daño realizado por un atacante hacia una victima
    public int retornarDaño(Unidad atacante, Unidad victima)
    {
        return atacante.puntosAtaque + retonarDañoArma(atacante) - victima.getPutosDefensa();
    }
    
    // Calcula la chance de que ocurra un porcentaje
    public static boolean ocurrencia(double porcentaje) 
    {
        if (porcentaje==0.0)
            return false;
                
        Random random = new Random();
        
        int chance = random.nextInt(100) + 1; // Genera un número entre 1 y 100
        
        // Debug
        System.out.println("Porcentaje: "+porcentaje+" Chance: "+chance);
        
        return chance <= porcentaje;
    }
    
    public String retornarInformación()
    {
        String info;
        
        info = "\nNombre: "+this.nombre+"\nVida: "+this.puntosVida+"\nAtaque: "+
                this.puntosAtaque+"\nHabilidad: "+this.puntosHabilidad+"\nDefensa: "+this.putosDefensa+"\nVelocidad: "+
                this.puntosVelocidad+"\nSuerte: "+this.puntosSuerte+"\nArma: "+
                this.getArma().getNombre()+"\nDaño arma: "+this.getArma().getDaño()+"\nGolpe arma: "+
                this.getArma().getAcierto()+"\n";
        
        return info;
    }

    public Unidad(String nombre, int puntosVida, int puntosHabilidad,int puntosAtaque, int putosDefensa, int puntosVelocidad, double puntosSuerte, Arma arma) 
    {
        this.nombre = nombre;
        this.puntosVida = puntosVida;
        this.puntosHabilidad = puntosHabilidad;
        this.puntosAtaque = puntosAtaque;
        this.putosDefensa = putosDefensa;
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
    public int getPutosDefensa() { return putosDefensa; }
    public void setPutosDefensa(int putosDefensa) { this.putosDefensa = putosDefensa; }
    public int getPuntosVelocidad() { return puntosVelocidad; }
    public void setPuntosVelocidad(int puntosVelocidad) { this.puntosVelocidad = puntosVelocidad; }
    public double getPuntosSuerte() { return puntosSuerte; }
    public void setPuntosSuerte(int puntosSuerte) { this.puntosSuerte = puntosSuerte; }
    public Arma getArma() { return arma; }
    public void setArma(Arma arma) { this.arma = arma; }
    
    // Método para recibir daño
    public void recibirDaño(Unidad atacante, Unidad victima, int daño) 
    {   
        victima.puntosVida -= daño;
        if (puntosVida < 0) 
            puntosVida = 0;
    }

    // Método para atacar a otra unidad
    public void atacar(Unidad atacante, Unidad victima) 
    {
        int daño = retornarDaño(atacante, victima);
                
        if (daño > 0) 
        {
            // Aumenta el daño en caso de golpe crítico
            if (ocurrencia(retornarCritico(atacante, victima))) 
            {
                daño *= 2;
                victima.recibirDaño(atacante, victima, daño);
                System.out.println("-- "+atacante.nombre + " hizo un golpe crítico! --");
                System.out.println(atacante.nombre + " atacó a " + victima.getNombre() + " causando " + daño + " puntos de daño");
            }
            
            // Chance de evitar el ataque
            else if (ocurrencia(retornarGolpear(atacante, victima)))
            {
                victima.recibirDaño(atacante, victima, daño);
                System.out.println(atacante.nombre + " atacó a " + victima.getNombre() + " causando " + daño + " puntos de daño");
            }
            else
            {
                System.out.println("-- "+victima.nombre+" evitó el ataque! --");
            }
        } 
        else
            System.out.println("-- "+atacante.nombre + " no pudo hacer daño a " + victima.getNombre()+" --");
    }
}
