package producto;

public class Producto 
{
    private String nombre;
    private String marca;
    private double precio;
    private boolean oferta;

    public Producto(String nombre, String marca, double precio, boolean oferta) 
    {
        this.nombre = nombre;
        this.marca = marca;
        this.precio = precio;
        this.oferta = oferta;
    }
    
    public String getNombre()
    {
        return nombre;
    }
    
    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }

    public String getMarca() 
    {
        return marca;
    }

    public void setMarca(String marca) 
    {
        this.marca = marca;
    }

    public double getPrecio() 
    {
        return precio;
    }

    public void setPrecio(double precio) 
    {
        this.precio = precio;
    }

    public boolean isOferta() 
    {
        return oferta;
    }

    public void setOferta(boolean oferta) 
    {
        this.oferta = oferta;
    }

    public void imprimir()
    {
        System.out.println("---Info---");
        System.out.println("Nombre: "+this.nombre);
        System.out.println("Marca: "+this.marca);
        System.out.println("Precio: "+this.precio);
        System.out.println("Oferta: "+this.oferta);
    }
}
