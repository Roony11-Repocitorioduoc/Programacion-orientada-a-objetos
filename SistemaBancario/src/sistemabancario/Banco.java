package sistemabancario;

import java.util.ArrayList;

public class Banco 
{
    private ArrayList<Cuenta> cuentas;

    public Banco() 
    {
        this.cuentas = new ArrayList<>();
    }
    
    public void agregarCuenta(Cuenta cuenta)
    {
        this.cuentas.add(cuenta);
    }
    
    public void listarCuentas()
    {
        for (Cuenta cuenta : cuentas) 
        {
            cuenta.imprimirCartola();
            System.out.println("--");
        }
    }
    
    
}
