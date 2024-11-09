package fireemblemconsola;

public abstract class ClaseBase extends Unidad 
{
    // Constructor que recibe la lista de tipos de armas permitidos
    protected ClaseBase(String nombre, int vida, int habilidad, int fuerza, int defensa, int velocidad, int suerte, int constitucion, Arma arma) 
    {
        super(nombre, vida, habilidad, fuerza, defensa, velocidad, suerte, constitucion, arma);  // Asegúrate de que el constructor de la superclase se está llamando correctamente
    }
}