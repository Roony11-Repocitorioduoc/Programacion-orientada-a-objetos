package aerolinea;

public class Pasajero 
{
    private String rut;
    private String nombre;
    private String apellido;
    private int edad;

    public String getRut() 
    {
        return rut;
    }

    public void setRut(String rut) 
    {
        if (!rut.isBlank())
            this.rut = rut.trim();
        else
            System.out.println("No es posible hacer esta transaccion (RUT)");
    }

    public String getNombre() 
    {
        return nombre;
    }

    public void setNombre(String nombre) 
    {
        if (!nombre.isBlank())
            this.nombre = nombre.trim();
        else
            System.out.println("No es posible hacer esta transaccion (NOMBRE)");
    }

    public String getApellido() 
    {
        return apellido;
    }

    public void setApellido(String apellido) 
    {
        if (!apellido.isBlank())
            this.apellido = apellido.trim();
        else
            System.out.println("No es posible hacer esta transaccion (APELLIDO)");
    }

    public int getEdad() 
    {
        return edad;
    }

    public void setEdad(int edad) 
    {
        this.edad = edad;
    }

    public Pasajero() 
    {
        this.setRut("No rut");
        this.setNombre("Sin nombre");
        this.setApellido("Sin apellido");
        this.setEdad(18);
    }

    public Pasajero(String rut, String nombre, String apellido, int edad) 
    {
        this.setRut(rut);
        this.setNombre(nombre);
        this.setApellido(apellido);
        this.setEdad(edad);
    }
}
