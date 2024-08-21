package clase2108;

public final class Cancion 
{
    private String nombre;
    private String interprete;
    private double duracionMin;
    private String formato;
    private boolean enVivo;

    public String getNombre() 
    {
        return nombre;
    }

    public final void setNombre(String nombre) 
    {
        this.nombre = nombre;
    }

    public String getInterprete() 
    {
        return interprete;
    }

    public void setInterprete(String interprete) 
    {
        this.interprete = interprete;
    }

    public double getDuracionMin() 
    {
        return duracionMin;
    }

    public void setDuracionMin(double duracionMin) 
    {
        if (duracionMin>0)
        {
            this.duracionMin = duracionMin;
        }
        else
        {
            this.duracionMin = 0;
            System.out.println("No se acepta esa duracion");
        }
    }

    public String getFormato() 
    {
        return formato;
    }

    public void setFormato(String formato) 
    {
        if (formato.equalsIgnoreCase("mp3") || formato.equalsIgnoreCase("wav") || formato.equalsIgnoreCase("aac"))
        {
            this.formato = formato;
        }
        else
        {
            this.formato = "none";
            System.out.print("No es correcto el formato");
        }
    }

    public boolean isEnVivo() 
    {
        return enVivo;
    }

    public void setEnVivo(boolean enVivo) 
    {
        this.enVivo = enVivo;
    }
    
    public Cancion()
    {
        this.setNombre("Hola Mundo");
        this.setInterprete("Mi mundo feliz");
        this.setDuracionMin(2.5);
        this.setFormato("mp3");
        this.setEnVivo(true);
        
        this.ajustarTiempo();
        
    }
    /**
     * @param nombre
     * @param interprete
     * @param duracionMin
     * @param formato
     * @param enVivo 
     */
    public Cancion(String nombre, String interprete, double duracionMin, String formato, boolean enVivo) 
    {
        this.setNombre(nombre);
        this.setInterprete(interprete);
        this.setDuracionMin(duracionMin);
        this.setFormato(formato);
        this.setEnVivo(enVivo);
        
        this.ajustarTiempo();
    }
    
    public void imprimir()
    {
        System.out.println("");
        System.out.println("Nombre: "+this.nombre);
        System.out.println("Interprete: "+this.interprete);
        System.out.println("Duración: "+this.duracionMin+" Minutos");
        System.out.println("formato: ."+this.formato);
        System.out.println("En vivo: "+this.enVivo);
        System.out.println("");
    }
    
    public void imprimirVivo()
    {
        if (this.enVivo==true)
        {
            System.out.println("Cancion en vivo!");
            System.out.println("Nombre: "+this.nombre);
            System.out.println("Interprete: "+this.interprete);
            System.out.println("Duración: "+this.duracionMin+" Minutos");
            System.out.println("formato: ."+this.formato);
            System.out.println("En vivo: "+this.enVivo);
            System.out.println("");
        }
        else
        {
            System.out.println("La cancion no esta en vivo!");
            System.out.println("");
        }
    }
    
    public String detalles()
    {
        return "Titulo: "+this.nombre+" Interprete: "+this.interprete+" Duración: "+this.duracionMin+" Minutos";
    }
    
    public void ajustarTiempo()
    {
        if (this.formato=="mp3")
        {
            this.setDuracionMin(this.duracionMin+1);
        }
        
        if (this.enVivo==true)
        {
            this.setDuracionMin(this.duracionMin*0.9);
        }
    }
}
