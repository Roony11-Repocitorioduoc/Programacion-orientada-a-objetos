package aerolinea;

public class Aerolinea {

    public static void main(String[] args) 
    {
        Pasajero pasajeroeq = new Pasajero("1234", "Aquiles", "Bailo", 99);
        
        Pasaje pasajeeq = new Pasaje(265, pasajeroeq, "Elciga rrito", "4/marzo/2055", 20000, 89, true);
        
        pasajeeq.reajusteValor();
    }
    
}
