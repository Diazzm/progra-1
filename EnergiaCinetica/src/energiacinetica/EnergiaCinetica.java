package energiacinetica;

import java.util.Scanner;

public class EnergiaCinetica {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Ejercicio 1: Calculo de Energia Cinetica

        System.out.println("Energia Cinetica");

        System.out.print("Ingrese la masa en kg: ");
        double masa = sc.nextDouble();

        System.out.print("Ingrese la velocidad en m/s: ");
        double velocidad = sc.nextDouble();

        double energia = 0.5 * masa * Math.pow(velocidad, 2);

        System.out.printf("Energia Cinetica: %.2f Joules%n", energia);
    }
}

