package modelo;

public class Producto 
{
    private String codigo;
    private String nombreProducto;
    private String descripcionProducto;
    private int valorUnitario;
    private boolean oferta;
    private int stock;
    private boolean descontinuado;
    
    private String NO_INFO = "no info";

    public Producto() 
    {
        this.codigo = NO_INFO;
        this.nombreProducto = NO_INFO;
        this.descripcionProducto = NO_INFO;
        this.valorUnitario = 0;
        this.oferta = false;
        this.stock = 0;
        this.descontinuado = false;
    }

    public String getCodigo() { return codigo; }
    public void setCodigo(String codigo) { this.codigo = codigo; }

    public String getNombreProducto() { return nombreProducto; }
    public void setNombreProducto(String nombreProducto) { this.nombreProducto = nombreProducto; }

    public String getDescripcionProducto() { return descripcionProducto; }
    public void setDescripcionProducto(String descripcionProducto) { this.descripcionProducto = descripcionProducto; }

    public int getValorUnitario() { return valorUnitario; }
    public void setValorUnitario(int valorUnitario) { this.valorUnitario = valorUnitario; }

    public boolean isOferta() { return oferta; }
    public void setOferta(boolean oferta) { this.oferta = oferta; }

    public int getStock() { return stock; }
    public void setStock(int stock) { this.stock = stock; }

    public boolean isDescontinuado() { return descontinuado; }
    public void setDescontinuado(boolean descontinuado) { this.descontinuado = descontinuado; }
    
    @Override
    public String toString()
    {
        String string = "\n-- Producto --\nCodigo: "+this.codigo+"\nNombre: "+this.nombreProducto
                +"\nDescripcion: "+this.descripcionProducto+"\nValor Unitario: $"+this.valorUnitario
                +"\nEn oferta: "+this.oferta+"\nStock: "+this.stock+"\nDescontinuado: "+this.descontinuado;
        
        return string;
    }
}
