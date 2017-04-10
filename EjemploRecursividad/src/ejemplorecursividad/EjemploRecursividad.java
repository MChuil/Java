/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplorecursividad;

/**
 *
 * @author MiguelChuil
 */
public class EjemploRecursividad {

  static int factorial(int num){
      if(num == 0){
          return 1;
      }else{
          return num*factorial(num-1);
      }
  }
    
    public static void main(String[] args) {
        System.out.println(factorial(1));
    }
    
}
