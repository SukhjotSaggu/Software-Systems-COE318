/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coe318.lab7;

/**
 *
 * @author sssaggu
 */
public class VoltageSource {
 
 private double voltage;
 private Node node1;
 private Node node2;
 private int idNode;
 private static int counter = 1;
 
 public VoltageSource (double v, Node n1, Node n2){
     if (v < 0){
        this.node1 = n2;
        this.node2 = n1;
        this.voltage = -v;
     }
     
     else {
        this.node1 = n1;
        this.node2 = n2;
        this.voltage = v;
     }

    this.idNode = counter;
    counter ++; 
 }
  //returns the node from array
 public Node[] getNodes(){
    Node[] nodes = new Node[2];
    nodes[0] = this.node1;
    nodes[1] = this.node2;
    return nodes;
 }
 
 //converts vraiable information into string to be displayed by system.out.println
 @Override
 public String toString()
 {
 return "V" + this.idNode + " " + this.node1 + " " + this.node2 + " DC " + this.voltage +".";
 } 
}

