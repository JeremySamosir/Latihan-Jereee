package model;

public class Cone {
    //atriutte of Cone
    private double radius;
    private double height;

    //constructor
    public Cone(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }


    //method to calculate the volume of the cone
    public double getVolume() {
        return Math.PI * Math.pow(radius, 2) * height / 3;
    }
}
