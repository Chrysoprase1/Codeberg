/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mein
 */
public class Fitbyte {
    private int age;
    private int restingHeartRate;
    
    public Fitbyte (int age, int restingHeartRate) {
        this.age = age;
        this.restingHeartRate = restingHeartRate;
    }
    
    public double maxHeartRate(int age) {
        return 206.3 - (age * 0.711);
    }
    
    public double targetHeartRate (double percentage) {
        double targetHeartRate = (maxHeartRate(age) - 1.0*restingHeartRate)
                * (percentage) + 1.0 * this.restingHeartRate;
        return targetHeartRate;
    }
    
}
