package Arrays;
import java.io.IOException;
public class Arrays2{
    public static void main(String[] args) throws IOException {
       int origen[] = {10,25,36,40,37,45,90,76,78,81,58,32};
       int destino[] = new int[12];
       for (int i = 0,j=0; i < origen.length; i++) {
        if (origen[i]%2==0 && origen[i]>25) {
            destino[j]=origen[i];
            j++;
        }
       }
       System.out.println("Contenido del Primer Array");
       for (int i = 0; i < destino.length; i++) {
        System.out.println("El array nº"+(i+1)+" es "+origen[i]);
       }
       System.out.println("Contenido del Segundo Array");
       for (int i = 0; i < destino.length; i++) {
        if (destino[i]!=0){
            System.out.println("El array nº"+(i+1)+" es "+destino[i]);
        }
       }
    }
}