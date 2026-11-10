
package controlacceso;

import java.util.Scanner;

public class ControlAcceso {

    public static void main(String[] args) {
        // Ejercicio 4: Control de Acceso a Base de Datos

        Scanner sc = new Scanner(System.in);

        String usuario = "";
        int pin = 0;

        System.out.println("Control de Acceso a Base de Datos");

        System.out.println("Ingrese el usuario:");
        usuario = sc.next();

        System.out.println("Ingrese el PIN:");
        pin = sc.nextInt();

        if (usuario.equals("admin")) {

            if (pin == 1234) {
                System.out.println("Acceso concedido al motor de base de datos");
            } else {
                System.out.println("PIN incorrecto, acceso denegado");
            }

        } else {
            System.out.println("Usuario no encontrad0");
        }

    }//Fin Main
}//Fin Class
