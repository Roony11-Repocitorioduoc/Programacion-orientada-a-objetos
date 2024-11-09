package fireemblemconsola;

public class Espada extends Arma
{
    public Espada(int daño, int acierto, int critico, int peso, String nombre)
    {
        super(daño, acierto, critico, peso, nombre, "Arma ligera,\npierde ante las lanzas,\ngana contra las hachas");
    }
}
