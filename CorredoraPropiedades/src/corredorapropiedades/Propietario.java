package corredorapropiedades;

public class Propietario 
{
    private String nombre;
    private int edad;
    private char sexo;
    private boolean casado;

    public Propietario(String nombre, int edad, char sexo, boolean casado) 
    {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.casado = casado;
    }
    
    public Propietario()
    {
        this("Sin nombre", 18, 'X', true);
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

    public char getSexo() 
    {
        return sexo;
    }

    public void setSexo(char sexo) 
    {
        this.sexo = sexo;
    }

    public boolean isCasado() 
    {
        return casado;
    }

    public void setCasado(boolean casado) 
    {
        this.casado = casado;
    }
    
    
}
