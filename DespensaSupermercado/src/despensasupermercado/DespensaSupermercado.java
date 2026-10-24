/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package despensasupermercado;

import java.util.Scanner;
/**
 *
 * @author sebas
 */
public class DespensaSupermercado {

    /**
 * Un supermercado desea desarrollar un programa para gestionar algunos productos de su despensa.

    El programa deberá solicitar al usuario:

    1. El nombre del producto.
    2. La cantidad de unidades disponibles en la despensa.
    3. El precio por unidad.
    * 
    * Si la cantidad disponible es menor a 10 unidades, el programa debe mostrar 
    * un mensaje indicando:
    *   "El producto necesita ser reabastecido."
    * 
    * Luego, el programa deberá verificar el precio del producto:
    * 
    *   Si el precio es mayor o igual a 50, mostrar:
    *       "Producto de precio alto."
    *       En caso contrario, mostrar:
    *       "Producto de precio económico."
    * 
    * 
    * Mostrar todo lo que se pidio junto a los mensajes,
    * incluir cuanto gastaria si se lleva producto.
    */
     public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
    
   String nombreProducto = "";
   int stock = 0;
   double precio = 0.0;
   double total;
   
   System.out.println("super de progra");
   System.out.print("Nombre del Producto: ");
   nombreProducto = scan.nextLine();
   
   System.out.printf("Cuanto hay de stock: ");
   stock = scan.nextInt();
   
   System.out.printf("Que cuesta el producto: ");
   precio = scan.nextDouble();
   
   if(stock < 10){
       //IF se ejecuta si la condicion es VERDADERA
       System.out.println("El producto necesita");
       System.out.println("Ser rebastecido!!!");
   }// fin de IF
           
       if(precio >=50) {
           System.out.println("Producto de precio alto!!!");
       }else {
           System.out.println("producto de precio economico!");
       }   
       
       System.out.println("===Resumen===");
       System.out.printf("Producto: %s%n",nombreProducto);
       System.out.printf("Stock: %d%n",stock);
       total = stock * precio;
       System.out.printf("Total a pagar: L. %.2f%n", total);
   
    }

}
    

