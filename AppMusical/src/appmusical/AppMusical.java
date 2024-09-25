package appmusical;

public class AppMusical 
{
    public static void main(String[] args) 
    {
        Cancion can1 = new Cancion("En la europa", new Persona("Chamaquito12", 12, 'H'), new Tiempo(4, 0), true);
        Cancion can2 = new Cancion("En la itala", new Persona("jajajaja", 15, 'M'), new Tiempo(2, 0), true);
        
        can1.imprimirCancion();
        can2.imprimirCancion();
        
        Album alb1 = new Album("Mambo extremo");
        
        alb1.agregarCancion(can1);
        alb1.agregarCancion(can2);
        
        alb1.agregarMinutosCancion(55);
        
        alb1.listarCancionesEnVivoEdad();
    }
    
}
