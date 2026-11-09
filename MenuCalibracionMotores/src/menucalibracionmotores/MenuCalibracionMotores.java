/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package menucalibracionmotores;

import java.util.Scanner;
import java.util.Random;

public class MenuCalibracionMotores {

    public static void main(String[] args) {
        // Ejercicio 2: Menú de Calibración de Motores Paso a Paso

        Scanner sc = new Scanner(System.in);
        Random r = new Random();

        int opcion = 0;
        double error = 0;

        do {
            System.out.println("Menu de Calibracion");
            System.out.println("1. Calibrar Eje X");
            System.out.println("2. Calibrar Eje Y");
            System.out.println("3. Salir");
            System.out.println("Seleccione una opcion:");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    error = r.nextDouble() * 5;

                    if (error > 2.5) {
                        System.out.println("Calibracion del eje X fallida");
                    } else {
                        System.out.println("Eje X calibrado exitosamente");
                    }
                    System.out.println("Error: " + error + " mm");
                    break;

                case 2:
                    error = r.nextDouble() * 5;

                    if (error > 2.5) {
                        System.out.println("Calibracion del eje Y fallida");
                    } else {
                        System.out.println("Eje Y calibrado exitosamente");
                    }
                    System.out.println("Error: " + error + " mm");
                    break;

                case 3:
                    System.out.println("Saliendo del menu");
                    break;

                default:
                    System.out.println("Opcion invalida");
                    break;
            }

        } while (opcion != 3);

    }//Fin Main
}//Fin Class