/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operadoresrelacionales;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author MiguelChuil
 */
public class HoraDelDia {
    BufferedReader  br = new BufferedReader(new InputStreamReader(System.in));

    public HoraDelDia() throws IOException {
        System.out.println("Escribe la hora:");
        int hora = Integer.parseInt(br.readLine());
        System.out.println("Esrcibe los minutos:");
        int minuto = Integer.parseInt(br.readLine());
        /*
        00:00 - 07:00 madrugada
        07:00 - 12:00 mañana
        12:00 - 21:00 tarde
        21:00 - 00:00 noche
        
        12:00 - medio dia
        00:00 - Media noche
        */
        if(hora ==12 && minuto ==0){
            System.out.println("MEDIO DIA");
        }else{
            if(hora ==0 && minuto == 0){
                System.out.println("MEDIA NOCHE");
            }else{
                if(hora>=0 && hora<=7){
                    System.out.println("Madrugada");
                }else{
                    if(hora>7 && hora<12){
                    System.out.println("Mañana");
                    }else{
                        if(hora>12 && hora <21){
                            System.out.println("Tarde");
                        }else{
                            if(hora>21 && hora<=23){
                                System.out.println("Noche");
                            }
                        }
                    }
                }
            }
        }
    }
}
