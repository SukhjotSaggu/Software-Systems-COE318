/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coe318.lab4;

/**
 *
 * @author Sukhjot Saggu
 */
public class Account {
    String name;
    int number;
    double iniBalance;
    
    public Account(String name, int number,double initialBalance){
        this.name = name;
        this.number = number;
        this.iniBalance = initialBalance;
    }

    String getName(){
        return name;
    }
    double getBalance(){
        return iniBalance;
    }
    int getNumber(){
        return number;
    }
    boolean deposit(double amount){
        if (amount > 0){
            iniBalance = iniBalance + amount;
            return true;
        }
        else{
        return false;
        }
    }
    boolean withdraw(double amount){
        if ((amount > 0) && (amount <= iniBalance)){
            iniBalance = iniBalance - amount;
            return true;
        }
        else{
        return false;
        }
    }
    @Override
    public String toString() {//DO NOT MODIFY
        return "(" + getName() + ", " + getNumber() + ", " + String.format("$%.2f", getBalance()) + ")";
    }
    
}
