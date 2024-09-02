package cerveceria;

public class Tarjeta 
{
    private String id;
    private char estado;
    private int añoInscripcion;
    private double saldo;

    public String getId() 
    {
        return id;
    }

    public void setId(String id) 
    {       
        if(id.trim().length()>0) // trim() Elimina espacios en blanco, length cuenta los caracteres
            this.id = id;
        else
            System.out.println("No puede ser cadena vacia!");
    }

    public char getEstado() 
    {
        return estado;
    }

    public void setEstado(char estado) 
    {
        if (estado == 'A' || estado == 'N' || estado == 'S')
            this.estado = estado;
        else
            System.out.println("Ingresa una opcion valida! (A - N - S)");
    }

    public int getAñoInscripcion() 
    {
        return añoInscripcion;
    }

    public void setAñoInscripcion(int añoInscripcion) 
    {
        if (añoInscripcion>=1980)
            this.añoInscripcion = añoInscripcion;
        else
            System.out.println("El año debe ser mayor o igual a 1980");
    }

    public double getSaldo() 
    {
        return saldo;
    }

    public void setSaldo(double saldo) 
    {
        this.saldo = saldo;
    }

    public Tarjeta() 
    {
        this.setId("0");
        this.setEstado('S');
        this.setAñoInscripcion(1980);
        this.setSaldo(0);
    }

    public Tarjeta(String id, char estado, int añoInscripcion, double saldo) 
    {
        this.setId(id);
        this.setEstado(estado);
        this.setAñoInscripcion(añoInscripcion);
        this.setSaldo(saldo);
    } 
}
