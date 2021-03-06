/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operadorespromedio.pkg25566;

import java.util.Scanner;

public class OperadoresPromedio25566 {

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        // TODO code application logic here
            Scanner captura = new Scanner (System.in);
            
            System.out.println("ingrese el primer valor");
            float d1=captura.nextFloat();
            
            System.out.println("ingrese el segundo valor");
            float d2=captura.nextFloat();
            
            System.out.println("ingrese el tercer valor");
            float d3=captura.nextFloat();
            
            System.out.println("ingrese el cuarto valor");
            float d4=captura.nextFloat();
            
            System.out.println("ingrese el quinto valor");
            float d5=captura.nextFloat();
            
            float prom = (d1 + d2 + d3 +d4 +d5 )/5;
            
            System.out.println("el promedio es:"  + prom);
            
    }
    
}
