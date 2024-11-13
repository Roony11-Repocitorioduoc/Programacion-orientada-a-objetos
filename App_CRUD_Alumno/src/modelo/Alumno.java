package modelo;

public class Alumno 
{
    private int id;
    private String nombre;
    private int edad;
    private String carrera;

    public Alumno() {}

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public int getEdad() { return edad; }
    public void setEdad(int edad) { this.edad = edad; }
    public String getCarrera() { return carrera; }
    public void setCarrera(String carrera) { this.carrera = carrera; }

    @Override
    public String toString() 
    {
        return "Alumno{" + "id=" + id + ", nombre=" + nombre + ", edad=" + edad + ", carrera=" + carrera + '}';
    }
    
    
}
