package fireemblemconsola;

public class Lanza extends Arma
{ 
    public Lanza(int da�o, int acierto, int critico, int peso, String nombre)
    {
        super(da�o, acierto, critico, peso, nombre, "Arma balanceada,\npierde ante las hachas,\ngana contra las espadas");
    }
}