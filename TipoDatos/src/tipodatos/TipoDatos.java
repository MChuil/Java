/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tipodatos;

/**
 *
 * @author MiguelChuil
 */
public class TipoDatos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a =  5;
        int b = 7;
        double c = 0.5;
        
        //Conversión implicita
        c = a;
        
        //Conversion explicita (Casting)
        a = (int) c;
        
        String s = "7";
        
        b = Integer.parseInt(s);
        c = Double.parseDouble(s);
        
    }
}
