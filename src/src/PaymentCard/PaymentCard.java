/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mein
 */
public class PaymentCard {
    private double balance;
    
    public PaymentCard (double initialBalance) {
        this.balance = initialBalance;
    }
    
    public String toString() {
        return "The card has a balance of " + balance + " euros";
    }
    
    public void eatAffordably() {
        if (balance >= 2.6) {
            balance = balance - 2.6;
        }
    }
    
    public void eatHeartily() {
        if (balance >= 4.6) {
            balance = balance -4.6;
        }
    }
    
    public void addMoney (double add) {
        if (add > 0.0) {
            balance = this.balance + add;
        }
        
        if (balance > 150.0) {
            balance = 150.0;
        }
    }
    
}
