/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema4;


import java.util.Locale;
import java.util.Scanner;
/**
 *
 * @author HP
 */
public class Problema4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US); 
        String nombreCliente;
        double costoCpu;
        double costoTeclado;
        double costoRaton;
        double costoPantalla;
        double costoBase;
        double costoAdicional;
        double costoFinal;
        
        // Entrada de datos por teclado
        System.out.println("Ingrese los nombres del cliente:");
        nombreCliente = entrada.nextLine();
        
        System.out.println("Ingrese el costo de la CPU (Torre):");
        costoCpu = entrada.nextDouble();
        
        System.out.println("Ingrese el costo del Teclado:");
        costoTeclado = entrada.nextDouble();
        
        System.out.println("Ingrese el costo del Ratón:");
        costoRaton = entrada.nextDouble();
        
        System.out.println("Ingrese el costo de la Pantalla:");
        costoPantalla = entrada.nextDouble();
        
        
        costoBase = costoCpu + costoTeclado + costoRaton + costoPantalla;
        costoAdicional = costoBase * 0.15;
        costoFinal = costoBase + costoAdicional;
        
        
        System.out.printf("\nReporte: \n"
                + "Nombres de cliente: %s\n"
                + "Valores iniciales:\n"
                + "CPU: $%.2f\n"
                + "Teclado: $%.2f\n"
                + "Ratón: $%.2f\n"
                + "Pantalla: $%.2f\n\n"
                + "Costo base: $%.2f\n"
                + "Costo adicional del 15%%: %.2f\n"
                + "Costo final: $%.2f\n",
                nombreCliente, costoCpu, costoTeclado, costoRaton, costoPantalla, 
                costoBase, costoAdicional, costoFinal);
        
    }
    
}
