package herencia;

public class Estudiante extends Persona
{
    private String carrera;
    
    public String getCarrera() 
    {
        return carrera;
    }

    public void setCarrera(String carrera) 
    {
        this.carrera = carrera;
    }

    public Estudiante(String nombre, int edad, char sexo, String carrera) 
    {
        super(nombre, edad, sexo);
        this.carrera = carrera;
    }

    public Estudiante() 
    {
        super();
        this.carrera = "Sin carrera";
    }
    
    public void imprimir()
    {
        String info;
        
        info = "Carrera: "+this.carrera;
        
        super.imprimir();
        System.out.println(info);
    }
}
