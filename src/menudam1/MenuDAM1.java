/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menudam1;

import java.util.Scanner;

/**
 *
 * @author DAM110
 */
public class MenuDAM1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int opcion;
        Scanner teclado = new Scanner(System.in);
        do {
            System.out.println("--- MENU ENTORNOS DE DESARROLLOS ---");
            System.out.println("- Seleccione una de las siguiente opciones tecleando 1, 2, 3 o 4 -");
            System.out.println("1. .");
            System.out.println("2. .");
            System.out.println("3. .");
            System.out.println("4. .");
            System.out.println("5. .");
            System.out.println("6. Salir.");
            opcion = teclado.nextInt();
            switch (opcion) {
                case 1:

                    break;
                case 2:

                    break;
                case 3:

                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                default:
                    System.out.println("No has seleccionado un número entre 1 y 6");
            }
        } while (opcion != 6);
        
    }
    
}
