import java.io.FileOutputStream;
import java.lang.reflect.Array;

public class Funciones{
    public static void MostrarSaludo(){
        System.out.println("Hola Mundo!");

    }
    public static void main(String nombre){
        System.out.println("Hola " + nombre);
    }
    public static double calcularArea(double base, double altura){
        return base*altura;
    }
    public static String convertirAMayusculas(String texto) {
        if (texto == null) {
            return null;
        }
        return texto.toUpperCase(); //función que modifica el texto a mayúscula
    }
    public static void mostrarMenu(){
        System.out.println("Sos:\n 1.Opcion 1 \n 2.Opcion 2 \n 3.Opcion 3 \n 4.Te puse \n 5.Salir");
    }
    public static Boolean esPar(int numero){
        return numero%2==0;
    }
    public static Double Cuadrado(Double numero){
        return numero*numero;
    }
    public static long calcularFactorial(int numero1){
        if (numero1 == 0) {
            return 1;
        }
        return numero1 * calcularFactorial(numero1 - 1);
    }
    public static int sumaNumeros(int... numeros){
        int suma=0;
        for(int numeros1 : numeros){
            suma+=numeros1; // es lo mismo que decir suma=suma + numeros1
        }
        return suma;
    }
    public static double promedio(double[] numeros){
        double sumaProm=0;
        for(double numero : numeros){
           sumaProm+=numero;
        }
        return sumaProm/numeros.length;
    }
    public static boolean valor(int[] numero, int valorBuscado){
        for(int valor : numero){
            if (valor==valorBuscado){
                return true;
            }
        }
        return false;
    }
    public static int contarOcurrencias (String[] Array,String clave){
        int contador=0;
        for(String elemento : Array){
            if (elemento!=null && elemento.equals(clave)){
                contador++;
            }
        }
        return contador;
    }
    public static void imprimirArray (int[] numeros){ //El método imprimirArray recibe una lista de números (int[] numeros). Imprime un corchete de apertura [, luego recorre cada número de la lista. Para cada número, lo imprime en una línea separada. Si no es el último número, imprime una coma y un espacio después. Finalmente, imprime un corchete de cierre ]. El resultado es una representación visual del array en la consola, con cada elemento en una línea separada.
        System.out.println("[");
        for (int i=0; i<numeros.length; i++){
            System.out.println(numeros[i]);
            if (i<numeros.length-1){
                System.out.println(", ");
            }
        }
        System.out.println("]");
    }
    public static int[] invertirArray(int[] array  ){
        int[]arrayInvertido=new int[array.length];
        for (int i=0; i<array.length; i++){
            arrayInvertido[i]=array[array.length -1 -i];
        }
        return arrayInvertido;
    }
    public static String estudianteMejor(String[] nombre, double[] nota){
        if (nombre.length==0 || nota.length==0 || nombre.length != nota.length){
            return "Array Inváñío"; // chiste negro
        }
        int indiceMejorNota=0;
        double mejorNota=nota[0];
        for (int i = 1; i < nota.length; i++){
            if (nota[i]>mejorNota){
                mejorNota=nota[i];
                indiceMejorNota=i;
            }
        }
        return nombre[indiceMejorNota];
    }

}


