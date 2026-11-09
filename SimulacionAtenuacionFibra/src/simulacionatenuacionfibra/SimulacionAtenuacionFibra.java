/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package simulacionatenuacionfibra;

import java.util.Scanner;

public class SimulacionAtenuacionFibra {

    public static void main(String[] args) {
        // Ejercicio 3: Simulación de Atenuación de Fibra Óptica

        Scanner sc = new Scanner(System.in);

        double potencia = 0;
        int distancia = 0;

        System.out.println("Simulacion de Atenuacion de Fibra Optica");

        System.out.println("Ingrese la potencia inicial del laser en mW:");
        potencia = sc.nextDouble();

        while (potencia <= 0) {
            System.out.println("La potencia debe ser mayor a 0");
            System.out.println("Ingrese la potencia inicial del laser en mW:");
            potencia = sc.nextDouble();
        }

        System.out.println("Ingrese la distancia total del cable en kilometros:");
        distancia = sc.nextInt();

        while (distancia <= 0) {
            System.out.println("La distancia debe ser mayor a 0");
            System.out.println("Ingrese la distancia total del cable en kilometros:");
            distancia = sc.nextInt();
        }

        for (int i = 1; i <= distancia; i++) {

            potencia = potencia * 0.96;

            System.out.printf("Potencia restante en el kilometro %d: %.2f mW%n", i, potencia);

            if (potencia < 5) {
                System.out.println("Pérdida de señal crítica en el kilómetro " + i + ". Se requiere un repetidor.");
                break;
            }
        }

    }//Fin Main
}//Fin Class