package main;

public class Carrera 
{
        private int codigo;
    private String nombre;
    private int duracion;
    private String titulo;

    public int getCodigo() 
    {
        return codigo;
    }

    public void setCodigo(int codigo) 
    {
        if (codigo==0)
            System.out.println("El codigo debe ser mayor que 0");
        else
            this.codigo = codigo;
    }

    public String getNombre() 
    {
        return nombre;
    }

    public void setNombre(String nombre) 
    {
        this.nombre = nombre;
    }

    public int getDuracion() 
    {
        return duracion;
    }

    public void setDuracion(int duracion) 
    {
        if (duracion>4 || duracion<2)
            System.out.println("La carrera debe durar entre 2 y 4 años");
        else
            this.duracion = duracion;
    }

    public String getTitulo() 
    {
        return titulo;
    }

    public void setTitulo(String titulo) 
    {
        this.titulo = titulo;
    }

    public Carrera() 
    {
        this.setCodigo(1);
        this.setNombre("default");
        this.setDuracion(2);
        this.setTitulo("default");
    }

    public Carrera(int codigo, String nombre, int duracion, String titulo) 
    {
        this.setCodigo(codigo);
        this.setNombre(nombre);
        this.setDuracion(duracion);
        this.setTitulo(titulo);
    }
    
    public void imprimir()
    {
        System.out.println("|-Datos de la carrera-|");
        System.out.println("Codigo: "+this.getCodigo());
        System.out.println("Nombre: "+this.getNombre());
        System.out.println("Duracion: "+this.getDuracion());
        System.out.println("Titulo: "+this.getTitulo());
        System.out.println("|---------------------|");
    }
    
    public String datos()
    {
        return "'Codigo: "+this.getCodigo()+" - Nombre: "+this.getNombre()+
        " - Duracion: "+this.getDuracion()+" - Titulo: "+this.getTitulo()+"'";
    } 
}
