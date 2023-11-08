/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package projheranca.ex3;

/**
 *
 * @author gabal
 */
public class Empresa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Gerente ivone = new Gerente("Ivone Pereira", 567234890, 10000.0, 12345);
        
        System.out.println("Informações Ivone:" +ivone.getNome() +ivone.getCpf() +ivone.getSalario());
        System.out.println("A senha inserida é " + ivone.autentica(34567));
        System.out.println("A senha inserida é " + ivone.autentica(12345));        
    }
    
}
