package herencia;

public class EstudianteTrabajador extends Estudiante
{
    private String trabajo;

    public String getTrabajo() 
    {
        return trabajo;
    }

    public void setTrabajo(String trabajo) 
    {
        this.trabajo = trabajo;
    }

    public EstudianteTrabajador(String nombre, int edad, char sexo, String carrera, String trabajo) 
    {
        super(nombre, edad, sexo, carrera);
        this.trabajo = trabajo;
    }

    public EstudianteTrabajador() 
    {
        super();
        this.trabajo = "No info";
    }
    
    public void imprimir()
    {
        super.imprimir();
        System.out.println("Trabajo: "+this.trabajo);
    }
    
    
}
