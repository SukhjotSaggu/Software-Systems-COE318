/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coe318.lab6;

/**
 *
 * @author sssaggu
 */

public class Resistor {
    
    public double resistance;
    public Node node1, node2;
    public int resistorIdNum;
    private static int resCount = 1;
    
    public Resistor(double resistance, Node node1, Node node2){
        if(resistance < 0){
            throw new IllegalArgumentException("Resitance value cannot be a negative number");
        }
        
        if(node1 == null || node2 == null){
            throw new IllegalArgumentException("The two nodes do not exsit");
        }
        
        this.resistance = resistance;
        this.node1 = node1;
        this.node2 = node2;
        this.resistorIdNum = resCount;
        resCount++;
    }
    
   
    public Node[] getNodes(){
        Node[] nodes = {node1, node2};
        return nodes;
    }
    
    /*
    toString method
    */
    @Override
    public String toString(){
        return("R"+resistorIdNum + " " + node1 + " " + node2 + " " + resistance);
    }
    
}