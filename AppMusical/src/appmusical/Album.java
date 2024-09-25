package appmusical;

import java.util.ArrayList;

public class Album 
{
    private String nombre;
    private ArrayList<Cancion> canciones;

    public Album(String nombre) 
    {
        this.nombre = nombre;
        this.canciones = new ArrayList<>();
    }
    
    public void agregarCancion(Cancion cancion)
    {
        if (!cancion.getNombre().isBlank() && cancion.getDuracion().getMinutos()>=3)
            
            this.canciones.add(cancion);
        else
            System.out.println("La cancion no cumple los requisitos");
    }
    
    public void listarCancionesEnVivoEdad()
    {
        boolean encontrado = false;
        
        System.out.println("\nCanciones del Album en vivo con interpretes con menos de 30 años\n");
        
        for (Cancion cancion : canciones) 
        {
            if (cancion.isEnVivo() && cancion.getInterprete().getEdad()<30)
            {
                cancion.imprimirCancion();
                encontrado = true;
            }
        }
        
        if (!encontrado)
            System.out.println("No se han encontrado canciones que cumplan los requisitos!");
    }
    
    public void agregarMinutosCancion(int minutos)
    {
        for (Cancion cancion : canciones) 
        {
            if (minutos+cancion.getDuracion().getMinutos()>59)
                System.out.println("No puede superar los 59 minutos!");
            else
                cancion.getDuracion().setMinutos(cancion.getDuracion().getMinutos()+minutos);
        }
    }
}
