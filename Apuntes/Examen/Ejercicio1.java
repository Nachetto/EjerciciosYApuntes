import java.io.IOException;
import java.util.Scanner;
public class Ejercicio1 {
	public static void main(String[] args)throws IOException {
		Scanner sc = new Scanner(System.in);

		char opcion = 1;
		while (opcion!='c') {
			System.out.println("Introduzca la opcion del menu a, b, o la c para salir");
			opcion = sc.next().charAt(0);
			switch (opcion){
				case 'a':
					boolean pass=false;
					while (pass!=true) {
						System.out.println("Introduzca 2 numeros para saber si son amigos");
						int num1= sc.nextInt();
						System.out.println("Introduzca el segundo numero");
						int num2= sc.nextInt(),aux= 0, aux2= 0;
						for (int i = 1; i < num1; i++) {
							if (i!=num1) {
								if (num1%i==0) {
									aux=aux+i;
								}								
							}
						}
						for (int i = 1; i < num2; i++) {
							if (i !=num2) {
								if(num2%i==0) {
									aux2=aux2+i;
								}								
							}
						}
						System.out.println("suma 1 hace: "+aux+", mientras que suma 2 hace: "+aux2);
						if (aux2==num1) {
							System.out.println("Sus numeros son amigos, enhorabuena.");
							pass=true;
						}else {
							System.out.println("Vuelva a intentar");
						}
					}
				break;
				case 'b':
					int i=0,j=0,i2=0,j2=j;
					char frase=0;
					System.out.println("Escribe tu frase");
					frase =(char) System.in.read();
					while (frase!='.') {
						boolean siguiente=false;
						while (siguiente!=true) {
							i++;
							if (frase==' ') {
								if(i>i2) {//si es la palabra más grande, se guarda el tamaño y la posicion
									i2=i;
									j2=j;
									}
								j++;
								i=0;
								siguiente=true;
							}
							
						}
					}//no se por que se queda en bucle infinito, no detecta los espacios ni el punto.
					System.out.println("La palabra en la "+j2+"º posición ha sido la más larga con un total de "+i2+"caracteres.");
				break;
				default:
				break;
			}
		}
		sc.close();
	}
}
