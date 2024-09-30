package herencia;

public class Docente extends Persona
{
    private String asignatura;
    private String tituloProfesional;

    public String getAsignatura() {
        return asignatura;
    }

    public void setAsignatura(String asignatura) 
    {
        this.asignatura = asignatura;
    }

    public String getTituloProfesional() 
    {
        return tituloProfesional;
    }

    public void setTituloProfesional(String tituloProfesional) 
    {
        this.tituloProfesional = tituloProfesional;
    }

    public Docente(String nombre, int edad, char sexo, String asignatura, String tituloProfesional) 
    {
        super(nombre, edad, sexo);
        this.asignatura = asignatura;
        this.tituloProfesional = tituloProfesional;
    }
    
    public Docente()
    {
        super();
        this.asignatura = "No info";
        this.tituloProfesional = "No info";
    }
    
    public void imprimir()
    {
        String info;
        
        info = "Asignatura: "+this.asignatura+"\nTitulo: "+
                this.tituloProfesional;
                
        super.imprimir();
        System.out.println(info);
    }
}
