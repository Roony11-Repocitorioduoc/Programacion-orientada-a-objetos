package herenciaabstraccion;

// abstract class no puede ser instanciada
// no puede existir como clase en si
// Esta clase solo sirve de molde para otras estructuras

// Soporta metodos concretos y abstractos

public abstract class Empleado
{
    private String nombre;
    private int edad;
    private String cargo;

    public String getNombre() 
    {
        return nombre;
    }

    public void setNombre(String nombre) 
    {
        this.nombre = nombre;
    }

    public int getEdad() 
    {
        return edad;
    }

    public void setEdad(int edad) 
    {
        this.edad = edad;
    }

    public String getCargo() 
    {
        return cargo;
    }

    public void setCargo(String cargo) 
    {
        this.cargo = cargo;
    }

    public Empleado(String nombre, int edad, String cargo) 
    {
        this.nombre = nombre;
        this.edad = edad;
        this.cargo = cargo;
    }

    public Empleado() 
    {
        this("Sin info", 18, "Sin info");
    }
    
    public void imprimir()
    {
        String info;
        
        info = "--Información empleado--\nNombre: "+this.nombre+"\nEdad: "+this.edad+
                "\nCargo: "+this.cargo;
        
        System.out.println(info);
    }
    
    // Creación de metodos abstractos, son metodos que solo son la cabecera,
    // sin cuerpo. Es tarea de las clases que heredan implementar el metodo
    
    public abstract double calcularSueldoLiquido();
    
    public abstract void imprimirLiquidacionSueldo();
}
