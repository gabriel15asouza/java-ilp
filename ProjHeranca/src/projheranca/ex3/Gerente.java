/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projheranca.ex3;

/**
 *
 * @author gabal
 */
public class Gerente extends Funcionario{
    private int senha;

    public Gerente(String nome, int cpf, double salario, int senha) {
        super(nome, cpf, salario);
        this.senha = senha;
    }
    
    public boolean autentica(int senha){
        return senha==this.senha;
    }

    public int getSenha() {
        return senha;
    }
    public void setSenha(int senha) {
        this.senha = senha;
    }    
}
