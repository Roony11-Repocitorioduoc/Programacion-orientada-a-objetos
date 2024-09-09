package aerolinea;

public class Pasaje 
{
    private int numVuelo;
    private Pasajero pasajero;
    private String destino;
    private String fecha;
    private double valor;
    private int numAsiento;
    private boolean equipaje;

    public int getNumVuelo() 
    {
        return numVuelo;
    }

    public void setNumVuelo(int numVuelo) 
    {
        this.numVuelo = numVuelo;
    }

    public Pasajero getPasajero() 
    {
        return pasajero;
    }

    public void setPasajero(Pasajero pasajero) 
    {
        this.pasajero = pasajero;
    }

    public String getDestino() 
    {
        return destino;
    }

    public void setDestino(String destino) 
    {
        if (!destino.isBlank())
            this.destino = destino.trim();
        else
            System.out.println("No es posible hacer esta transaccion (DESTINO)");
    }

    public String getFecha() 
    {
        return fecha;
    }

    public void setFecha(String fecha) 
    {
        if (!fecha.isBlank())
            this.fecha = fecha;
        else
            System.out.println("No es posible hacer esta transaccion (FECHA)");
    }

    public double getValor() 
    {
        return valor;
    }

    public void setValor(double valor) 
    {
        if (valor >= 10000)
            this.valor = valor;
        else
            System.out.println("No es posible hacer esta transaccion (VALOR)");
    }

    public int getNumAsiento() 
    {
        return numAsiento;
    }

    public void setNumAsiento(int numAsiento) 
    {
        if (1>=numAsiento || numAsiento<=90)
            this.numAsiento = numAsiento;
        else
            System.out.println("No es posible hacer esta transaccion (NUMERO DE ASIENTO)");
    }

    public boolean isEquipaje() 
    {
        return equipaje;
    }

    public void setEquipaje(boolean equipaje) 
    {
        this.equipaje = equipaje;
    }

    public Pasaje() 
    {
        this.setNumVuelo(1);
        this.setPasajero(new Pasajero());
        this.setDestino("Sin destino");
        this.setFecha("Sin fecha");
        this.setValor(10000);
        this.setNumAsiento(1);
        this.setEquipaje(false);
    }

    public Pasaje(int numVuelo, Pasajero pasajero, String destino, String fecha, double valor, int numAsiento, boolean equipaje) 
    {
        this.setNumVuelo(numVuelo);
        this.setPasajero(pasajero);
        this.setDestino(destino);
        this.setFecha(fecha);
        this.setValor(valor);
        this.setNumAsiento(numAsiento);
        this.setEquipaje(equipaje);
    }
    
    public void reajusteValor()
    {
        String info;
        if (this.isEquipaje())
        {
            this.setValor(this.getValor()*1.20);
            
            info = "Pasaje con destino a: "+this.getDestino()+"\nNombre del propietario: "+this.getPasajero().getNombre()+
                    " "+this.getPasajero().getApellido()+"\nNumero de vuelo: "+this.getNumVuelo()+
                    "\nFecha de vuelo: "+this.getFecha()+"\nValor original: "+(this.getValor()/1.20)+
                    "\nValor con recargo de equipaje: "+this.getValor()+"\nNumero de asiento: "+this.getNumAsiento();
        }
        else
            info = "No tienes equipaje asociado";
        
        System.out.println(info);
        
    }
}
