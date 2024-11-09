package fireemblemconsola;

public class Lord extends ClaseBase {

    public Lord(String nombre, Arma arma) 
    {
        // Verifica que se pasa correctamente la lista de tipos permitidos
        super(nombre, 17, 3, 5, 9, 2, 0, 10, arma);  // Aseg�rate de que se pasa una lista v�lida
        this.setDescripcion("Noble de una casa, con un gran potencial");
    }
}

