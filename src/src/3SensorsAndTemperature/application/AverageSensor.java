/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import java.util.ArrayList;
import java.util.List;

public class AverageSensor implements Sensor {
    private ArrayList<Sensor> list;
    private ArrayList<Integer> readings;
    
    public AverageSensor() {
        this.list = new ArrayList<>();
        this.readings = new ArrayList<>();
    }
    
    public void addSensor (Sensor sensor) {
        this.list.add (sensor);
    }
    
    public boolean isOn() {
        boolean isOn = true;
        for (Sensor sensor : this.list) {
            if (sensor.isOn() == false) {
                isOn = false;
            }
        }
        return isOn;
    }
    
    public void setOn() {
        for (Sensor sensor : this.list) {
            sensor.setOn();
        }
    }
    
    public void setOff() {
        for (Sensor sensor : this.list) {
            sensor.setOff();
        }
    }
    
    public int read() {
        int average = 0;
        
        isOn();
        
        if (this.list.isEmpty() || !isOn()) {
            throw new IllegalStateException ("Sensor not on or empty");
        }
        for (Sensor sensor : this.list) {
            average+= sensor.read();
        }
        this.readings.add (average / this.list.size());
        return average / this.list.size();
    }
    
    public List<Integer> readings() {
        return this.readings;
    }
}
