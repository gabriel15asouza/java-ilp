/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proj_ponto;

/**
 *
 * @author gabal
 */
public class Proj_ponto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Ponto p1 = new Ponto (4,5);
        Ponto p2 = new Ponto (1,1);
        double result = p1.calculoDistancia(p1,p2);
        
        System.out.println("Resultado: " + result);
    }
    
}
