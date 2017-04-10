/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosumarnumeros;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author MiguelChuil
 */
public class EjercicioSumarNumeros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        BufferedReader  br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("¿Deseas sumar numeros (s/n)?");
        String respuesta = br.readLine();
         int total = 0;
        while(respuesta.equals("s")){
            System.out.print("Introduce el primer numero:");
            int numero = Integer.parseInt(br.readLine());
            total +=numero;
            System.out.print("¿Deseas seguir sumando numeros (s/n)?");
            respuesta = br.readLine();
        }
        if(total>0){
             System.out.println("Suma total: " + total);
        }
    }
    
}
