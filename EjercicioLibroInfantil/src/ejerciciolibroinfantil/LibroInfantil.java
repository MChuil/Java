/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciolibroinfantil;

/**
 *
 * @author MiguelChuil
 */
public class LibroInfantil extends Libro {
    private int edadRecomendada = 18;
    
    public boolean esRecomendable(int edadNino){
        if(edadNino >= this.edadRecomendada){
            return true;
        }else{
            return false;
        }
    }
    
    public int getEdadRecomendada(){
        return this.edadRecomendada;
    }
    
    public void setEdadRecomendada(int edadRecomendada){
        this.edadRecomendada = edadRecomendada;
    }
}
