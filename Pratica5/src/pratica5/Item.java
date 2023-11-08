/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pratica5;

/**
 *
 * @author gabal
 */
public class Item {
    private int codigo;
    private int quantidade;
    private int preco;
    private int custoItem;

    public Item(int codigo, int quantidade, int preco) {
        this.codigo = codigo;
        this.quantidade = quantidade;
        this.preco = preco;
    }
    
    public void imprimirItem(){
        System.out.println("Código Item: " + codigo);
        System.out.println("Quantidade: "+ quantidade);
        System.out.println("Preço: "+ preco);
    }
    
    public double calcularCustoItem(){
        return this.quantidade*this.preco;
    }
}
