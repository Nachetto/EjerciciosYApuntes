import java.util.Scanner; 
import java.io.IOException;
public class Bucles16{
    public static void main(String[] args) throws IOException {
        /* 16.- Hacer un programa que pida la base y el exponente. Se ha de
        calcular la potencia. El programa ha de controlar , que si exponente = 0,
        potencia = 1, y si exponente = 1, potencia = base. */
        Scanner sc = new Scanner(System.in);
        System.out.print("Calculador de Potencias\nPor favor, indique la base de su cifra: ");
        int base = sc.nextInt();
        System.out.print("Introduzca ahora el exponente de su cifra: ");
        int exponente = sc.nextInt();
        if (exponente == 1) {
            System.out.println("El resultado de la potencia es "+base);
        }
        else if (exponente == 0){
            System.out.println("El resultado de la potencia es 1");
        }
        else{
            // double potencia = (Math.pow(base, exponente));
            int potencia = 1;
            while (exponente!=0){
                potencia = (potencia * base);
                exponente --;
            }
            System.out.println("El resutado de la potencia es "+potencia);
        }
        sc.close();
    }
}