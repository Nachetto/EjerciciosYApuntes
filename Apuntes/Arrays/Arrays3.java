package Arrays;
import java.util.Scanner; 
import java.io.IOException;
public class Arrays3{
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int números[] = new int[15];
        for (int i = 0; i < números.length; i++) {
            System.out.println("Introduzca la "+(i+1)+"º Cifra");
            números[i]=sc.nextInt();
        }
        System.out.println("Lista al revés:");
        for (int i=(números.length-1);i!=-1; i--) {
            System.out.println(números[i]);
        }
        sc.close();
    }
}