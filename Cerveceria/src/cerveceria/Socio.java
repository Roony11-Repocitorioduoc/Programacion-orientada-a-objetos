package cerveceria;

public class Socio 
{
    private String rut;
    private String nombre;
    private int edad;
    private Tarjeta tarjeta;

    public String getRut() 
    {
        return rut;
    }

    public void setRut(String rut) 
    {
        if(rut.trim().length()>0) // trim() Elimina espacios en blanco, length cuenta los caracteres
            this.rut = rut;
        else
            System.out.println("No puede ser cadena vacia!");
    }

    public String getNombre() 
    {
        return nombre;
    }

    public void setNombre(String nombre) 
    {
        if(nombre.trim().length()>0) // trim() Elimina espacios en blanco, length cuenta los caracteres
            this.nombre = nombre;
        else
            System.out.println("No puede ser cadena vacia!");
    }

    public int getEdad() 
    {
        return edad;
    }

    public void setEdad(int edad) 
    {
        this.edad = edad;
    }

    public Tarjeta getTarjeta() 
    {
        return tarjeta;
    }

    public void setTarjeta(Tarjeta tarjeta) 
    {
        this.tarjeta = tarjeta;
    }

    public Socio() 
    {
        this.setRut("0");
        this.setNombre("no name");
        this.setEdad(18);
        this.setTarjeta(new Tarjeta());
    }

    public Socio(String rut, String nombre, int edad, Tarjeta tarjeta) 
    {
        this.setRut(rut);
        this.setNombre(nombre);
        this.setEdad(edad);
        this.setTarjeta(tarjeta);
    }
    
    public String infoTarjeta()
    {
        String info;
        
        info = "*Informacion de la tarjeta*\nDueño: "+this.getNombre()+
               "\nId tarjeta: "+this.tarjeta.getId()+
               "\nEstado tarjeta: "+this.tarjeta.getEstado()+
               "\nAño inscripcion: "+this.tarjeta.getAñoInscripcion()+
               "\nSaldo tarjeta: "+this.tarjeta.getSaldo();
        
        return info;
    }
    
    public void activacionTarjetas(int añosSocio, int añosActiva)
    {
        if (this.getEdad()==añosSocio || 
        2024-this.tarjeta.getAñoInscripcion()==añosActiva)
            this.tarjeta.setEstado('A');
        else
            System.out.println("No se cumplen los requisitos minimos del socio, " +
            "No se ha activado la tarjeta");
    }
    
    public void enviarCorreo()
    {
        String correo;
        
        correo = "Informacion socio\nSocio: "+this.getNombre()+
                "\nRut: "+this.getRut()+"\nEdad: "+this.getEdad()+
                "\nId tarjeta: "+this.tarjeta.getId();
        
        System.out.println(correo);
    }
    
    public double descuentoVenta(int montoCompra)
    {
        double montoFinal;
        
        if (2024-this.tarjeta.getAñoInscripcion()>5)
            montoFinal = montoCompra*0.5;
        else
            montoFinal = montoCompra;
        
        return montoFinal;
    }
}
