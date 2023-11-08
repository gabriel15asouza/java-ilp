/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pratica5;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author gabal
 */
public class Pedido {
    private int numero;
    private Cliente cliente;
    private Data data;
    private List<Item> lista;
    

    public Pedido(int numero, Cliente cliente, Data data) {
        this.numero = numero;
        this.cliente = cliente;
        this.data = data;
        lista = new ArrayList<Item>();
    }
    
    public void adicionaItem (Item item){
        lista.add(item);
    }
    
    public double calcularTotal(){
        double total = 0;
        for (int i=0;i<lista.size();i++){
            Item umItem = lista.get(i);
            total+= umItem.calcularCustoItem();
        }
        return total;
    }
    
    public void imprimirPedido(){
        System.out.println("Pedido: "+numero);
        System.out.println("Cliente: "+cliente);
        
        System.out.println();
        for (int i=0;i<lista.size();i++){
            Item umItem = lista.get(i);
            System.out.println("*");
            umItem.imprimirItem();
        }
        System.out.println("Total do pedido: "+calcularTotal());
    }
}
