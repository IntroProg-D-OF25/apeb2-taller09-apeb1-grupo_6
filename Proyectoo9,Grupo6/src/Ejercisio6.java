
import java.util.Scanner;
/**
 *Modifique el ciclo repetitivo para que salga del mismo, cuando el usuario ingrese por teclado una letra que coincida con la primera letra de los "nombres" contenidos en del arreglo estudiantes. Debe usar un ciclo repetitivo para recorrer el arreglo estudiantes, y no quemar de forma constante dichas iniciales, imagine que estudiantes podría contener millón de nombres, por lo que fijar iniciales, es ineficiente.
 * @Juan Quizhpe
 */
public class Ejercisio6 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String[] estudiantes = {"Kimberly", "Hogan", "Teresa", "Luis", "Mark", "Jennifer", "Alcides"};
        String inicial;
        while (true) {
            System.out.println("Ingrese una letra:");
            inicial = entrada.nextLine().toLowerCase();  
            for (String estudiante : estudiantes) {
                if (Character.toLowerCase(estudiante.charAt(0)) == inicial.charAt(0)) {  
                    System.out.println("¡Se encontró una coincidencia!");
                    entrada.close();
                    return;  
                }
            }
            System.out.println("No hay coincidencias. Intenta otra vez.");
        }
    }
}/***
 * debug
 * Ingrese una letra:
   N
   No hay coincidencias. Intenta otra vez.
   Ingrese una letra:
   F
   No hay coincidencias. Intenta otra vez.
   Ingrese una letra:
   J
   ¡Se encontró una coincidencia!
   */
    