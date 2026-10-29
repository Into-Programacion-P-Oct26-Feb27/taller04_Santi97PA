/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema3n;


import java.util.Locale;
import java.util.Scanner;
/**
 *
 * @author HP
 */
public class Problema3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US); 
        
        String titular;
        String direccion;
        double costoMinuto;
        double minutosConsumidos;
        double valorTotal;
        
        System.out.println("Ingrese el nombre del titular:");
        titular = entrada.nextLine();
        
        System.out.println("Ingrese la dirección:");
        direccion = entrada.nextLine();
        
        System.out.println("Ingrese el costo por minuto:");
        costoMinuto = entrada.nextDouble();
        
        System.out.println("Ingrese los minutos consumidos:");
        minutosConsumidos = entrada.nextDouble();
        
        // Operación: Cálculo del valor total a pagar
        valorTotal = costoMinuto * minutosConsumidos;
        
        // Presentación del reporte con el formato exacto requerido
        System.out.printf("\n=============================================\n"
                + "PLANILLA DE SERVICIO TELEFÓNICO\n"
                + "=============================================\n"
                + "Titular: %s\n"
                + "Dirección: %s\n"
                + "---------------------------------------------\n"
                + "Costo por minuto: $%.2f\n"
                + "Minutos consumidos: %.2f\n"
                + "---------------------------------------------\n"
                + "VALOR TOTAL A PAGAR: $%.2f\n"
                + "=============================================\n",
                titular, direccion, costoMinuto, minutosConsumidos, valorTotal);
    
    }
    
}
