/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicionumerosprimos;

/**
 *
 * @author MiguelChuil
 */
public class EjercicioNumerosPrimos {

   static boolean esPrimo(int num){
       boolean primo = true;
       int i = 2;
       while(i<num){
           if(num%i==0){
               primo = false;
           }
           i++;
       }
       /*if(num%2==0){
           primo=false;
       }*/
       return primo;
   }
   
    public static void main(String[] args) {
        // TODO code application logic here
        for (int i = 1; i <= 1000; i++) {
            if(esPrimo(i)){
                System.out.println("Numero primo: " + i);
            }
        }
    }
    
}
