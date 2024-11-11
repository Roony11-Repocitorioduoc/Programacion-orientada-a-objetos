package fireemblemconsola;

public class Main 
{
    public static void main(String[] args) 
    {
        ManejoPromociones manejoPromociones = new ManejoPromociones();
        
        // Crecimiento Eliwood
        CrecimientoPersonaje crecimientoEliwood = new CrecimientoPersonaje(200, 200, 200, 200, 200, 200);
        // Crecimiento Marisa
        CrecimientoPersonaje crecimientoMarisa = new CrecimientoPersonaje(75, 55, 30, 15, 60, 50);
        // promocion espadachin
        Promocion espadachin = new Promocion("Espadachin", "Maestros de la espada\n+25% de Crit rate", new EstadisticasMaximas(60, 29, 24, 22, 30, 30));
        // Lord 
        //Lord eliwood = new Lord("Eliwood", InicializadorArmas.espadaP, crecimientoEliwood, EstadisticasLimite.sinPromocionar);
        
        // Mirmidon
        //Mirmidon lloyd = new Mirmidon("Lloyd", InicializadorArmas.espadaAsesina);
        Mirmidon marisa = new Mirmidon("Marisa", InicializadorArmas.espadaAsesina, crecimientoMarisa, EstadisticasLimite.sinPromocionar);
        
        // Caballero
        //Caballero oswin = new Caballero("Oswin", InicializadorArmas.LanzaP, EstadisticasLimite.sinPromocionar);
        
        // Luchador
        Luchador garcia = new Luchador("Garcia", InicializadorArmas.hachaAsesina, crecimientoEliwood, EstadisticasLimite.sinPromocionar);
        
        //eliwood.imprimirInformacion();
        //marisa.imprimirInformacion();
        
        //Combate.iniciarCombate(garcia, eliwood);
        
        garcia.ganarExperiencia(2000);
        marisa.ganarExperiencia(2000);
        
        //eliwood.imprimirInformacion();
        //marisa.imprimirInformacion();
        
        marisa.promocionar(manejoPromociones);
        garcia.promocionar(manejoPromociones);
        
        marisa.ganarExperiencia(2000);
        marisa.imprimirInformacion();
        garcia.ganarExperiencia(2000);
        garcia.imprimirInformacion();
        
        Combate.iniciarCombate(marisa, garcia);
    }
    private static class InicializadorArmas
    {
        private static final String ESPADA = "Espada de ";
        private static final String LANZA = "Lanza de ";
        private static final String HACHA = "Hacha de ";
        private static final String HIERRO = "Hierro";
        private static final String ACERO = "Acero";
        private static final String PLATA = "Plata";
        
        // Inicializador de armas
        // Espadas
        //                                              Poder, Golpe, Critico, Peso
        public static final Espada espadaH = new Espada(6, 90, 0, 5, ESPADA+HIERRO);
        public static final Espada espadaA = new Espada(8, 75, 0, 10, ESPADA+ACERO);
        public static final Espada espadaP = new Espada(13, 80, 0, 8, ESPADA+PLATA);
        // Espada Asesina
        public static final Espada espadaAsesina = new Espada(9, 75, 30, 7, "Espada Asesina");
        // Lanzas
        //                                              Poder, Golpe, Critico, Peso
        public static final Lanza LanzaH = new Lanza(7, 80, 0, 8, LANZA+HIERRO);
        public static final Lanza LanzaA = new Lanza(10, 70, 0, 13, LANZA+ACERO);
        public static final Lanza LanzaP = new Lanza(14, 75, 0, 10, LANZA+PLATA);
        // Lanza Asesina
        public static final Lanza lanzaAsesina = new Lanza(10, 70, 30, 9, "Lanza Asesina");
        // Hachas
        //                                              Poder, Golpe, Critico, Peso
        public static final Hacha HachaH = new Hacha(8, 75, 0, 10, HACHA+HIERRO);
        public static final Hacha HachaA = new Hacha(11, 65, 0, 15, HACHA+ACERO);
        public static final Hacha HachaP = new Hacha(15, 70, 0, 12, HACHA+PLATA);
        // Hacha Asesina
        public static final Hacha hachaAsesina = new Hacha(11, 65, 30, 11, "Hacha Asesina");
    }
    
    public static class EstadisticasLimite
    {
        // Clases sin promocionar
        public static final EstadisticasMaximas sinPromocionar = new EstadisticasMaximas(60, 20, 20, 20, 20, 30);
    }
}
