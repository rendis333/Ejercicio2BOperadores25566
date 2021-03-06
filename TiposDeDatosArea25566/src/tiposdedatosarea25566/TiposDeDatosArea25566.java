/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tiposdedatosarea25566;

import java.util.*;
/**
 *
 * @author escuela
 */
public class TiposDeDatosArea25566 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double base, altura, resultado;     
        Scanner obj = new Scanner(System.in);
         
        System.out.print("Ingrese base:\t");
        base = obj.nextDouble();
         
        System.out.print("Ingrese altura:\t");
        altura = obj.nextDouble();
         
        resultado = (base*altura);
         
        System.out.print("El area del Rectangulo es:\t"+resultado);
    }
    
}
