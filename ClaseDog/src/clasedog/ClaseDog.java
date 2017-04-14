/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clasedog;

/**
 *
 * @author MiguelChuil
 */
public class ClaseDog {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Dog perro = new Dog();
        perro.setPeso(65);
        System.out.println("El peso del perro: " + perro.getPeso() + " kilos.");
    }
    
}
