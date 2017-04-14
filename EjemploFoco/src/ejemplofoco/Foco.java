/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplofoco;

/**
 *
 * @author MiguelChuil
 */
public class Foco {
    private boolean estado = false;
    
    public void encender(){
        estado = true;
    }
    
    public void apagar(){
        estado = false;
    }
    
    public void estado(){
        if(estado == true){
            System.out.println("Encendida");
        }else{
            System.out.println("Apagado");
        }
    }
}
