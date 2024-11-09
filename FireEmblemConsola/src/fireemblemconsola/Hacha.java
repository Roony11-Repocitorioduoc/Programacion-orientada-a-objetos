package fireemblemconsola;

public class Hacha extends Arma
{ 
    public Hacha(int daño, int acierto, int critico, int peso, String nombre)
    {
        super(daño, acierto, critico, peso, nombre, "Arma pesada,\npierde ante las espadas,\ngana contra las lanzas");
    }
}
