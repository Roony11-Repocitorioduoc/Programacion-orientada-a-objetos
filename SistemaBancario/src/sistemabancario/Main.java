package sistemabancario;

public class Main 
{
    public static void main(String[] args) 
    {
        CuentaAhorro ctaa1 = new CuentaAhorro(12, new Persona("2022", "Jose", 22, "Marco"), 2);
        CuentaCorriente ctac1 = new CuentaCorriente(100, 2, new Persona("23", "J", 22, "jadsj"));
        
        Banco ban1 = new Banco();
        
        ban1.agregarCuenta(ctaa1);
        ban1.agregarCuenta(ctac1);
        
        ban1.listarCuentas();
    }
    
}
