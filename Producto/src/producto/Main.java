package producto;

import java.util.logging.Logger;


public class Main 
{

    public static void main(String[] args) 
    {
        Producto yogurt = new Producto("Yorgursito", "YogurunidoSA", 1200, true);
        yogurt.imprimir();
        
        Producto leche = new Producto("LECHE ENTERA", "CORRALES DEL SUR", 50000, false);
        leche.imprimir();
        
        Producto arroz = new Producto("hubio", "Cantera norte", 64, true);
        arroz.imprimir();
        System.out.println("---Info---");
        System.out.println("Marca: "+arroz.getMarca());
        arroz.setMarca("Jaja saludos");
        System.out.println("---Info---");
        System.out.println("Marca: "+arroz.getMarca());
        
        Empleado neytan = new Empleado("111-1", "Neytan", 22, 'M', true, "Supervisor ejecutivo", 2000);
        neytan.imprimir();   
    } 
}
