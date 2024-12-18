
/**
 *Dado el arreglo; determinar cuantos elementos están arriba de la media aritmética y cuantos están por debajo de la medía aritmética int[] arreglo = {1, 10, 11, 12, 12, 13, 16, 2, 3, 4, 9, 10, 21};
 * Juan Quizhpe
 */
public class Ejercisio4 {
    public static void main(String[] args) {
    int[] arreglo = {1, 10, 11, 12, 12, 13, 16, 2, 3, 4, 9, 10, 21};
        double suma = 0;
        for (int num : arreglo) {
            suma += num;
        }
        double media = suma / arreglo.length;
        int arribaDeLaMedia = 0;
        int debajoDeLaMedia = 0;
        for (int num : arreglo) {
            if (num > media) {
                arribaDeLaMedia++;
            } else if (num < media) {
                debajoDeLaMedia++;
            }
        }
        System.out.println("Media aritmética: " + media);
        System.out.println("Elementos arriba de la media: " + arribaDeLaMedia);
        System.out.println("Elementos debajo de la media: " + debajoDeLaMedia);
}}

    /***
     * debug:
     *  Media aritmética: 9.538461538461538
        Elementos arriba de la media: 8
        Elementos debajo de la media: 5
     */
