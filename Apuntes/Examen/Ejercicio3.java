import java.io.IOException;
import java.util.Scanner;
import java.lang.Math;
public class Ejercicio3 {
	public static void main(String[] args)throws IOException {
		Scanner sc = new Scanner(System.in);
		
		int datos[][]=new int[4][7], procesados[]= new int[7], datoscopia[][]=new int[4][7];
		boolean pass=false;
		for (int i = 0; i < datos.length; i++) {
			for (int j = 0; j < datos[i].length; j++) {
				datos[i][j]=(int)(Math.random()*400);
				procesados[j]=procesados[j]+datos[i][j];
			}
		}
				
		System.out.println("Datos del total de días sin ordenar:");
		for (int i = 0; i < procesados.length; i++) {
			System.out.println("Día "+(i+1)+": "+procesados[i]);
		}

		for (int i = 0; i < datoscopia.length-1; i++) {
			for (int j = 0; j < datoscopia.length; j++) {
				datoscopia[i][j]=datos[i][j];
			}
		}
		
		while (pass!=true){/*se que se puede hacer while(pass) pero me quiero asegurar*/
			pass=false;
			for (int i = 0, aux=0; i < datoscopia.length-1; i++) {
				for (int j = 0; j < datoscopia[i].length-1; j++) {
					if (datoscopia[i+1][j]>datoscopia[i][j]) {
						aux=datoscopia[i][j];
						datoscopia[i][j]=datoscopia[i][j+1];
						datoscopia[i+1][j+1]=aux;
						pass=true;
					}
				}
			}
		}
		
		System.out.println("\nTabla final ordenada:");
		for (int i = 0; i < datos.length; i++) {
			for (int j = 0; j < datos[i].length; j++) {
				System.out.printf("%5d", datos[i][j]);
			}
			System.out.println("\n");
		}//no se por qué no se ordena :(
		
		sc.close();
	}
}
