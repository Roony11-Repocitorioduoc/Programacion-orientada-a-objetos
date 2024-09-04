package sistemaeventos;

public class Cliente 
{
    private Evento eventoCliente;
    private char tipoCliente;
    private String nombreCliente;
    private int edadCliente;
    private char sexoCliente;

    public Evento getEventoCliente() 
    {
        return eventoCliente;
    }

    public void setEventoCliente(Evento eventoCliente) 
    {
        this.eventoCliente = eventoCliente;
    }

    public char getTipoCliente() 
    {
        return tipoCliente;
    }

    public void setTipoCliente(char tipoCliente) 
    {
        if (tipoCliente=='N' || tipoCliente=='A')
            this.tipoCliente = tipoCliente;
        else
            System.out.println("El cliente solo puede ser catalogado como N o A");
    }

    public String getNombreCliente() 
    {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) 
    {
        if (!nombreCliente.isBlank())
            this.nombreCliente = nombreCliente;
        else
            System.out.println("No puede ser una cadena vacia!");
    }

    public int getEdadCliente() 
    {
        return edadCliente;
    }

    public void setEdadCliente(int edadCliente) 
    {
        this.edadCliente = edadCliente;
    }

    public char getSexoCliente() 
    {
        return sexoCliente;
    }

    public void setSexoCliente(char sexoCliente) 
    {
        this.sexoCliente = sexoCliente;
    }

    public Cliente() 
    {
        this.setEventoCliente(new Evento());
        this.setTipoCliente('N');
        this.setNombreCliente("Sin nombre");
        this.setEdadCliente(18);
        this.setSexoCliente('X');
    }

    public Cliente(Evento eventoCliente, char tipoCliente, String nombreCliente, int edadCliente, char sexoCliente) {
        this.setEventoCliente(eventoCliente);
        this.setTipoCliente(tipoCliente);
        this.setNombreCliente(nombreCliente);
        this.setEdadCliente(edadCliente);
        this.setSexoCliente(sexoCliente);
    }

    public void mostrarEvento()
    {
        String info;
        
        info = "-----------------"+
            "\nNombre organizador: "+this.getNombreCliente()+
            "\nDia inicio: "+this.getEventoCliente().getDiaInicioEvento()+
            "\nDia termino: "+this.getEventoCliente().getDiaTerminoEvento()+
            "\nPrecio: "+this.getEventoCliente().getPrecioEvento()+
            "\nNombre evento: "+this.getEventoCliente().getNombreEvento()+
            "\nLugar evento: "+this.getEventoCliente().getLugarEvento()+
            "\n-----------------";
        
        System.out.println("Datos del evento:\n"+info);
    }
    
    public void aplicarDescuento(double porcentaje)
    {
        double porcentajeDescuento;
        porcentajeDescuento = (100-porcentaje)/100;
        
        if (this.getTipoCliente()=='N' || this.getEventoCliente().getPrecioEvento()==1000000)
        {
            this.getEventoCliente().setPrecioEvento(this.getEventoCliente().getPrecioEvento()*porcentajeDescuento);
            System.out.println("Se ha hecho un descuento de "+porcentaje+"%\nPrecio final: $"+this.getEventoCliente().getPrecioEvento());
        }
        else
            System.out.println("No se aplicara descuento");
    }
    
    public String retornarDatos()
    {
        String info;
        
        if (this.getEventoCliente().getPrecioEvento()>1000000.0)
            info = this.getEventoCliente().getNombreEvento()+" "+this.getEventoCliente().getLugarEvento();
        else
            info = "";
        
        return info;
    }
    
    public void recordarEvento(int dia)
    {
        if (dia+1==this.getEventoCliente().getDiaTerminoEvento())
            System.out.println("Mañana sera tu evento! corre por un grandioso dia");
        else
            System.out.println("No tienes eventos asociados para mañana!");
            
    }
}
