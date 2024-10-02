package sistemabancario;

public class CuentaAhorro extends Cuenta
{
    private final double TASA_INTERES=1.025;
    private int numeroGiros;

    public int getNumeroGiros() 
    {
        return numeroGiros;
    }

    public void setNumeroGiros(int numeroGiros) 
    {
        this.numeroGiros = numeroGiros;
    }

    public CuentaAhorro(int numero, Persona titular, int numeroGiros) 
    {
        super(numero, titular);
        this.numeroGiros = numeroGiros;
    }
    
    public CuentaAhorro()
    {
        super();
        this.numeroGiros = 2;
    }
    
    @Override
    public void girar(double monto)
    {
        this.setSaldo(this.getSaldo()-monto);
        this.numeroGiros--;
    }
    
    @Override
    public void imprimirCartola()
    {
        String info = "Titular: "+this.getTitular().getNombre()+"\nSaldo: $"+
                this.getSaldo()+"\nCantidad de giros: "+this.numeroGiros+
                "\nInteres del periodo: "+this.TASA_INTERES;
        
        System.out.println(info);
    }
}
