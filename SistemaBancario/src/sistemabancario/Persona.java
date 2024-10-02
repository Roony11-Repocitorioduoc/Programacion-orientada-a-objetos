package sistemabancario;

public class Persona 
{
    private String run;
    private String nombre;
    private int edad;
    private String ocupacion;

    public String getRun() 
    {
        return run;
    }

    public void setRun(String run) 
    {
        this.run = run;
    }

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

    public String getOcupacion() 
    {
        return ocupacion;
    }

    public void setOcupacion(String ocupacion) 
    {
        this.ocupacion = ocupacion;
    }

    public Persona(String run, String nombre, int edad, String ocupacion) 
    {
        this.run = run;
        this.nombre = nombre;
        this.edad = edad;
        this.ocupacion = ocupacion;
    }

    public Persona() 
    {
        this("0", "Sin nombre", 18, "Sin ocupación");
    }
  
}
