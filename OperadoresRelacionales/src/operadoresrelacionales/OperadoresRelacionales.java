/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operadoresrelacionales;

import java.io.IOException;

/**
 *
 * @author MiguelChuil
 */
public class OperadoresRelacionales {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        int a = 6;
        int b = 2;        
        if( a>b && !(b<1)){
            System.out.println("Verdadero");
        }else{
            System.out.println("Falso");
        }
        
        HoraDelDia objHora = new HoraDelDia();
    }
    
}
