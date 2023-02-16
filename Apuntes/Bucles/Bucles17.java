import java.util.Scanner; 
import java.io.IOException;
public class Bucles17{
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        /* 17.- Hacer un programa que muestre los N primeros términos de la serie. 
            1, 2, 4, 8, 16, 32, 64, 128, .....
            N es un valor que se ha de entrar desde el teclado. */
        int count = 2;
        int producto = 0;
        System.out.print("Serie de potencia de 2\n¿Qué Longitud desea?: ");
        for (int i = sc.nextInt();i > 2;i--) {
            System.out.print(count*producto+", ");
            producto = producto+2;
        }
        System.out.print(count*producto*2);
        System.out.print(" y "+count*producto*4+("."));
        sc.close();
    }
}