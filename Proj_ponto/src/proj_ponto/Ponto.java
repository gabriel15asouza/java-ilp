/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proj_ponto;

/**
 *
 * @author gabal
 */
public class Ponto {

    public int x;
    public int y;

    public Ponto(int x, int y) {
        this.x = x;
        this.y = y;
    }
    
    public double calculoDistancia  (Ponto p1, Ponto p2){
        
        float axisX = p2.x - p1.x;
        float axisY = p2.y - p1.y;

        double sum = Math.pow(axisX, 2) + Math.pow(axisY, 2);
        
        return Math.sqrt(sum);
    }
}

