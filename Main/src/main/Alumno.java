package main;

public class Alumno 
{
    private String nombre;
    private String rut;
    private int edad;
    private boolean casado;
    private char sexo;
    private Carrera carrera;

    public String getNombre() 
    {
        return nombre;
    }

    public void setNombre(String nombre) 
    {
        this.nombre = nombre;
    }

    public String getRut() 
    {
        return rut;
    }

    public void setRut(String rut) 
    {
        this.rut = rut;
    }

    public int getEdad() 
    {
        return edad;
    }

    public void setEdad(int edad) 
    {
        this.edad = edad;
    }

    public boolean isCasado() 
    {
        return this.casado;
    }

    public void setCasado(boolean casado) 
    {
        this.casado = casado;
    }

    public char getSexo() 
    {
        return sexo;
    }

    public void setSexo(char sexo) 
    {
        this.sexo = sexo;
    }
    
    public Carrera getCarrera() 
    {
        return carrera;
    }

    public void setCarrera(Carrera carrera) 
    {
        this.carrera = carrera;
    }

    public Alumno() 
    {
        this.setNombre("default");
        this.setRut("11111111");
        this.setEdad(18);
        this.setCasado(false);
        this.setSexo('X');
        this.setCarrera(new Carrera());
    }

    public Alumno(String nombre, String rut, int edad, boolean casado,
    char sexo, Carrera carrera) 
    {
        this.setNombre(nombre);
        this.setRut(rut);
        this.setEdad(edad);
        this.setCasado(casado);
        this.setSexo(sexo);
        this.setCarrera(carrera);
    }
    
    public void imprimir()
    {
        System.out.println("|-Datos del estudiante-|");
        System.out.println("Nombre: "+this.getNombre());
        System.out.println("Rut: "+this.getRut());
        System.out.println("Edad: "+this.getEdad());
        System.out.println("Casado: "+this.isCasado());
        System.out.println("Sexo: "+this.getSexo());
        System.out.println("Carrera: "+this.carrera.datos());         
    }
    
    public String nombreCarrera()
    {
        return "Nombre Alumno: "+this.getNombre()+
        " - Nombre de la Carrera: "+this.carrera.getNombre();
    }
    
    public String mostrarCategoria()
    {
        String categoria;
        
        if (this.getEdad()>=25 && this.getEdad()<=30)
            categoria =  "Categoria: Segundo nivel";
        else if (this.getEdad()>30)
            categoria =  "Categoria: Tercer nivel";
        else
            categoria =  "Categoria: Primer nivel";
        
        return categoria;
    }
    
    public String promediarNotas(double nota1, double nota2, double nota3)
    {
        String condicion;
        if (((nota1+nota2+nota3)/3)>=4)
            condicion = "Promedio: "+((nota1+nota2+nota3)/3)+
            " - Condicion: Aprobado";
        else
            condicion = "Promedio: "+((nota1+nota2+nota3)/3)+
            " - Condicion: Reprobado";
        
        return condicion;
    }
    
    public void datosCarrera()
    {
        System.out.println("Carrera: "+this.carrera.getNombre()
        +" - Duracion: "+this.carrera.getDuracion()+" Años");
    }
}
