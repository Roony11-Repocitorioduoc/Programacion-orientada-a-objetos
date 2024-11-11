package fireemblemconsola;

import java.util.HashMap;
import java.util.Map;

public class ManejoPromociones 
{
    private Map<String, Promocion> promociones;

    public ManejoPromociones() 
    {
        promociones = new HashMap<>();
        
        promociones.put("Mirmidon", new Promocion("Espadachin", 
            "Un maestro de la espada con habilidades avanzadas", 
            new EstadisticasMaximas(60, 30, 25, 20, 30, 20)));
        
        promociones.put("Luchador", new Promocion("Campeon", 
            "Un guerrero formidable que domina el combate cuerpo a cuerpo", 
            new EstadisticasMaximas(60, 28, 30, 26, 26, 30)));
        
        // Puedes agregar otras promociones en el futuro
    }
    
    public void aplicarPromocion(ClaseBase unidad) 
    {
        Promocion promocion = promociones.get(unidad.getClase());
        if (promocion != null) 
        {
            unidad.setNivel(1);
            unidad.setPuntosExperiencia(0);
            unidad.setClase(promocion.getNuevaClase());
            unidad.setDescripcion(promocion.getNuevaDescripcion());
            unidad.setEstadisticasMaximas(promocion.getEstadisticasPromocionadas());
            System.out.println(unidad.getNombre() + " ha promocionado a " + promocion.getNuevaClase() + "!");
        }
    }
}
