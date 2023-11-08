/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package projdog;

/**
 *
 * @author gabal
 */
public class Teste {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Dog primeiro = new Dog();
        primeiro.setNome("Nina");
        primeiro.setPeso(1);
        
        Dog segundo=new Dog();
        segundo.setNome("Bravo");
        segundo.setPeso(10);
        
        System.out.println("Dog primeiro: " + primeiro.getNome());
        System.out.println("Peso primeiro: " + primeiro.getPeso());
        primeiro.latir();
        
        System.out.println("Dog segundo: " + segundo.getNome());
        System.out.println("Peso segundo: " + segundo.getPeso());
        segundo.latir();
    }
    
}
