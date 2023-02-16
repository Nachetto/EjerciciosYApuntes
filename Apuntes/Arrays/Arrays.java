package Arrays;
import java.util.Scanner;
import java.io.IOException;

public class Arrays {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        // ENTRADA DE DATOS
        System.out.println("¿Cuántas notas desea realizar un registro?");
        int tamanyo=sc.nextInt();
        double notas[]=new double[tamanyo];
        // PROCESADO DE DATOS 
        int index=0;
        while (index<notas.length){
            System.out.println("Alumno "+(index+1)+"º, ¿Qué nota has sacado?");
            notas[index]= sc.nextDouble();
            sc.close();
            index ++;
        }
        // SALIDA DE DATOS
        for(index=0;(index+1)<notas.length;index ++){
            System.out.println("La "+(index +1)+"º nota es un "+notas[index]+", ");
        }
        System.out.println("La "+(index +1)+"º y última nota es un "+notas[index+1]+".");
        sc.close();
    }
}
