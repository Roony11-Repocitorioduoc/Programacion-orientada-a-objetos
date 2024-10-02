package sistemabancario;

public abstract class Cuenta 
{
    private int numero;
    private Persona titular;
    private double saldo;

    public int getNumero() 
    {
        return numero;
    }

    public void setNumero(int numero) 
    {
        this.numero = numero;
    }

    public Persona getTitular() 
    {
        return titular;
    }

    public void setTitular(Persona titular) 
    {
        this.titular = titular;
    }

    public double getSaldo() 
    {
        return saldo;
    }

    public void setSaldo(double saldo) 
    {
        this.saldo = saldo;
    }

    public Cuenta(int numero, Persona titular) 
    {
        this.numero = numero;
        this.titular = titular;
        this.saldo = 0;
    }

    public Cuenta() 
    {
        this(0, new Persona());
    }
    
    public void depositar(double monto)
    {
        this.setSaldo(this.getSaldo()+monto);
    }
    
    public abstract void girar(double monto);
    public abstract void imprimirCartola();
}
