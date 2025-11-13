/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete01;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author danielrios
 */
public class ejemplo06 {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        System.out.println("Ingrese la placa");
        String cadena = entrada.nextLine();
        String inicial = cadena.substring(0,1);
        
        switch(inicial){
            case "g":
                System.out.printf("%s es una placa de Guayaquil", cadena);
                break;
                case "G":
                System.out.printf("%s es una placa de Guayaquil", cadena);
                break;
                case "p":
                System.out.printf("%s es una placa de Pichincha", cadena);
                break;
                case "P":
                System.out.printf("%s es una placa de Pichincha", cadena);
                break;
         
            default:
                System.out.println("ninguna de las anteriores");
                break;
        }
        
    }
    
}
