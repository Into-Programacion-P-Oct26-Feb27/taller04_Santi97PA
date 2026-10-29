/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema2;


import java.util.Locale;
import java.util.Scanner;
/**
 *
 * @author HP
 */
public class Problema2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US); 
        double base;
        double altura;
        double area;
                
        System.out.println("Ingrese la base del triángulo:");
        base = entrada.nextDouble();
        
        System.out.println("Ingrese la altura del triángulo:");
        altura = entrada.nextDouble();
        
       
        area = (base * altura) / 2;
        
        // Presentación de resultados con el estilo requerido
        System.out.printf("\n--- CÁLCULO DEL ÁREA DE UN TRIÁNGULO ---\n"
                + "Base ingresada: %.2f\nAltura ingresada: %.2f\n"
                + "------------------------------------\n"
                + "EL ÁREA DEL TRIÁNGULO ES: %.2f\n", 
                base, altura, area);        
    }
    
}
