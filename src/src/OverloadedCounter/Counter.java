/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mein
 */
public class Counter {
    private int value;
    
    public Counter (int startValue) {
        this.value = startValue;
    }
    
    public Counter() {
        this (0);
    }
    
    public int value() {
        return this.value;
    }
    
    public void increase() {
        this.value = this.value + 1;
    }
    
    public void increase(int increaseValue) {
        if (increaseValue > 0) {
        this.value = this.value + increaseValue;
        }
    }
    
    public void decrease(int decreaseValue) {
        if (decreaseValue > 0) {
        this.value = this.value - decreaseValue;
        }
    }
    
    public void decrease() {
        this.value = this.value - 1;
    }
    
}
