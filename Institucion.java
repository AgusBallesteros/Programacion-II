import java.util.ArrayList;
public class Institucion {
    public static void main(String[] args){
        System.out.println("=== SISTEMA DE GESTIÓN DE PERSONAS - INSTITUCIÓN EDUCATIVA ===\n");

        Personas persona=new Personas("Juan", "Pérez", "12345678", 45,
                "Calle Principal 123", "555-0123");
        Estudiante estudiante= new Estudiante("María", "González", "87654321", 20,
                "Av. Universitaria 456", "555-0456",
                "EST2024001", "Ingeniería Informática", 8.5);
        Profesor profesor=new Profesor("Dr. Carlos", "Rodríguez", "11223344", 35,
                "Boulevard Académico 789", "555-0789",
                "Ciencias de la Computación", 75000.0, 8);
        EmpleadoAministrativo empleadoAministrativo=new EmpleadoAministrativo("Ana", "Martín", "44556677", 28,
                "Calle Oficinas 321", "555-0321",
                "Secretaria Académica", "8:00 AM - 4:00 PM", 45000.0);

        System.out.println("1.Persona Genérica: ");
        persona.saludar();
        persona.mostrarInformacion();
        System.out.println();

        System.out.println("2.Estudiante");
        estudiante.saludar();
        estudiante.mostrarInformacion();
        estudiante.estudiar();
        System.out.println();

        System.out.println("3.Profesor");
        profesor.saludar();
        profesor.mostrarInformacion();
        profesor.enseñar();
        System.out.println();

        System.out.println("4.Empleado Administrativo");
        empleadoAministrativo.saludar();
        empleadoAministrativo.mostrarInformacion();
        empleadoAministrativo.administrar();
        System.out.println();


        System.out.println("Demostración de polimorfismo");
        ArrayList < Personas > personas=new ArrayList<>();
        personas.add(estudiante);
        personas.add(profesor);
        personas.add(empleadoAministrativo);
        personas.add(persona);

        System.out.println("Interando sobre la ArrayList de persona");
        for (int i=0; i<personas.size(); i++){
            System.out.println("\n--- Persona" + (i+1)+ " ---");
            personas.get(i).saludar();
            personas.get(i).mostrarInformacion();

        }
        System.out.println("\n=== FIN DEL PROGRAMA ===");
    }





}
