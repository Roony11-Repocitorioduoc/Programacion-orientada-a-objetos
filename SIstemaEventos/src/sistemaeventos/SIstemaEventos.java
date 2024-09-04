package sistemaeventos;

public class SIstemaEventos 
{
    public static void main(String[] args) 
    {
        Evento evento1 = new Evento(1, 5, 2000000, "si", "no");
        Cliente cliente1 = new Cliente(evento1, 'N', "Hola", 22, 'H');
        
        cliente1.mostrarEvento();
        
        cliente1.aplicarDescuento(20);
        
        cliente1.mostrarEvento();
        
        cliente1.recordarEvento(4);
        
        System.out.println(cliente1.retornarDatos());
    }
    
}
