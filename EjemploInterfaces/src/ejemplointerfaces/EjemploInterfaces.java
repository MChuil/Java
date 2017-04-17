/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplointerfaces;

/**
 *
 * @author MiguelChuil
 */
public class EjemploInterfaces {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Sirena s = new Sirena();
        Tambor t = new Tambor();
        Trompeta tr = new Trompeta();
        
        //ERROR, instanciar una clase abtracta
        //IntrumentoMusical i = new InstrumentoMusical();
    }
    
}
