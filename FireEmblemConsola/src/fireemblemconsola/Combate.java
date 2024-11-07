package fireemblemconsola;

public class Combate {
    public static void iniciarCombate(Unidad unidad1, Unidad unidad2) 
    {

        int cuenta = 1;
        
        String infocombate = "-- Información del combate --\n\nVida: "+unidad1.getPuntosVida()+" - "+
                unidad2.getPuntosVida()+" :Vida\n"+unidad1.getNombre()+" V/S "+unidad2.getNombre()+
                "\nGolpe: "+unidad1.retornarGolpear(unidad1, unidad2)+" - "+unidad2.retornarGolpear(unidad2, unidad1)+" :Golpe"+
                "\nDaño: "+unidad1.retornarDaño(unidad1, unidad2)+" - "+unidad2.retornarDaño(unidad2, unidad1)+" :Daño"+
                "\nCritico: "+unidad1.retornarCritico(unidad1, unidad2)+" - "+unidad2.retornarCritico(unidad2, unidad1)+" :Critico";
        
        System.out.println(infocombate);
        
        while (unidad1.isAlive() && unidad2.isAlive()) 
        {
            System.out.println("\n-- Ronda "+cuenta+" --\n"+unidad1.getNombre()+" - "+unidad2.getNombre()+"\nVida: "+
                    unidad1.getPuntosVida()+" - "+unidad2.getPuntosVida()+" :Vida\n");
            
            unidad1.atacar(unidad2);
            // Si es suficientemente rapido la unidad ataca dos veces
            if (unidad1.getPuntosVelocidad()-unidad2.getPuntosVelocidad()>=4 && unidad2.isAlive())
                unidad1.atacar(unidad2);
            
            if (unidad2.getPuntosVida() > 0)
                
                unidad2.atacar(unidad1);
            // Si es suficientemente rapido la unidad ataca dos veces
            if (unidad2.getPuntosVelocidad()-unidad1.getPuntosVelocidad()>=4 && unidad1.isAlive())
                unidad2.atacar(unidad1);
            
            cuenta += 1;
        }

        if (unidad1.getPuntosVida() <= 0)
            System.out.println("\n"+unidad1.getNombre() + " ha sido derrotado.");
        else 
            System.out.println("\n"+unidad2.getNombre() + " ha sido derrotado.");
    }
}