/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coe318.lab6;

import java.util.ArrayList;

/**
 *
 * @author sssaggu
 */

public class Circuit {
    
    ArrayList<Resistor> resistor;
    
    private static Circuit instance =  null;
    
    public static Circuit getInstance(){
        if(instance == null){
        instance = new Circuit();
        }
        return instance;
    }
    private Circuit(){
        this.resistor = new ArrayList<Resistor>();
    }
    
    public void add(Resistor r){
        this.resistor.add(r);
    }
    
    /*
    toString method
    */
    @Override
    public String toString(){
        String circuit = new String();
        
        for(int i=0; i<this.resistor.size(); i++){
            circuit += this.resistor.get(i).toString() + "\n";
        }
        return(circuit);
    }
    
    public static void main(String[] args){
        Circuit c1 = Circuit.getInstance();
        Circuit c2 = Circuit.getInstance();
        Node n1 = new Node();
        Node n2 = new Node();
        Node n3 = new Node();
        Resistor r1 = new Resistor(100,n1,n2);
        Resistor r2 = new Resistor(250,n2,n3);
        c1.add(r1);
        c2.add(r2);
        
        System.out.println(n1.toString() + " " + n2.toString() + " " + n3.toString());
        
        System.out.println("\n" + r1.toString() + "ohm"+ " " + r2.toString() + "ohm");
        
        System.out.println("\n" + c1.toString() + "\n" + c2.toString());
        
        
    }
}