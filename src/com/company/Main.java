package com.company;


import java.awt.geom.Area;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Cricle cricle = new Cricle();
        System.out.println(cricle + " dung roi");
        System.out.println(" in ra " + cricle.getRadius());
        cricle.setRadius(5);
        System.out.println("check" + cricle.getRadius());
        System.out.println("area " + cricle.Area());

    }
}




