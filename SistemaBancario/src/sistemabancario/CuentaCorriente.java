package sistemabancario;

public class CuentaCorriente extends Cuenta
{
    private int lineaCredito;

    public int getLineaCredito() 
    {
        return lineaCredito;
    }

    public void setLineaCredito(int lineaCredito) 
    {
        this.lineaCredito = lineaCredito;
    }

    public CuentaCorriente(int lineaCredito, int numero, Persona titular) {
        super(numero, titular);
        this.lineaCredito = lineaCredito;
    }
    
    public CuentaCorriente()
    {
       super();
       this.lineaCredito=0;
    }
    
    @Override
    public void girar(double monto)
    {
        this.setSaldo(this.getSaldo()-monto);
    }
    
    @Override
    public void imprimirCartola()
    {
        String info = "Titular: "+this.getTitular().getNombre()+"\nSaldo: $"+
                this.getSaldo()+"\nLinea de credito: $"+this.lineaCredito;
        
        System.out.println(info);
    }
}
