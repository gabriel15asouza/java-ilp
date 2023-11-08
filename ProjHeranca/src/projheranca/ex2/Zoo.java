/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package projheranca.ex2;

/**
 *
 * @author gabal
 */
public class Zoo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Peixe truta = new Peixe("Truta", 2.53, "Pantanal");
        Cachorro york = new Cachorro("Boris", 2.00, "Yorkshire");
        
        System.out.println("Informações Cachoorro:" +york.getNome() + york.getPeso() + york.getRaça());
        System.out.println("Informações Peixe:"+truta.getNome()+truta.getPeso()+truta.gettipoHabitat());
    }
    
}
