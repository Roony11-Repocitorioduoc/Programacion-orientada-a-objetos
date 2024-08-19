package producto;

public class Empleado 
{
    private String rut;
    private String nombre;
    private int edad;
    private char sexo;
    private boolean casado;
    private String cargo;
    private double sueldoBase;

    public Empleado(String rut, String nombre, int edad, char sexo, boolean casado, String cargo, int sueldoBase) 
    {
        this.rut = rut;
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.casado = casado;
        this.cargo = cargo;
        this.sueldoBase = sueldoBase;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public boolean isCasado() {
        return casado;
    }

    public void setCasado(boolean casado) {
        this.casado = casado;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getSueldoBase() {
        return sueldoBase;
    }

    public void setSueldoBase(double sueldoBase) {
        this.sueldoBase = sueldoBase;
    }
    
    public void imprimir()
    {    
        System.out.println("---Info---");
        System.out.println("Rut: "+this.rut);
        System.out.println("Nombre: "+this.nombre);
        System.out.println("Edad: "+this.edad);
        System.out.println("Casado: "+this.casado);
        System.out.println("Cargo: "+this.cargo);
        System.out.println("Sueldo Base: "+this.sueldoBase);
    }
}
