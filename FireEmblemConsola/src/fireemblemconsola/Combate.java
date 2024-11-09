package fireemblemconsola;

public class Combate 
{   
    public static void iniciarCombate(Unidad unidad1, Unidad unidad2) 
    {
        int cuenta = 1;
        
        String daño1, daño2;
        
        if (unidad1.isDoble(unidad2))
            daño1 = "\nDaño: "+unidad1.calcularDaño(unidad1, unidad2)+"x2";
        else
            daño1 = "\nDaño: "+unidad1.calcularDaño(unidad1, unidad2);
        
        if (unidad2.isDoble(unidad1))
            daño2 = unidad2.calcularDaño(unidad2, unidad1)+"x2 :Daño";
        else
            daño2 = unidad2.calcularDaño(unidad2, unidad1)+" :Daño";
        
        String infocombate = "-- Información del combate --\n\nVida: "+unidad1.getPuntosVida()+" - "+
                unidad2.getPuntosVida()+" :Vida\n"+unidad1.getNombre()+" V/S "+unidad2.getNombre()+
                "\nGolpe: "+unidad1.calcularGolpe(unidad1, unidad2)+" - "+unidad2.calcularGolpe(unidad2, unidad1)+" :Golpe"+
                daño1+" - "+daño2+"\nCritico: "+unidad1.calcularCritico(unidad1, unidad2)+
                " - "+unidad2.calcularCritico(unidad2, unidad1)+" :Critico";
        System.out.println(infocombate);
        
        while (unidad1.isAlive() && unidad2.isAlive()) 
        {
            System.out.println("\n-- Ronda "+cuenta+" --\n"+unidad1.getNombre()+" - "+unidad2.getNombre()+"\nVida: "+
                    unidad1.getPuntosVida()+" - "+unidad2.getPuntosVida()+" :Vida\n");
            
        for (int i = 0; i < unidad1.cantidadAtaques(unidad2); i++) 
        {
            if (unidad2.isAlive())
                unidad1.atacar(unidad2);
        }

        // Si sigue viva la unidad 2, contraataca
        if (unidad2.isAlive())
        {
            for (int i = 0; i < unidad2.cantidadAtaques(unidad1); i++) 
            {
                if (unidad1.isAlive())
                    unidad2.atacar(unidad1);
            }
        }
            cuenta += 1;
        }

        if (!unidad1.isAlive())
        {
            System.out.println("\n"+unidad1.getNombre() + " ha sido derrotado.");
            unidad2.ganarExperiencia(100);
        }
            
        else 
        {
            System.out.println("\n"+unidad2.getNombre() + " ha sido derrotado.");
            unidad1.ganarExperiencia(100);
        }
            
    }
}