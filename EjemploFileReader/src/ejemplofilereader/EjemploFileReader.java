/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplofilereader;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author MiguelChuil
 */
public class EjemploFileReader {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        try {
            FileReader  fr = new FileReader("C:/Users/Chuil/Documents/NetBeansProjects/Java/EjemploFileReader/src/ejemplofilereader/saludo.txt");
            BufferedReader bf = new BufferedReader(fr);
            String s;
            String texto = new String();
            while((s = bf.readLine()) !=null){
                texto += ( s + "\n");
            }
            bf.close();
            System.out.println(texto);
        } catch (FileNotFoundException ex) {
            System.err.println("No se encuentra el archivo");
        }
    }
    
}
