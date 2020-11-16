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
            System.out.println("1. Calcular si un número es perfecto.");
            System.out.println("2. Hacer la tabla de multiplicar de un número.");
            System.out.println("3. .");
            System.out.println("4. .");
            System.out.println("5. .");
            System.out.println("6. .");
            System.out.println("7. Salir.");
            opcion = teclado.nextInt();
            switch (opcion) {
                case 1:
                    //opcion del menu en la cual calcularemos si un numero es perfecto.
                    int i,
                     suma = 0,
                     n;
                    System.out.println("Introduce el número: ");
                    n = teclado.nextInt();
                    for (i = 1; i < n; i++) { // i son los divisores. Se divide desde 1 hasta n-1  
                        if (n % i == 0) {
                            suma = suma + i; // si es divisor se suma
                        }
                    }
                    if (suma == n) { // si el numero es igual a la suma de sus divisores es perfecto   
                        System.out.println("Perfecto");
                    } else {
                        System.out.println("No es perfecto");

                    }

                    break;
                case 2:
                    int resul;
                    System.out.println("Introduce el numero del que quieres hacer la tabla de multiplicar: ");
                    int num = teclado.nextInt();
                    for (int j = 0; j < 10; j++) {
                        System.out.println("Introduce la respuesta: ");
                        System.out.println(num + "*" + (j + 1) + "=");
                        resul = teclado.nextInt();
                        while (resul != (num * (j + 1))) {
                            System.out.println("---INCORRECTO---");
                            System.out.println("Introduce la respuesta: ");
                            System.out.println(num + "*" + (j + 1) + "=");
                            resul = teclado.nextInt();
                        }
                        System.out.println("---CORRECTO---");
                    }
                    System.out.println("Enhorabuena, has terminado.");
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    break;
                default:
                    System.out.println("No has seleccionado un número entre 1 y 7");
            }
        } while (opcion != 7);

    }

}
