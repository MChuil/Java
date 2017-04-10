/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciofactorial;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author MiguelChuil
 */
public class EjercicioFactorial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        System.out.println("CALCULAR FACTORIAL DE UN NUMERO");
        BufferedReader  br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Ingresa un numero entero y positivo");
        int numero = Integer.parseInt(br.readLine());
        while(numero<0){
             System.out.println("ERROR: El numero no es positivo");
             System.out.print("Ingresa otro numero");
         numero = Integer.parseInt(br.readLine());
        }
        int factorial=1;
        for (int i = 1; i <=numero; i++) {
            factorial = factorial * i;
        }
        System.out.println("Factorial de " + numero + ": " + factorial);
    }
}
