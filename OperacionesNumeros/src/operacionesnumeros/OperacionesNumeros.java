/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operacionesnumeros;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author MiguelChuil
 */
public class OperacionesNumeros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        // TODO code application logic here
        int a, b;
        double c, d;
        BufferedReader  br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Escribe un numero entero");
        a = Integer.parseInt(br.readLine());
        System.out.println("Escribe un numero entero:");
        b = Integer.parseInt(br.readLine());
        System.out.println("Escribe un numero real");
        c = Double.parseDouble(br.readLine());
        System.out.println("Escribe un numero real");
        d = Double.parseDouble(br.readLine());
        System.out.println("ENTEROS");
        System.out.println("a+b = " + (a+b));
        System.out.println("a-b = " + (a-b));
        System.out.println("a*b = " + (a*b));
        System.out.println("a/b = " + (a/b));
        System.out.println("a%b = " + (a%b));
        
        System.out.println("REALES");
        System.out.println("c+d = " + (c+d));
        System.out.println("c-d = " + (c-d));
        System.out.println("c*d = " + (c*d));
        System.out.println("c/d = " + (c/d));
        System.out.println("c%d = " + (c%d));
    }
    
}
