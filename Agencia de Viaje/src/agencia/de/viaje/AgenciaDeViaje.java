package agencia.de.viaje;

import java.util.Scanner;

public class AgenciaDeViaje {


    /**
     * 1. Estructuras de Secuencia
     *      a. Variables y los tipos
     *      b. Impresion en Pantalla
     *      c. Operaciones Aritmeticas
     * 2. Estructuras de Seleccion
     *      a. Simple (if)
     *      b. Dobles (if...else)
     *      c. Multiples (switch)
     *      d. Anidadas     (mix...if/else dentro otro if/else,
     *                      o el uso de switch con if/else)
     * 
     * if/else -> un rango de valores
     *            elementos igualitarios o distincion
     * 
     * switch ->  casos de igualdad, todos las opciones son iguales en valor.
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        
        int selCiudad = 0;
        double presupuesto = 0;
        double precioViaje = 0;
        char selAventura = '@';
        
        System.out.println("Agencia de Viajes de Progra I");
        System.out.println("La excelencia de la eleccion..esta en sus manos");
        System.out.println("Nosotros solo propiciamos la vuelta al mundo.!!!");
        
                System.out.print("Ingrese su presupuesto: $. ");
        presupuesto = sc.nextDouble();
        
        System.out.println("=== Destinos Disponibles ===");
        System.out.println("1. Antigua Guatemala - $200");
        System.out.println("2. Cartagena - $400");
        System.out.println("3. Tokyo - $1200");
        System.out.println("4. Milan - $1600 ");
        System.out.print("Seleccione su Destino: ");
        selCiudad = sc.nextInt();
        

        
        switch(selCiudad){
            case 1:
                System.out.println("Visitando Guatemala");
                System.out.println("una ciudad colonial como");
                System.out.println("Antigua Guatemala!");
                precioViaje = 200;
                break;
                
            case 2:
                System.out.println("Las mejores playas de ");
                System.out.println("Colombia...!!");
                System.out.println("Bienvenido a Cartagena!");
                precioViaje = 400;
                break;
                
            case 3:
                System.out.println("No es como la pelicula");
                System.out.println("pero si igual de espectacular");
                System.out.println("Tokyo, Japon");
                precioViaje = 1200;
                break;
                
            case 4:
                System.out.println("La ciudad de la moda");
                System.out.println("Mucha aristocracia de por medio");
                System.out.println("Milan, Italia");
                precioViaje = 1600;
                break;
                
            default:
                System.out.println("Destino no encontrado");
                System.out.println("Ingreso Incorrecto");
                System.out.println("Lea");
                break;
        }//Fin de Switch
        
        if (selCiudad >=1 && selCiudad <=4) {
            
            if (presupuesto >= precioViaje) {
                System.out.println("Felicidades! Puede realizar el viaje");
                System.out.printf("Dinero restante: $. %.2f%n", 
                     presupuesto - precioViaje);
                     
            } else {
                System.out.println("Su presupuesto no es suficiente");
                System.out.printf("Le faltan $. %.2f%n", 
                        precioViaje - presupuesto);
                
                return;
            }
            
            }else{
                return;
        }
    
        System.out.println("Ahora.. Busquemos un aventura por hacer");
        System.out.println("Con o sin ganas, pero viviendo la vida");
        System.out.println("A. Paracaidismo");
        System.out.println("B. Caminar por la tigra");
        System.out.println("C. Montania Rusa - Six Flags");
        System.out.println("D. Buceo con Tanque");
        System.out.println("E. Canopy");
        System.out.println("F. Subir un volcan");
        System.out.print("Dime tu Aventura: ");
        selAventura = sc.next().toUpperCase().charAt(0); // Mayuscula la Escritura
        // selAventura = sc.next().toLowerCase().charAt(0); Mniscula la escritura
        switch (selAventura) {
            case 'A':
                System.out.println("Nos tiramos de un avion");
            case 'B':
                System.out.println("Cuidado se pierden en el bosque");
            case 'C':
                System.out.println("Gritemos hasta quedarnos sin aliento");
            case 'D':
                System.out.println("No se ahoguen");
            case 'E':
                System.out.println("Cuidado se caen");
            case 'F':
                System.out.println("No se quemen");
                
            default:
                System.out.println("No sea bruto, lea");
                
                
                     
                       
                
                
        }// Fin del Switch
        
        
    }//Fin Main
    
}//Fin de Class