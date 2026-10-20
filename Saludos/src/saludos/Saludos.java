/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package saludos;

/**
 *
 * @author sebas
 */
public class Saludos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Aqui va 1er Mensaje");
        System.out.println("Luego una 2daaa linea para el mensaje");
        System.out.println("Coloqumos dentro del mensaje un 3ro");
        
        System.out.println("-----------------------------------");
        System.out.println("Cual sera la Diferencia entre print");
        System.out.println("Println y print");
        System.out.print("Probando... Probando");
        System.out.println("Aqui va Println");
        System.out.print("Y aqui va Print");
        System.out.println("Notas la diferencia");
        
        System.out.println("-------------------------------------");
        
        System.out.printf("probando un nuevo saludo para %s \n","Sebas");
        System.out.printf("Te saludo todas las veces  : %d",5);
        System.out.println("");
        System.out.printf("probando un nuevo %s saludo para \n","Sebas");
        System.out.printf("Te saludo todas %d las veces  :  ",5);
        System.out.println("");
        System.out.printf("%s probando un nuevo saludo para \n","Sebas");
        System.out.printf("%d Te saludo todas las veces  :  ",5);
        System.out.println("");
        System.out.println("-------------------------------------");
        
        /*
      
        %s -> Es para Texto
        %d -> Es para numeros Enteros
        %f -> Es para Numeros Decimales
        %b -> Es para Estados Boleanos
        
        println -> Impresion con salto de Linea
        print -> Impresion
        printf -> Impresion formateada
        
        */
        //Tipo de Variables             
        // Palabras Resaltada con color.., son Palabra CLAVE
        int edad;   //un espacio para numeros del tipo ENTERP
        double altura;  // Un espacio para numero tipo DECIMAL
        String nombre;  // Un espacio para cadenas/palabras/frases
        char genero;    // Un espacio para letras, digitos carecteres especiales
        boolean estado; // Un espacio para VERDADERO (TRUE) o FALSO (FALSE)
        int abc;
        
        edad = 15;
        altura = 1.91;
        nombre = "John doe";
        genero = 'm';
        estado = true;
        
        System.out.printf("Era una vez un personaje llamado %s \n" ,nombre);
        System.out.print("en la que buscaba congrasiarse \n");
        System.out.printf("con la gente del genero %c \n" ,genero);
        System.out.printf("el detalle estaba con los %f metros "  ,altura);
        System.out.print("media!!!\n");
        System.out.printf("Pero lo compensaba con %d anios de buena vida!!", edad);
        
    }
            
    
}
