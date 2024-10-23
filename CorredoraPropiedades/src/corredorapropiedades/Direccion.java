package corredorapropiedades;

public class Direccion 
{
    private String direccion;
    private int numero;
    private String comuna;

    public Direccion(String direccion, int numero, String comuna) 
    {
        this.direccion = direccion;
        this.numero = numero;
        this.comuna = comuna;
    }
    
    public Direccion()
    {
        this("Sin calle", 0, "Lo Prado");
    }

    public String getDireccion() 
    {
        return direccion;
    }

    public void setDireccion(String direccion) 
    {
        this.direccion = direccion;
    }

    public int getNumero() 
    {
        return numero;
    }

    public void setNumero(int numero) 
    {
        this.numero = numero;
    }

    public String getComuna() 
    {
        return comuna;
    }

    public void setComuna(String comuna) 
    {
        this.comuna = comuna;
    }
}
