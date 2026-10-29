package rentadeservidores;

import java.util.Scanner;

public class RentaDeServidores {

    public static void main(String[] args) {
        // TODO code application logic here
        
        
         Scanner sc = new Scanner(System.in);
        
    /**   
        Renta de Servidores Web (Mezcla de switch e if/else con booleanos)
        Una empresa de hosting renta servidores. El costo base por día es de $10.0. Se le pide al usuario la cantidad de días y el tipo de plan (“A” Básico, “B” Pro, “C” Empresarial). 
        Usando un switch para añadir un costo extra diario:
        
·       Plan Básico se suma $0,

·       Plan Pro se suma $5,

·       Plan Empresarial se suma $15.

        Después de calcular el subtotal, usar una estructura de selección simple para aplicar una promoción:
·       Si el cliente renta el servidor por más de 15 días y el plan es 'B'o 'C', se le aplica un 15% de descuento al total.
        Se tiene que mostrar el total a pagar, la cantidad de días de renta y el plan seleccionado.
        * 
        - Datos Entrada
        1. Cantidad de Dias que se renta el servidor
        2. Que tipo de Plan se contrata
    
        - Procesamiento / Decisiones / Calculos
        1. Determinar el tipo de plan
        2. Validar el tipo de entrada de acuerdo plan*
        3. Calcular el costo de renta del servidor
            precio * dias Alquilados
        4. Calcular el costo total de pago
        5. Calcular el descuento segun criterios
                       
        */
    
    int dias;
    char plan;
    double costoBase = 10.0;
    double costoExtra = 0;
    double subtotal;
    double total;
    String nombrePlan = "";

    //Calcular Dias del Plan
    
    System.out.println("=== Renta Servidores de Progra 1 ===");
    
    System.out.print("Ingrese la cantidad de Dias: ");
        dias = sc.nextInt();
    
    System.out.println("Seleccione el tipo de plan:");
    System.out.println("A. Basico");
    System.out.println("B. Pro");
    System.out.println("C. Empresarial");
    System.out.print("Ingrese su plan: ");
        plan = sc.next().toUpperCase().charAt(0);
        
    //Calclar el costo del Plan
        
        
        
        switch (plan) { // Inicio del Switch
            case 'A':
                costoExtra = 0;
                nombrePlan = "Basico";
                break;

            case 'B':
                costoExtra = 5;
                nombrePlan = "Pro";
                break;

            case 'C':
                costoExtra = 15;
                nombrePlan = "Empresarial";
                break;

            default:
                System.out.println("Plan no valido.");
                return;
                
             
        } // Fin del Switch
        
    if (dias <=0) {
        System.out.println(" La cantidad de Dias no es valida");
        return;
    }
    
    subtotal = (costoBase + costoExtra) * dias;
    total = subtotal;

    
   
  
    }
    
}
