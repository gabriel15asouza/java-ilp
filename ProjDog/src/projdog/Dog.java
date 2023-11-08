/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projdog;

/**
 *
 * @author gabal
 */
public class Dog {
    private String nome;
    private int peso;
    
    public String getNome(){
        return nome;
    }
    
    public int getPeso(){
        return peso;
    }
    
    public void setNome(String nome){
        this.nome=nome;
    }
    
    public void setPeso(int peso){
        this.peso=peso;
    }
    
    void latir(){
        if(peso>=9)
            System.out.println("AUUUUU!\n");
        else if(peso<9)
            System.out.println("AU!\n");                
    }
}
