package com.arnab;

import java.util.Objects;

public class Car {
    private String name;
    private int plateNo;
    private String color;

    public Car(String name, int plateNo){
        this.plateNo = plateNo;
        this.name = name;
    }
    public Car(String color, String name, int plateNo){
        this(name, plateNo);
        this.color = color;
    }

    @Override
    public String toString(){
        return name + plateNo + color;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return plateNo == car.plateNo && Objects.equals(name, car.name) && Objects.equals(color, car.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, plateNo, color);
    }
}
