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
public class Sirena implements Sonoro {

    @Override
    public void sonar(int volumen) {
        System.out.println("Sirena");
    }
    
}
