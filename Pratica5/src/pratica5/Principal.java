/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pratica5;

/**
 *
 * @author gabal
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Item it1, it2, it3;
        it1=new Item(100,3,3);
        it2=new Item(101,2,4);
        it3=new Item(102,1,5);
        
        Cliente ana = new Cliente("Ana", 345126, new Data(3,4,3));
        
        Pedido pedido1=new Pedido (1001,  ana, new Data(10,2,3));
        pedido1.adicionaItem(it1);
        pedido1.adicionaItem(it2);
        pedido1.adicionaItem(it3);
        
        ana.imprimir();
        pedido1.imprimirPedido();
        
    }
    
}
