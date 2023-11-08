/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package parte1;

/**
 *
 * @author gabal
 */
public class Teste {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Aluno ronald = (Aluno) new Aluno(1456, "Ronald Filadelfo", "Masculino", "2345679-8", "1234567890");
        System.out.println("Informações aluno:" );
        System.out.println(ronald.getNome());
        System.out.println(ronald.getCpf());
        System.out.println(ronald.getRg());
        System.out.println(ronald.getRa());
        System.out.println(ronald.getSexo());
    }
}
    
