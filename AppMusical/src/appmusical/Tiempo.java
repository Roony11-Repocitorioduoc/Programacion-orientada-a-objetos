package appmusical;

public class Tiempo 
{
    private int minutos;
    private int segundos;

    public int getMinutos() 
    {
        return minutos;
    }

    public void setMinutos(int minutos) 
    {
        if (minutos>=0 && minutos<=59)
            this.minutos = minutos;
        else
        {
            System.out.println("Ingresa un valor entre 0 y 59!");
            this.minutos = 0;
        }
    }

    public int getSegundos() 
    {
        return segundos;
    }

    public void setSegundos(int segundos) 
    {
        if (segundos>=0 && segundos<=59)
            this.segundos = segundos;
        else
        {
            System.out.println("Ingresa un valor entre 0 y 59!");
            this.segundos = 0;
        }
    }

    public Tiempo(int minutos, int segundos) 
    {
        this.setMinutos(minutos);
        this.setSegundos(segundos);
    }

    public Tiempo() 
    {
        this(1, 0);
    }
    
    public String mostrarDuracion()
    {
        return this.minutos+" Minutos - "+this.segundos+" Segundos";
    }
}
