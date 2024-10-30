package automotora;

public class Main 
{

    public static void main(String[] args) 
    {
        RentCar rentadora = new RentCar();
        
        VehiculoCarga vehc1 = new VehiculoCarga();
        VehiculoPasajero vehp1 = new VehiculoPasajero("ASDF-22", 100, 20, 4);
        
        rentadora.agregarVehiculo(vehc1);
        rentadora.agregarVehiculo(vehp1);
        
        rentadora.listarVehiculos();
        
        vehp1.imprimirBoleta();
    }
    
}
