package appmusical;

public class Persona 
{
    private String nombre;
    private int edad;
    private char sexo;

    public String getNombre() 
    {
        return nombre;
    }

    public void setNombre(String nombre) 
    {
        if (!nombre.isBlank())
            this.nombre = nombre;
        else
            this.nombre = "vacío";
    }

    public int getEdad() 
    {
        return edad;
    }

    public void setEdad(int edad) 
    {
        if (edad>0)
            this.edad = edad;
        else
            this.edad = 18;
    }

    public char getSexo() 
    {
        return sexo;
    }

    public void setSexo(char sexo) 
    {
        if (sexo == 'F' || sexo == 'M')
            this.sexo = sexo;
        else
            this.sexo = 'X';
    }

    public Persona(String nombre, int edad, char sexo) 
    {
        this.setNombre(nombre);
        this.setEdad(edad);
        this.setSexo(sexo);
    }

    public Persona() 
    {
        this("Joaquin", 18, 'H');
    }
}
