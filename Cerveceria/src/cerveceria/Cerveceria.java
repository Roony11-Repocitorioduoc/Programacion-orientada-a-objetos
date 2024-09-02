package cerveceria;

public class Cerveceria 
{
    public static void main(String[] args) 
    {
        Socio sociotest = new Socio();
        
        System.out.println(sociotest.infoTarjeta());
        
        sociotest.enviarCorreo();
        
        System.out.println(sociotest.descuentoVenta(5000));
        
        System.out.println("----");
        
        Tarjeta tarjeta1 = new Tarjeta("9721", 'A', 2010, 20000);
        
        Socio socio1 = new Socio("99-1", "Alan", 35, tarjeta1);
        
        System.out.println(socio1.infoTarjeta());
        
        socio1.enviarCorreo();
        
        System.out.println(socio1.descuentoVenta(5000));
    }
    
}
