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
public class Libro {
    String titulo;
    String autor;
    boolean abierto = false;
    int numeroPaginas;
    int paginaActual = 0;
    
    public void abrir(){
        abierto = true;
    }
    
    public void cerrar(){
        abierto = false;
    }
}
