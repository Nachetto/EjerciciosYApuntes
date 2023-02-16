//import java.util.Scanner;
import java.io.IOException;

public class Bucles2{
    public static void main(String[] args) throws IOException {
        //2.-Hacer un programa que muestre los números pares, del 1 al 100.
        for (int i = 1; i < 101; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}
