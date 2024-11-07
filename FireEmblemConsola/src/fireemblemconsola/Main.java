package fireemblemconsola;

public class Main 
{

    public static void main(String[] args) 
    {
        Espada espadaP = new Espada(10, 80, "Plata");
        Espada espadaH = new Espada(6, 90, "Hierro");
        
        Lanza lanzaH = new Lanza(7, 80, "Hierro");
        
        Lord eliwood = new Lord("Eliwood", espadaP);
        Mirmidon lloyd = new Mirmidon("Lloyd", espadaH);
        Mirmidon marisa = new Mirmidon("Marisa", espadaP);
        Caballero oswin = new Caballero("Oswin", lanzaH);
              
        eliwood.imprimirInformacion();
        lloyd.imprimirInformacion();       
        marisa.imprimirInformacion();
        oswin.imprimirInformacion();
        
        Combate.iniciarCombate(oswin, eliwood);
    }
    
}
