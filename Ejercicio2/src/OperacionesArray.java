package Ejercicio1;
import java.util.Scanner;
public class OperacionesArray {
    private int[] MainArray = new int[5];
    Scanner sc = new Scanner(System.in);

    public void MainArrayLoader(int[] MainArray) {
        for (int i = 0; i < MainArray.length; i++) {
            System.out.println("Introduzca su "+(i+1)+"º cifra:");
            MainArray[i]=sc.nextInt();
        }
    }
    
    public OperacionesArray(int[] MainArray){
        this.MainArray=MainArray;
    }

    public void Printer(){
        MainArrayLoader(MainArray);
        for (int i = 0; i < MainArray.length; i++) {
            System.out.print(MainArray[i]);
        }
    }
}
