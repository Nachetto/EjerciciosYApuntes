import java.util.Scanner;
import java.io.IOException;

public class Bucles3{
    public static void main(String[] args) throws IOException {
        // 3.- Hacer un programa que pida dos números por el teclado N y M, y si M > N 
        //     muestre todos los valores comprendidos entre estos dos números.
        Scanner sc = new Scanner(System.in);
        System.out.println("Por favor, introduzca sus 2 números respectivamente");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        if (num2 > num1) {
            System.out.println("Sus números entre medias son: ");
            while ( num2 > num1) {
                num1 ++;
                System.out.println(num1);
            }
        } else {
            System.out.println(+num1+" es mayor que "+num2);
        }
        sc.close();
    }
}
