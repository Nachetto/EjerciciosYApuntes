package String;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
public class StringNacho {
    public static char ch(String ej,int pos){//localizador de caracter del caso 2 del ejercicio 1
        return ej.charAt(pos);
    }
    public static boolean pass(String palabra,String confirm){//confirmador de contraseñas del caso 5 del ejercicio 1
        return palabra.equals(confirm);
    }
    public static void pass2(String palabra,String confirm){//comparador de cadenas iguales ignorando mayúsculas del apartado 6 del ejercicio 1
        boolean pass = palabra.equalsIgnoreCase(confirm);
        if (pass==true){
            System.out.println("Como el equals ha respondido "+pass+", las palabras coinciden sin importar las mayúsculas.");
        }
        else{
            System.out.println("Como el equals ha respondido "+pass+", no coinciden las palabras.");
        }
    }
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        InputStreamReader r=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(r);
        //Ejercicio 1
        int option = 0;
        while (option!=11) {
        System.out.printf("\n\n⟢ ⟗⟗⟗⟗ EJ.1 ⟗⟗⟗⟗ ⟣\n");
        System.out.printf("⟢ 1.- LENGTH           ⟣\n");
        System.out.printf("⟢ 2.- CHARAT           ⟣\n");
        System.out.printf("⟢ 3.- TOUPPERCASE      ⟣\n");
        System.out.printf("⟢ 4.- TOLOWERCASE      ⟣\n");
        System.out.printf("⟢ 5.- EQUALS           ⟣\n");
        System.out.printf("⟢ 6.- EQUALSIGNORECASE ⟣\n");
        System.out.printf("⟢ 7.- COMPARETO        ⟣\n");
        System.out.printf("⟢ 8.- LASTINDEXOF      ⟣\n");
        System.out.printf("⟢ 9.- SUBSTRING        ⟣\n");
        System.out.printf("⟢ 10.- STRINGREPLACE   ⟣\n");
        System.out.printf("⟢ 11.-    SALIR        ⟣\n");
        option = sc.nextInt();
            switch (option) {
                case 1:
                    System.out.println("- Método length(): Nos sirve para conocer la longitud de la cadena \nIntroduzca su palabra");
                    String palabra = sc.next();
                    System.out.println("La longitud de lo escrito es de "+palabra.length()+" caracteres. \n");
                break;
                case 2:
                    System.out.println("- Método charAt(n): Nos muestra qué carácter se encuentra en la posición solicitada entre paréntesis. \nIntroduzca su palabra:");
                    String ej = "Hola que tal";
                    System.out.println("Qué posicion quieres comprobar de la frase "+ej+"?");
                    int pos = sc.nextInt();
                    char ch = ch(ej,pos);
                    System.out.println("El caracter que se encuentra en la "+pos+"º posición es el "+ch);
                break;
                case 3:
                    System.out.println("Método toUpperCase(): Convierte toda la cadena a mayúsculas \nIntroduzca su palabra: ");
                    palabra= sc.nextLine();
                    System.out.println("Su palabra transformada es: "+palabra.toUpperCase());
                break;
                case 4:
                    System.out.println("Método toLowerCase(): Convierte toda la cadena a minúsculas \nIntroduzca su palabra: ");
                    palabra= sc.nextLine();
                    System.out.println("Su palabra transformada es: "+palabra.toLowerCase());
                break;
                case 5:
                    System.out.println("Método equals(«cad»): Compara dos cadenas y nos informa True si son iguales. \nVamos a hacerlo con un validador de contraseñas. Introduce la contraseña: ");
                    palabra = sc.next();
                    System.out.println("Confirma la contraseña: ");
                    String confirm = sc.next();
                    boolean pass =pass(palabra, confirm);
                    if (pass==true){
                        System.out.println("Como el equals ha respondido "+pass+", has confirmado correctamente la contraseña.");
                    }
                    else{
                        System.out.println("Como el equals ha respondido "+pass+", no coincide la confirmación.");
                    }
                break;
                case 6:
                    System.out.println("Método equalsIgnoreCase(«cad»): Compara dos cadenas y nos informa True si son iguales y no considera mayúsculas y minúsculas \nIntroduzca su primera palabra: ");
                    palabra=sc.next();
                    System.out.println("Confirma la palara: ");
                    confirm = sc.next();

                    pass2(palabra,confirm);
                break;
                case 7:
                    System.out.println("Método compareTo(OtroString): Uno de los métodos más utilizados, nos da 0 si son iguales, <0 si la primera es alfabéticamente menor que la segunda, >0 si la primera es alfabéticamente mayor que la segunda. \nIntroduce tu primera palabra");
                    palabra = sc.next();
                    System.out.println("Ahora compárala con otra: ");
                    confirm = sc.next();
                    int compare = palabra.compareTo(confirm);
                    System.out.printf("El resultado de compare to de "+palabra+" frente a "+confirm+" es "+compare+", por lo que ");
                    if (compare==0) {
                        System.out.println("las 2 palabras son iguales.");
                    } else if (compare<0) {
                        System.out.println("la primera es alfabéticamente mayor.");
                    }else{
                        System.out.println("la segunda es alfabéticamente mayor.");
                    }
                break;
                case 8:
                    System.out.println("Método lastIndexOf(‘caracter’): Nos entrega la última ubicación del carácter buscado. \nIntroduce una frase:");
                    String frase= sc.nextLine();
                    frase+=sc.nextLine(); //no tengo ni idea de por que lee esto una frase entera y no una palabra lo he emcontrado en internet y funciona :D
                    System.out.println("Ahora introduce el caracter que desee encontrar");
                    char letra = sc.next().charAt(0);
                    pos = frase.lastIndexOf(letra);
                    System.out.println("La última posición de la letra"+letra+"es la "+pos+"º.");
                break;
                case 9:
                    System.out.println("Método substring(rangoorigen, rangodestino): nos entrega el valor de los caracteres desde el rango que nosotros queramos.\n Introduce una frase: ");
                    frase= sc.nextLine();
                    frase+=sc.nextLine();
                    System.out.println("¿Desde dónde quieres recortar la frase a la izquierda?");
                    int range1 = sc.next().charAt(0);
                    System.out.println("¿Desde dónde quieres recortar la frase a la derecha?");
                    int range2 = sc.next().charAt(0);
                    System.out.println("El ressultado es el siguiente: "+frase.substring(range1,range2));
                break;
                case 10:
                    System.out.println("Método StringReplace(char antiguo, char nuevo): Te intercambia ");
                    frase = "mi moto alpina derrapante";
                    System.out.println(frase);
                    frase=frase.replace( 'a', 'e' );
                    frase=frase.replace( 'e', 'e' );
                    frase=frase.replace( 'i', 'e' );
                    frase=frase.replace( 'o', 'e' );
                    frase=frase.replace( 'u', 'e' );
                    System.out.println(frase);
                break;
                default:
                break;
            }
        }

        //Ejercicio 2
        while (option!=6) {
            System.out.printf("\n\n\n⟢ ⟗⟗⟗⟗ EJ.2 ⟗⟗⟗⟗  ⟣\n");
            System.out.printf("⟢ 1.- APPEND            ⟣\n");
            System.out.printf("⟢ 2.- REPLACE           ⟣\n");
            System.out.printf("⟢ 3.- REVERSE           ⟣\n");
            System.out.printf("⟢ 4.- INSERT            ⟣\n");
            System.out.printf("⟢ 5.- DELETE            ⟣\n");
            System.out.printf("⟢ ⟗⟗  6.-  SALIR  ⟗⟗ ⟣\n");
            option = sc.nextInt();
            switch (option) {
                case 1:
                    System.out.println("Método append(string): Agrega un string al final del ya creado. Inicialmente hemos creado hola, vamos a añadirle que tal.");
                    StringBuffer sb = new StringBuffer("hola");
                    System.out.println("Antes: "+sb);
                    sb.append(" que ");
                    sb.append("tal");
                    // Vemos que nos ha devuelto "hola que tal"
                    System.out.println("Después: "+sb.toString()); //El método tostring no lo explico porque es demasiado básico.
                break;
                case 2:
                    System.out.println("Método replace(inicio,fin,string): reemplaca un ámbito concreto de nuestro string ya creado por lo que le indiquemos.");
                    StringBuffer sb2 = new StringBuffer("hola que tal");
                    System.out.println("Antes: "+sb2);
                    sb2.replace(5,8,"y");//quitamos el "que" y ponemos "y"
                    System.out.println("Después: "+sb2.toString());
                break;
                case 3:
                    System.out.println("Método reverse(): invierte el contenido.");
                    StringBuffer sb3 = new StringBuffer("HOLA!");
                    System.out.println("Antes: " + sb3);
                    sb3.reverse(); //le damos la vuelta
                    System.out.println("Después: " + sb3.toString());
                break;
                case 4:
                    System.out.println("Método insert(lugar, String): añade nuevo contenido en un lugar determinado");
                    StringBuffer sb4 = new StringBuffer("hola que tal");
                    System.out.println("Antes: "+sb4);
                    sb4.insert(5, "Gema ");
                    System.out.println("Después: " + sb4.toString());
                break;
                case 5:
                    System.out.println("Método delete(inicio, final): elimina el contenido de un rango determinado.");
                    StringBuffer sb5 = new StringBuffer("hola que tal");
                    System.out.println("Antes: "+sb5);
                    sb5.delete(5,12);
                    System.out.println("Después: " + sb5.toString());
                    break;
                default:
                break;
            }
        }

        //Ejercicio 3
        while (option!=11) {
            System.out.printf("\n\n⟢ ⟗⟗⟗⟗ EJ.1 ⟗⟗⟗⟗ ⟣\n");
            System.out.printf("⟢ 1.- LENGTH           ⟣\n");
            System.out.printf("⟢ 2.- CHARAT           ⟣\n");
            System.out.printf("⟢ 3.- TOUPPERCASE      ⟣\n");
            System.out.printf("⟢ 4.- TOLOWERCASE      ⟣\n");
            System.out.printf("⟢ 5.- EQUALS           ⟣\n");
            System.out.printf("⟢ 6.- EQUALSIGNORECASE ⟣\n");
            System.out.printf("⟢ 7.- COMPARETO        ⟣\n");
            System.out.printf("⟢ 8.- LASTINDEXOF      ⟣\n");
            System.out.printf("⟢ 9.- SUBSTRING        ⟣\n");
            System.out.printf("⟢ 10.- STRINGREPLACE   ⟣\n");
            System.out.printf("⟢ 11.-    SALIR        ⟣\n");
            option = sc.nextInt();
            switch (option) {
                case 1:
                    System.out.println("- Método length(): Nos sirve para conocer la longitud de la cadena \nIntroduzca su palabra");
                    String palabra = br.readLine();
                    System.out.println("La longitud de lo escrito es de "+palabra.length()+" caracteres. \n");
                    break;
                case 2:
                    System.out.println("- Método charAt(n): Nos muestra qué carácter se encuentra en la posición solicitada entre paréntesis. \nIntroduzca su palabra:");
                    String ej = "Hola que tal";
                    System.out.println("Qué posicion quieres comprobar de la frase "+ej+"?");
                    int pos = sc.nextInt();
                    char ch = ej.charAt(pos);
                    System.out.println("El caracter que se encuentra en la "+pos+"º posición es el "+ch);
                    break;
                case 3:
                    System.out.println("Método toUpperCase(): Convierte toda la cadena a mayúsculas \nIntroduzca su palabra: ");
                    palabra= br.readLine();
                    System.out.println("Su palabra transformada es: "+palabra.toUpperCase());
                    break;
                case 4:
                    System.out.println("Método toLowerCase(): Convierte toda la cadena a minúsculas \nIntroduzca su palabra: ");
                    palabra= br.readLine();
                    System.out.println("Su palabra transformada es: "+palabra.toLowerCase());
                    break;
                case 5:
                    System.out.println("Método equals(«cad»): Compara dos cadenas y nos informa True si son iguales. \nVamos a hacerlo con un validador de contraseñas. Introduce la contraseña: ");
                    palabra = br.readLine();
                    System.out.println("Confirma la contraseña: ");
                    String confirm = br.readLine();
                    boolean pass =pass(palabra, confirm);
                    if (pass==true){
                        System.out.println("Como el equals ha respondido "+pass+", has confirmado correctamente la contraseña.");
                    }
                    else{
                        System.out.println("Como el equals ha respondido "+pass+", no coincide la confirmación.");
                    }
                    break;
                case 6:
                    System.out.println("Método equalsIgnoreCase(«cad»): Compara dos cadenas y nos informa True si son iguales y no considera mayúsculas y minúsculas \nIntroduzca su primera palabra: ");
                    palabra=br.readLine();
                    System.out.println("Confirma la palara: ");
                    confirm = br.readLine();
                    pass = palabra.equalsIgnoreCase(confirm);
                    if (pass==true){
                        System.out.println("Como el equals ha respondido "+pass+", las palabras coinciden sin importar las mayúsculas.");
                    }
                    else{
                        System.out.println("Como el equals ha respondido "+pass+", no coinciden las palabras.");
                    }
                    break;
                case 7:
                    System.out.println("Método compareTo(OtroString): Uno de los métodos más utilizados, nos da 0 si son iguales, <0 si la primera es alfabéticamente menor que la segunda, >0 si la primera es alfabéticamente mayor que la segunda. \nIntroduce tu primera palabra");
                    palabra = br.readLine();
                    System.out.println("Ahora compárala con otra: ");
                    confirm = br.readLine();
                    int compare = palabra.compareTo(confirm);
                    System.out.printf("El resultado de compare to de "+palabra+" frente a "+confirm+" es "+compare+", por lo que ");
                    if (compare==0) {
                        System.out.println("las 2 palabras son iguales.");
                    } else if (compare<0) {
                        System.out.println("la primera es alfabéticamente mayor.");
                    }else{
                        System.out.println("la segunda es alfabéticamente mayor.");
                    }
                    break;
                case 8:
                    System.out.println("Método lastIndexOf(‘caracter’): Nos entrega la última ubicación del carácter buscado. \nIntroduce una frase:");
                    String frase= br.readLine();
                    frase+=br.readLine(); //no tengo ni idea de por que lee esto una frase entera y no una palabra lo he emcontrado en internet y funciona :D
                    System.out.println("Ahora introduce el caracter que desee encontrar");
                    char letra = sc.next().charAt(0);
                    pos = frase.lastIndexOf(letra);
                    System.out.println("La última posición de la letra"+letra+"es la "+pos+"º.");
                    break;
                case 9:
                    System.out.println("Método substring(rangoorigen, rangodestino): nos entrega el valor de los caracteres desde el rango que nosotros queramos.\n Introduce una frase: ");
                    frase= br.readLine();
                    frase+=br.readLine();
                    System.out.println("¿Desde dónde quieres recortar la frase a la izquierda?");
                    int range1 = sc.next().charAt(0);
                    System.out.println("¿Desde dónde quieres recortar la frase a la derecha?");
                    int range2 = sc.next().charAt(0);
                    System.out.println("El ressultado es el siguiente: "+frase.substring(range1,range2));
                    break;
                case 10:
                    System.out.println("Método StringReplace(char antiguo, char nuevo): \nIntroduzca la frase: ");
                    frase = br.readLine();
                    frase+=br.readLine();
                    System.out.println("Antes: "+frase);
                    frase=frase.replace( 'a', 'e' );
                    frase=frase.replace( 'e', 'e' );
                    frase=frase.replace( 'i', 'e' );
                    frase=frase.replace( 'o', 'e' );
                    frase=frase.replace( 'u', 'e' );
                    System.out.println("Después: "+frase);
                    break;
                default:
                    break;
            }
        }

        //Ejercicio 4
        System.out.println("\n\n⟢ ⟗⟗⟗⟗ EJ.4 ⟗⟗⟗⟗  ⟣\nIntroduzca sus palabra para comprobar palíndromo: ");
        StringBuffer palabra = new StringBuffer();
        palabra.append(sc.nextLine());
        if (palabra.reverse()==palabra) {
            System.out.println("Enhorabuena, su palabra es un palíndromo");
        }else{
            System.out.println("Su palabra no es un palíndromo");
        }
        //Ejercicio 5
        System.out.println("\n\n⟢ ⟗⟗⟗⟗ EJ.5 ⟗⟗⟗⟗  ⟣\nIntroduzca su frase para convertirla a mayúsculas: ");
        String frase= sc.nextLine();
        frase+=sc.nextLine();
        System.out.println("Su frase transformada es: "+frase.toUpperCase());

        //Ejercicio 6
        System.out.println("\n\n⟢ ⟗⟗⟗⟗ EJ.6 ⟗⟗⟗⟗  ⟣\n Elimina el contenido de un rango determinado.");
        StringBuffer sb = new StringBuffer("HOLA MUNDO");
        System.out.printf("%s","Indique el rango de caracteres que desea eliminar de la frase "+sb+". ");
        System.out.printf("%s","Inicio: ");
        int start = sc.nextInt();
        System.out.printf("%s","Fin: ");
        int end = sc.nextInt();
        sb.delete(start-1,end);
        System.out.println("Resultado: " + sb.toString());


        //Ejercicio 7
        System.out.println("\n\n⟢ ⟗⟗⟗⟗ EJ.7 ⟗⟗⟗⟗  ⟣\nIntroduzca sus palabras para cordenarlas alfabéticamente: ");
        String palabra2[]=new String[5];
        for (int i = 0; i < palabra2.length; i++) {
            System.out.println((i+1)+"º Palabra:");
            palabra2[i] = sc.next();
        }
        Arrays.sort(palabra2);
        System.out.println(Arrays.toString(palabra2));
        sc.close();
    }
}
