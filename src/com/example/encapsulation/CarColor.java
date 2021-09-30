package com.example.encapsulation;

public enum CarColor {
    WHITE   (1),
    RED     (2),
    BLUE    (3),
    BLACK   (4)
    ;

    public int value;

    CarColor(int colorValue) {
        this.value = colorValue;
    }
}
