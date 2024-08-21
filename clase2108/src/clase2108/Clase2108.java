package clase2108;

public class Clase2108 {

    public static void main(String[] args) 
    {
        Cancion cancion1 = new Cancion();
        
        cancion1.imprimir();
        cancion1.imprimirVivo();
        cancion1.detalles();
        
        Cancion cancion2 = new Cancion("Mi mundo", "Yo", 1.3, "sfx", false);
        cancion2.imprimir();
        cancion2.imprimirVivo();
        cancion2.detalles();
    }
    
}
