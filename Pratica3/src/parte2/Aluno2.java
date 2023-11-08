/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parte2;

/**
 *
 * @author gabal
 */
public class Aluno2 {
        private int ra;
    private String nome;
    private String sexo;
    private String rg;
    private String cpf;

    public int getRa() {
        return ra;
    }
    public void setRa(int ra) {
        this.ra = ra;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSexo() {
        return sexo;
    }
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    

    public String getRg() {
        return rg;
    }
    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    private Data dataNasc;

    public Data getDataNasc() {
        return dataNasc;
    }
    public void setDataNasc(Data dataNasc) {
        this.dataNasc = dataNasc;
    }

    public Aluno2(int ra, String nome, String sexo, String rg, String cpf, Data dataNasc) {
        this.ra = ra;
        this.nome = nome;
        this.sexo = sexo;
        this.rg = rg;
        this.cpf = cpf;
        this.dataNasc = dataNasc;
    }
    
    public void imprimir(){
        System.out.println("Informações aluno:");
        System.out.println(this.getNome());
        System.out.println(this.getCpf());
        System.out.println(this.getRg());
        System.out.println(this.getRa());
        System.out.println(this.getSexo());
        System.out.println(this.dataNasc.formatarData());
    }
}
