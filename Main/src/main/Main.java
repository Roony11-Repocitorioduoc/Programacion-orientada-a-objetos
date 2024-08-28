package main;

public class Main 
{
    public static void main(String[] args) 
    {
//        Carrera carrera1 = new Carrera();
//        
//        carrera1.imprimir();
//        
//        System.out.println(carrera1.datos());
//        
//        Alumno alumno1 = new Alumno();
//        
//        alumno1.imprimir();
        
        Carrera carreraReal = new Carrera(1, "Ingenieria Mecanica",
        4, "Ingeniero Mecanico");
        
        Alumno alumnoReal = new Alumno("Marco Ruiz", "20963979-k", 22, false,
        'H', carreraReal);
        
        alumnoReal.imprimir();
        
        System.out.println(alumnoReal.nombreCarrera());
        
        System.out.println(alumnoReal.mostrarCategoria());
        
        System.out.println(alumnoReal.promediarNotas(4, 2.1, 3.0));
        
        alumnoReal.datosCarrera();
    }
    
}
