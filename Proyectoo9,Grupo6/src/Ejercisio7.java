
import java.util.Random;
/**
 * El primer ciclo paralelo C, cuenta con 28 estudiantes, de los cuales al finalizar el ciclo, la Dirección de la carrera de Computación a solicitado las siguientes estadísticas en función a los promedios obtenidos del ciclo por estudiantes (use 1 arreglo, no matrices, y para el promedio por estudiante, no ingrese el valor, si se debe autogenerar).
 */
public class Ejercisio7 {
    public static void main(String[] args) {
           int numEstudiantes = 28; 
        double[] calificaciones = new double[numEstudiantes];  
        Random random = new Random();

        int sumacalificaciones = 0;
        for (int i = 0; i < numEstudiantes; i++) {
            calificaciones[i] = Math.random() * 10;
           sumacalificaciones += calificaciones[i];
            System.out.println(calificaciones [i] + " , ");
        }

    
        double suma = 0;
        for (int i = 0; i < numEstudiantes; i++) {
            suma += calificaciones[i];
        }
        double promedioCiclo = suma / numEstudiantes;

      
        System.out.println("Promedio del ciclo: " + promedioCiclo);
        System.out.println("Estudiantes con calificación por encima del promedio:");
        for (int i = 0; i < numEstudiantes; i++) {
            if (calificaciones[i] > promedioCiclo) {
                System.out.println("Estudiante " + (i + 1) + ": " + calificaciones[i]);
            }
        }

        System.out.println("\nEstudiantes con calificación por debajo del promedio:");
        for (int i = 0; i < numEstudiantes; i++) {
            if (calificaciones[i] < promedioCiclo) {
                System.out.println("Estudiante " + (i + 1) + ": " + calificaciones[i]);
            }
        }

       
        double mejorCalificacion = calificaciones[0];
        double peorCalificacion = calificaciones[0];
        int mejorEstudiante = 0;
        int peorEstudiante = 0;

        for (int i = 1; i < numEstudiantes; i++) {
            if (calificaciones[i] > mejorCalificacion) {
                mejorCalificacion = calificaciones[i];
                mejorEstudiante = i;
            }
            if (calificaciones[i] < peorCalificacion) {
                peorCalificacion = calificaciones[i];
                peorEstudiante = i;
            }
        }

        System.out.println("\nEstudiante con la mejor calificación: Estudiante " + (mejorEstudiante + 1) + " con calificación: " + mejorCalificacion);
        System.out.println("Estudiante con la peor calificación: Estudiante " + (peorEstudiante + 1) + " con calificación: " + peorCalificacion);
    }
}
/***
 * Promedio del ciclo: 4.612211679315018
Estudiantes con calificación por encima del promedio:
Estudiante 1: 5.0046053649741165
Estudiante 2: 7.479823874986419
Estudiante 6: 4.620357790077623
Estudiante 7: 7.4001988723741725
Estudiante 8: 8.592561055444826
Estudiante 9: 6.725721989055989
Estudiante 12: 8.205986489994558
Estudiante 13: 9.048229233869876
Estudiante 17: 5.8876585422270145
Estudiante 19: 8.143651715425285
Estudiante 21: 5.951366726890962
Estudiante 23: 6.188559949685294
Estudiante 28: 7.88609503383643

Estudiantes con calificación por debajo del promedio:
Estudiante 3: 2.0078374240665475
Estudiante 4: 4.5198050889375265
Estudiante 5: 2.0001928301920966
Estudiante 10: 2.966693075025495
Estudiante 11: 2.460184814699776
Estudiante 14: 2.8344900335434975
Estudiante 15: 0.4259288333039146
Estudiante 16: 3.0714600504216136
Estudiante 18: 0.5984914444032985
Estudiante 20: 4.4471512187655895
Estudiante 22: 3.022071565974196
Estudiante 24: 4.211454567240017
Estudiante 25: 2.3111977809225515
Estudiante 26: 2.0341043580095706
Estudiante 27: 1.0960472964722168

Estudiante con la mejor calificación: Estudiante 13 con calificación: 9.048229233869876
Estudiante con la peor calificación: Estudiante 15 con calificación: 0.4259288333039146
 */
