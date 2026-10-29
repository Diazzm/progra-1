package nominasemanal;


import java.util.Scanner;

public class NominaSemanal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Ejercicio 2: Nomina de Salario Semanal

        System.out.println("Nomina Semanal");

        System.out.print("Ingrese las horas trabajadas: ");
        double horas = sc.nextDouble();

        System.out.print("Ingrese el pago por hora: ");
        double pago = sc.nextDouble();

        double salarioBruto = horas * pago;
        double deduccion = salarioBruto * 0.08;
        double salarioNeto = salarioBruto - deduccion;

        System.out.printf("Salario Bruto: L. %.2f%n", salarioBruto);
        System.out.printf("Deduccion (8%%): L. %.2f%n", deduccion);
        System.out.printf("Salario Neto: L. %.2f%n", salarioNeto);
    }
}

