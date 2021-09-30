package com.example.encapsulation;

public class Car {
    private String chassisNumber;

    private String plate;

    private int color;

    public Car(String chassisNumber, int color) {
        this.chassisNumber = chassisNumber;
        this.plate = null;
        this.color = color;
    }

    //read-only value
    public String getChassisNumber() {
        return this.chassisNumber;
    }

    //write-only value
    public void setPlate(String plate) {
        if (this.plate == null){
            this.plate = plate;
        }
    }

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }
}
