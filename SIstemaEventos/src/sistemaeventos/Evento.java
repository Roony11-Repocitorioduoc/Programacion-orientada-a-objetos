package sistemaeventos;

public class Evento 
{
    private int diaInicioEvento;
    private int diaTerminoEvento;
    private double precioEvento;
    private String nombreEvento;
    private String lugarEvento;

    public int getDiaInicioEvento() 
    {
        return diaInicioEvento;
    }

    public void setDiaInicioEvento(int diaInicioEvento) 
    {
        this.diaInicioEvento = diaInicioEvento;
    }

    public int getDiaTerminoEvento() 
    {
        return diaTerminoEvento;
    }

    public void setDiaTerminoEvento(int diaTerminoEvento) 
    {
        if (diaTerminoEvento>this.diaInicioEvento)
            this.diaTerminoEvento = diaTerminoEvento;
        else
            System.out.println("El dia de termino no puede ser menor al de inicio");
    }

    public double getPrecioEvento() 
    {
        return precioEvento;
    }

    public void setPrecioEvento(double precioEvento) 
    {
        if (precioEvento>150000)
            this.precioEvento = precioEvento;
        else
            System.out.println("Debe ser mayor a $150.000");
    }

    public String getNombreEvento() 
    {
        return nombreEvento;
    }

    public void setNombreEvento(String nombreEvento) 
    {
        if (!nombreEvento.isBlank())
            this.nombreEvento = nombreEvento;
        else
            System.out.println("No puede ser una cadena vacia!");
    }

    public String getLugarEvento() 
    {
        return lugarEvento;
    }

    public void setLugarEvento(String lugarEvento) 
    {
        if (!lugarEvento.isBlank())
            this.lugarEvento = lugarEvento;
        else
            System.out.println("No puede ser una cadena vacia!");
    }

    public Evento() 
    {
        this.setDiaInicioEvento(1);
        this.setDiaTerminoEvento(2);
        this.setPrecioEvento(150001);
        this.setNombreEvento("Sin nombre");
        this.setLugarEvento("Sin lugar");
    }

    public Evento(int diaInicioEvento, int diaTerminoEvento, double precioEvento, String nombreEvento, String lugarEvento) {
        this.setDiaInicioEvento(diaInicioEvento);
        this.setDiaTerminoEvento(diaTerminoEvento);
        this.setPrecioEvento(precioEvento);
        this.setNombreEvento(nombreEvento);
        this.setLugarEvento(lugarEvento);
    }
}
