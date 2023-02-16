package Arrays;
import java.util.Scanner; 
import java.io.IOException;
public class Arrays6{
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int datos[][] = new int[10][5];
        for (int i = 0; i < datos.length; i++) {
            for (int j = 0; j < datos[i].length; j++) {
                datos[i][j]=i;
                System.out.print(datos[i][j]);
            }
            System.out.print("\n");
        }
        sc.close();
    }
}