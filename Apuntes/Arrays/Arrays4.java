package Arrays;
import java.util.Scanner; 
import java.io.IOException;
public class Arrays4{
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int tabla[][]= new int[10][10];
        for (int i = 0; i < tabla.length; i++) {
            for (int j = 0; j < tabla[i].length; j++) {
                if (i%2==0){
                    tabla[i][j]=0;
                }
                else{
                    tabla[i][j]=1;
                }
                System.out.print(tabla[i][j]);
            }
            System.out.print("\n");
        }
        sc.close();
    }
}