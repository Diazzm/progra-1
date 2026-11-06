
package alarmavoltaje;

import java.util.Scanner;

public class AlarmaVoltaje {

    public static void main(String[] args) {
        // Ejercicio 1: Alarma de Voltaje en Capacitores

        Scanner sc = new Scanner(System.in);

        double voltajeNominal = 0;
        double voltajeActual = 0;
        double porcentaje = 0;

        System.out.println("Alarma de Voltaje");
        System.out.println("Ingrese el voltaje nominal:");
        voltajeNominal = sc.nextDouble();

        System.out.println("Ingrese el voltaje actual:");
        voltajeActual = sc.nextDouble();

        porcentaje = (voltajeActual * 100) / voltajeNominal;

        if (porcentaje > 85) {
            System.out.println("ALERTA: Riesgo de sobretension. Disminuya la fuente");
        }

        System.out.println("Porcentaje de carga: " + porcentaje + "%");

    }//Fin Main
}//Fin Class
