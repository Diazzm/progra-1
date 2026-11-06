
package clasificadorttl;

import java.util.Scanner;

public class ClasificadorTTL {

    public static void main(String[] args) {
        // Ejercicio 2: Clasificador de Senal Digital TTL

        Scanner sc = new Scanner(System.in);

        double voltaje = 0;

        System.out.println("Clasificador TTL");
        System.out.println("Ingrese el voltaje:");
        voltaje = sc.nextDouble();

        if (voltaje >= 2) {
            System.out.println("Estado Logico: ALTO (1)");
        } else {
            System.out.println("Estado Logico: BAJO (0)");
        }

    }//Fin Main
}//Fin Class
