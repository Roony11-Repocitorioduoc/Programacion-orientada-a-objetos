package herencia;

public class Herencia 
{
    public static void main(String[] args) 
    {
        Estudiante est1 = new Estudiante("Marcelo", 22, 'H', "Ing Electronica");
        Docente doc1 = new Docente("Aurelio", 55, 'M', "Java", "Doctor");
        
        est1.imprimir();
        doc1.imprimir();
        
        EstudianteNormal estn1 = new EstudianteNormal("Jaime", 22, 'X', "aaaaaaa");
        EstudianteTrabajador estt1 = new EstudianteTrabajador("Juaquima", 23, 'M', "JOm", "Jma");
        
        estn1.imprimir();
        estt1.imprimir();
    }
    
}
