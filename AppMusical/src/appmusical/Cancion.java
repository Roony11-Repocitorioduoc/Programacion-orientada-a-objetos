package appmusical;

public class Cancion 
{
    private String nombre;
    private Persona interprete;
    private Tiempo duracion;
    private boolean enVivo;

    public String getNombre() 
    {
        return nombre;
    }

    public void setNombre(String nombre) 
    {
        this.nombre = nombre;
    }

    public Persona getInterprete() 
    {
        return interprete;
    }

    public void setInterprete(Persona interprete) 
    {
        this.interprete = interprete;
    }

    public Tiempo getDuracion() 
    {
        return duracion;
    }

    public void setDuracion(Tiempo duracion) 
    {
        this.duracion = duracion;
    }

    public boolean isEnVivo() 
    {
        return enVivo;
    }

    public void setEnVivo(boolean enVivo) 
    {
        this.enVivo = enVivo;
    }

    public Cancion(String nombre, Persona interprete, Tiempo duracion, boolean enVivo) {
        this.nombre = nombre;
        this.interprete = interprete;
        this.duracion = duracion;
        this.enVivo = enVivo;
    }
    
    public Cancion() 
    {
        this("Sin nombre", new Persona(), new Tiempo(), true);
    }
    
    public void imprimirCancion()
    {
        String info;
        
        info = "Información de la canción\nNombre de la canción: "+this.nombre+
                "\nNombre del interprete: "+this.interprete.getNombre()+
                "\nDuracion de la canción: "+this.duracion.mostrarDuracion()+
                "\nEn vivo: "+this.enVivo;
        
        System.out.println(info);
    }
}
