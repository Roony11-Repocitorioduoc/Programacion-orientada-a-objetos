package fireemblemconsola;

public class Main 
{

    public static void main(String[] args) 
    {
        Espada espadaP = new Espada(10, 80,"Plata");
        Espada espadaH = new Espada(6, 90,"Hierro");
        
        Lord mark = new Lord("Mark", espadaP);
        Espadachin lloyd = new Espadachin("Lloyd", espadaH);
        Espadachin marisa = new Espadachin("Marisa", espadaP);
              
        mark.imprimirInformacion();
        lloyd.imprimirInformacion();       
        marisa.imprimirInformacion();
        
        Combate.iniciarCombate(mark, marisa);
    }
    
}
