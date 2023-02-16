package Arrays;
import java.util.Scanner; 
import java.io.IOException;
public class Arrays5{
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int diagonal[][]= new int[20][20];
        for (int i = 0; i < diagonal.length; i++) {
            for (int j = 0; j < diagonal[i].length; j++) {
                if (i==j) {
                    diagonal[i][j]=1;
                }
                else{
                    diagonal[i][j]=0;
                }
                System.out.print(diagonal[i][j]);
            }
            System.out.println("\n");
        }
        sc.close();
    }
}