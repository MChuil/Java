/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciopersona;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 *
 * @author MiguelChuil
 */
public class EjercicioPersona {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) throws Exception {
        BufferedReader  br = new BufferedReader(new InputStreamReader(System.in));     
        Scanner sc = new Scanner(System.in);
         
        //Introducimos los datos
        System.out.println("Introduce el nombre");
        String nombre = br.readLine();
 
        System.out.println("Introduce la edad");
        int edad = Integer.parseInt(br.readLine());
 
        System.out.println("Introduce el sexo");
        //char sexo =  (char) System.in.read();
        char sexo = sc.next().charAt(0);
        
        System.out.println("Introduce el peso");
        double peso = Double.parseDouble(br.readLine());
 
        System.out.println("Introduce la altura");
        double altura = Double.parseDouble(br.readLine());
 
        //Creamos objetos con cada constructor
        Persona persona1 = new Persona();
        Persona persona2 = new Persona(nombre, edad,  sexo);
        Persona persona3 = new Persona(nombre, edad, sexo, peso, altura);
 
        //Los datos que no esten completos los insertamos con los metodos set
        persona1.setNombre("Laura");
        persona1.setEdad(30);
        persona1.setSexo('M');
        persona1.setPeso(60);
        persona1.setAltura(1.60);
 
        persona2.setPeso(90.5);
        persona2.setAltura(1.80);
 
        //Usamos metodos para realizar la misma accion para cada objeto
        System.out.println("Persona1");
        MuestraMensajePeso(persona1);
        MuestraMayorDeEdad(persona1);
        System.out.println(persona1.toString());
 
        System.out.println("Persona2");
        MuestraMensajePeso(persona2);
        MuestraMayorDeEdad(persona2);
        System.out.println(persona2.toString());
 
        System.out.println("Persona3");
        MuestraMensajePeso(persona3);
        MuestraMayorDeEdad(persona3);
        System.out.println(persona3.toString());
    }
    
    public static void MuestraMensajePeso(Persona p) {
        int IMC = p.calcularIMC();
        switch (IMC) {
            case Persona.PESO_IDEAL:
                System.out.println("La persona esta en su peso ideal");
                break;
            case Persona.INFRAPESO:
                System.out.println("La persona esta por debajo de su peso ideal");
                break;
            case Persona.SOBREPESO:
                System.out.println("La persona esta por encima de su peso ideal");
                break;
        }
    }
 
    public static void MuestraMayorDeEdad(Persona p) {
 
        if (p.esMayorDeEdad()) {
            System.out.println("La persona es mayor de edad");
        } else {
            System.out.println("La persona no es mayor de edad");
        }
    }
}
