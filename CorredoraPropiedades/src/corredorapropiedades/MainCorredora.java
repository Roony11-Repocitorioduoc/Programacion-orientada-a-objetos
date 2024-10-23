package corredorapropiedades;

public class MainCorredora 
{

    public static void main(String[] args) 
    {
        Departamento depto1 = new Departamento();
        
        Casa casa1 = new Casa();
        
        depto1.imprimirInformacion();
        casa1.imprimirInformacion();
        
        CorredoraPropiedades corredora1 = new CorredoraPropiedades();
        
        corredora1.agregarPropiedad(depto1);
        corredora1.agregarPropiedad(casa1);
        
        corredora1.buscarPropiedadesPorComuna("Lo Prado");
    }
    
}
