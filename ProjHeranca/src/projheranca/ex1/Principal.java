/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package projheranca.ex1;

/**
 *
 * @author gabal
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Funcionario gilberto = new Funcionario("234456678", "Gilberto Silva", 1500);
        
        gilberto.getSalario();
        System.out.println(gilberto.getSalario());
        gilberto.setSalario(100);
        System.out.println(gilberto.getSalario());
        gilberto.aumentar_Salario(0.10);
        System.out.println(gilberto.getSalario());
    }
    
}
