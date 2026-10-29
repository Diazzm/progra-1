package distanciapuntos;


import java.util.Scanner;

public class DistanciaPuntos {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Ejercicio 3: Distancia entre dos puntos

        System.out.println("Distancia entre dos puntos");

        System.out.print("Ingrese x1: ");
        double x1 = sc.nextDouble();

        System.out.print("Ingrese y1: ");
        double y1 = sc.nextDouble();

        System.out.print("Ingrese x2: ");
        double x2 = sc.nextDouble();

        System.out.print("Ingrese y2: ");
        double y2 = sc.nextDouble();

        double distancia = Math.sqrt(
            Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2)
        );

        System.out.printf("Distancia: %.2f%n", distancia);
    }
}
