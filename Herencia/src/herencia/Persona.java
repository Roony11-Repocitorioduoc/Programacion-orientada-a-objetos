package herencia;

public class Persona 
{
    private String nombre;
    private int edad;
    private char sexo;
    
    // Metodos habituales de la clase

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

    public Persona(String nombre, int edad, char sexo) 
    {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
    }

    public Persona() 
    {
        this("Alvaro", 22, 'H');
    }
    
    public void imprimir()
    {
        String info;
        
        info = "Datos\nNombre: "+this.nombre+"\nEdad: "+this.edad+" años\nSexo: "+
                this.sexo;
        
        System.out.println(info);
    }
    
    
}
