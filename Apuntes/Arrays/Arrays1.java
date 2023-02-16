package Arrays;
import java.util.Scanner; 
import java.io.IOException;
//import java.util.Random;
public class Arrays1{
  public static void main(String[] args) throws IOException {
/*  1. Hacer un programa que:
    - Cree un array unidimensional de nombre “vector” y 15 elementos, siendo sus 
      componentes de tipo numérico entero
    - Cargar el array con valores aleatorios que sean introducidos por teclado
    - Calcular la suma de los primeros N elementos almacenados en el array
    - Muestre el resultado obtenido así como el contenido del array en pantalla */
        Scanner sc = new Scanner(System.in);
        int vector[] = new int[15];
        for (int i = 0; i < vector.length; i++) {
            System.out.println("Escriba su "+(i+1)+"º cifra.");
            vector[i] = sc.nextInt();
        }
        System.out.println("Tabla de valores");
        for (int i = 0; i < vector.length; i++) {
            System.out.println("El valor del "+(i+1)+"º número es "+vector[i]);
        }
        System.out.println("Indique la cifra de N primeros números para sumar");
        int suma = sc.nextInt();
        int aux = 0;
        for (int i = 0; i < suma; i++) {
            aux = vector[i+1] + aux;
        }
        System.out.println("La suma de las "+suma+"º primeras cifras hace un total de "+aux);
        sc.close();
    }
}