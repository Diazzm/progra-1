/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package monitoreoestabilidadred;

import java.util.Scanner;
import java.util.Random;

public class MonitoreoEstabilidadRed {

    public static void main(String[] args) {
        // Ejercicio 1: Monitoreo de Estabilidad de Red Inalámbrica

        Scanner sc = new Scanner(System.in);
        Random aleatorio = new Random();

        double señal = 0;
        int ruido = 0;
        int mediciones = 0;

        System.out.println("Monitoreo de Estabilidad de Red");

        System.out.println("Ingrese el nivel de señal (-1 para salir):");
        señal = sc.nextDouble();

        while (señal != -1) {

            if (señal > 0) {
                ruido = aleatorio.nextInt(51);
                mediciones++;

                System.out.println("Ruido de interferencia: " + ruido + " dBm");

                if (señal < 20 || ruido > 40) {
                    System.out.println("Alerta: Conexión inestable por baja señal o alta interferencia");
                } else {
                    System.out.println("Conexión estable");
                }

            } else {
                System.out.println("El nivel de señal debe ser positivo");
            }

            System.out.println("Ingrese el nivel de señal (-1 para salir):");
            señal = sc.nextDouble();
        }

        System.out.println("Total de mediciones realizadas: " + mediciones);

    }//Fin Main
}//Fin Class