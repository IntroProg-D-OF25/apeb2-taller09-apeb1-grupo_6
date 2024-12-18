
import java.util.Random;
/**
 * El primer ciclo paralelo C, cuenta con 28 estudiantes, de los cuales al finalizar el ciclo, la Dirección de la carrera de Computación a solicitado las siguientes estadísticas en función a los promedios obtenidos del ciclo por estudiantes (use 1 arreglo, no matrices, y para el promedio por estudiante, no ingrese el valor, si se debe autogenerar).
 * @Juan Quizhpe
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
 * 1.1597400919045653 , 
0.7201429641909407 , 
8.786714284301617 , 
8.695522615171694 , 
6.391909003925933 , 
4.089467134194207 , 
8.397165837324406 , 
4.539888720418418 , 
8.613317354906465 , 
1.964277378505015 , 
0.4911165400082862 , 
2.287556593163884 , 
6.4445546579172985 , 
4.013417695478067 , 
3.487202945808403 , 
6.947714653622513 , 
7.539447049484379 , 
9.78883862648918 , 
6.68505360358962 , 
3.6200527534601967 , 
6.576682483744087 , 
3.285381515158176 , 
3.9652725985483728 , 
4.823028759546453 , 
6.967421784860219 , 
0.5937573105531024 , 
0.8539929399535218 , 
4.407915758708338 , 
Promedio del ciclo: 4.86201977339062
Estudiantes con calificación por encima del promedio:
Estudiante 3: 8.786714284301617
Estudiante 4: 8.695522615171694
Estudiante 5: 6.391909003925933
Estudiante 7: 8.397165837324406
Estudiante 9: 8.613317354906465
Estudiante 13: 6.4445546579172985
Estudiante 16: 6.947714653622513
Estudiante 17: 7.539447049484379
Estudiante 18: 9.78883862648918
Estudiante 19: 6.68505360358962
Estudiante 21: 6.576682483744087
Estudiante 25: 6.967421784860219

Estudiantes con calificación por debajo del promedio:
Estudiante 1: 1.1597400919045653
Estudiante 2: 0.7201429641909407
Estudiante 6: 4.089467134194207
Estudiante 8: 4.539888720418418
Estudiante 10: 1.964277378505015
Estudiante 11: 0.4911165400082862
Estudiante 12: 2.287556593163884
Estudiante 14: 4.013417695478067
Estudiante 15: 3.487202945808403
Estudiante 20: 3.6200527534601967
Estudiante 22: 3.285381515158176
Estudiante 23: 3.9652725985483728
Estudiante 24: 4.823028759546453
Estudiante 26: 0.5937573105531024
Estudiante 27: 0.8539929399535218
Estudiante 28: 4.407915758708338

Estudiante con la mejor calificación: Estudiante 18 con calificación: 9.78883862648918
Estudiante con la peor calificación: Estudiante 11 con calificación: 0.4911165400082862
 */
