package fireemblemconsola;

public class Lanza extends Arma
{ 
    public Lanza(int daño, int acierto, int critico, int peso, String nombre)
    {
        super(daño, acierto, critico, peso, nombre, "Arma balanceada,\npierde ante las hachas,\ngana contra las espadas");
    }
}