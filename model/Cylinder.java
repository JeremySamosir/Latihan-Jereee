package model;

public class Cylinder {
    //Make Attr
    private double radius;
    private double height;

    //Constructor
    public Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    //Method to calculate the volume of the cylinder
    public double getVolume() {
        return Math.PI * Math.pow(radius, 2) * height;
    }
}
