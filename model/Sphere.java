package model;

public class Sphere {
    //Attributes of Sphere
    private double radius;

    //Constructor
    public Sphere(double radius) {
        this.radius = radius;
    }

    //Method to calculate the volume of the sphere
    public double getVolume() {
        return 4 * Math.PI * Math.pow(radius, 3) / 3;
    }
}
