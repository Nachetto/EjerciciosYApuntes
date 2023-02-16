import java.io.IOException;
import java.lang.Math;
import java.util.Scanner;
public class Ejercicio2 {
	public static void main(String[] args)throws IOException {
		Scanner sc = new Scanner(System.in);
		int num1= (int)(Math.random()*101);
		num1=num1-51;//se que se puede hacer con la linea de arriba, pero no me complico
		System.out.println("Número: "+num1+"\n");
		for (int i = 0,num2=0; i < 3; i++) {
			System.out.println("Introduzca un número, "+(i+1)+"º intento.");
			num2=sc.nextInt();
			if (num2==num1) {
				System.out.println("Enhorabuena, has encontrado el número");
				i=3;
			}else {
				System.out.println("Número Incorrecto.");
			}
		}
		sc.close();
	}
}
