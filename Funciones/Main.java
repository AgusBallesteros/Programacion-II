public class Main  {
    public static void main(String[] args){
        System.out.println("=== PRUEBAS DE LAS FUNCIONES ===\n");




        // Nivel 1
        System.out.println("--- NIVEL 1 ---");
        Funciones.MostrarSaludo();
        Funciones.main("Lalo");
        System.out.println("Área rectángulo (5x3): " + Funciones.calcularArea(5, 3));
        System.out.println("Mayúsculas de 'hola': " + Funciones.convertirAMayusculas("hola"));
        Funciones.mostrarMenu();

        System.out.println("\n--- NIVEL 2 ---");
        System.out.println("¿Es 4 par? " +  Funciones.esPar(4));
        System.out.println("¿Es 5 par? " + Funciones.esPar(5));
        System.out.println("Cuadrado de 7: " + Funciones.Cuadrado(7.0));
        System.out.println("Factorial de 3: " + Funciones.calcularFactorial(3));

        System.out.println("\n--- NIVEL 3 ---");
        System.out.println("Suma de 1,2,3,4,5: " + Funciones.sumaNumeros(1,2,3,4,5));
        double[] numeros = {8.5, 9.2, 7.8, 6.5};
        System.out.println("Promedio de array: " + Funciones.promedio(numeros));
        int[] arrayBusqueda = {10, 20, 30, 40, 50};
        System.out.println("¿Está 30 en el array? " + Funciones.valor(arrayBusqueda, 30));
        String[] palabras = {"hola", "mundo", "hola", "java"};
        System.out.println("Ocurrencias de 'hola': " + Funciones.contarOcurrencias(palabras, "hola"));

        System.out.println("\n--- NIVEL 4 ---");
        int[] arrayPrueba = {1, 2, 3, 4, 5};
        System.out.print("Array formateado: ");
        Funciones.imprimirArray(arrayPrueba);
        int[] arrayInvertido = Funciones.invertirArray(arrayPrueba);
        System.out.print("Array invertido: ");
        Funciones.invertirArray(arrayInvertido);

        String[] estudiantes = {"Ana", "Carlos", "María", "Pedro"};
        double[] notasEstudiantes = {8.5, 9.2, 7.8, 9.5};
        System.out.println("Mejor estudiante: " + Funciones.estudianteMejor(estudiantes, notasEstudiantes));
    }
}
