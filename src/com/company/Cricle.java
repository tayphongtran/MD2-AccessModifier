package com.company;

import java.awt.geom.Area;

public class Cricle {
    private double radius = 1;
    private final String color = "red";
    private double Area;

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Area;
    }

    public Cricle() {
    }

    public Cricle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }


    public double Area() {
        return this.radius*this.radius * Math.PI;
    }

    @Override
    public String toString() {
        return "Cricle{" +
                "radius=" + radius +
                ", color='" + color + '\'' +
                ", Area =" + Area() +
                '}';
    }


}
