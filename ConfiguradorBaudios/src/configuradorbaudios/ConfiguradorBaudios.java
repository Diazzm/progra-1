
package configuradorbaudios;

import java.util.Scanner;

public class ConfiguradorBaudios {

    public static void main(String[] args) {
        // Ejercicio 3: Configurador de Tasa de Baudios

        Scanner sc = new Scanner(System.in);

        int opcion = 0;
        int velocidad = 9600;

        System.out.println("Configurador de Puerto Serial");

        System.out.println("1. 9600 baudios");
        System.out.println("2. 19200 baudios");
        System.out.println("3. 115200 baudios");

        System.out.println("Seleccione una opcion:");
        opcion = sc.nextInt();

        switch (opcion) {
            case 1:
                velocidad = 9600;
                break;

            case 2:
                velocidad = 19200;
                break;

            case 3:
                velocidad = 115200;
                break;

            default:
                System.out.println("Opcion no valida, usando 9600 bps por defecto");
                break;
        }//Fin Switch

        System.out.println("Configurando puerto serial a " + velocidad + " bps");

    }//Fin Main
}//Fin Class
