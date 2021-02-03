/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coe318.lab7;
import java.util.Scanner;
import java.util.ArrayList;

/**
 *
 * @author sssaggu
 */
public class UserMain implements UserInterface{
 String input = "";
 ArrayList<Object> cirElement = new ArrayList<>();
 Scanner userIn = new Scanner(System.in);
 
 @Override
 public void start(){
 display();
 run();
 }
 
 @Override
 public void run(){
    while(true){
            input = userIn.nextLine().trim();
                if(input.equalsIgnoreCase("end")) 
        {
            end();
        break;
        }
        else if(input.equalsIgnoreCase("spice")){
            spice();
        }
        else{
                String[] value = input.split(" ");
                if(value.length != 4)
            {
                System.out.println("Please review the format of your inputs");
            }
            else{
                if(input.toLowerCase().startsWith("v")){
                        double temp;
                        Node n1 = new Node();
                        Node n2 = new Node();
                        n1.nodeIdNum = Integer.parseInt(value[1]);
                        n2.nodeIdNum = Integer.parseInt(value[2]);
                        temp = Double.parseDouble(value[3]);
                        VoltageSource v = new VoltageSource(temp, n1, n2);
                        cirElement.add(v);
                    }
                else if (input.toLowerCase().startsWith("r")){
                    double temp;
                    Node n1 = new Node();
                    Node n2 = new Node();
                    n1.nodeIdNum = Integer.parseInt(value[1]);
                    n2.nodeIdNum = Integer.parseInt(value[2]);
                    temp = Double.parseDouble(value[3]);
                    Resistor r = new Resistor(temp, n1, n2);
                    cirElement.add(r); 
                }
            }
        }

    }
 }
 
 //read the user's input
 public void display(){
    System.out.println("Enter your input:");
 }
 //spice the input
 public void spice(){
    for(Object o : cirElement){
    System.out.println(o);
    }
 }
 //Stop taking inputs from the user and end program
 public void end(){
    System.out.println("All done");
 }
 
 //Main method to start program
 public static void main(String[] args){
    UserMain m = new UserMain();
    m.start();
 }
}