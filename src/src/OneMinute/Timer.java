/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mein
 */
public class Timer {
    private int seconds;
    private int hundredthOfSecond;
    
    public Timer() {
        this.seconds = 0;
        this.hundredthOfSecond = 0;
    }
    
    public int getHundredthOfSecond() {
        return this.hundredthOfSecond;
    }
    
    public int getSeconds() {
        return this.seconds;
    }
    
    public void advance() {
        this.hundredthOfSecond = this.hundredthOfSecond + 1;
        
        if (getHundredthOfSecond() >= 100) {
            this.seconds = this.seconds + 1;
            this.hundredthOfSecond = 0;
        }
        
        if (getSeconds() >= 60) {
            this.seconds = 0;
        }
    }
    
    public String toString() {
        if (getSeconds() < 10) {
            if (getHundredthOfSecond() < 10) {
                return "0" + seconds + ":" + "0" + hundredthOfSecond;
            }
            return "0" + seconds + ":" + hundredthOfSecond;
        }
        return seconds + ":" + hundredthOfSecond;
    }
}
