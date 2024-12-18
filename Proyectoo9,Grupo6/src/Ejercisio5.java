
/**
 * Dados los siguientes arreglos

double[] promedios = {10, 10, 9.1, 7, 6.1, 4, 8}; String[] estudiantes = {"Kimberly Gonzalez", "Mark Hogan", "Teresa Martinez", "Julia Johnson", "Mark Cook", "Jennifer Manning", "Juan Vasquez"};

 *
 * Juan Quizhpe
 */
public class Ejercisio5 {
    public static void main(String[] args) {
        double[] promedios = {10, 10, 9.1, 7, 6.1, 4, 8};
        String[] estudiantes = {"Kimberly Gonzalez", "Mark Hogan", "Teresa Martinez", "Julia Johnson", "Mark Cook", "Jennifer Manning", "Juan Vasquez"};
        String[] promediosCualitativos = new String[7];

        for (int i = 0; i < promedios.length; i++) {
            if (promedios[i] >= 9 && promedios[i] <= 10) {
                promediosCualitativos[i] = "Sobresaliente";
            } else if (promedios[i] >= 6 && promedios[i] <= 8.9) {
                promediosCualitativos[i] = "Bueno";
            } else {
                promediosCualitativos[i] = "Regular";
            }

            System.out.printf("%s promedio: %.2f promedio cualitativo: %s%n", estudiantes[i], promedios[i], promediosCualitativos[i]);
        }
    }
    
}

    /***
     * debug:
     * Kimberly Gonzalez promedio: 10,00 promedio cualitativo: Sobresaliente
       Mark Hogan promedio: 10,00 promedio cualitativo: Sobresaliente
       Teresa Martinez promedio: 9,10 promedio cualitativo: Sobresaliente
       Julia Johnson promedio: 7,00 promedio cualitativo: Bueno
       Mark Cook promedio: 6,10 promedio cualitativo: Bueno
       Jennifer Manning promedio: 4,00 promedio cualitativo: Regular
       Juan Vasquez promedio: 8,00 promedio cualitativo: Bueno
     */
