package model;

public class Pyramid {
    //Attributes of Pyramid
    private double baseLength;
    private double baseWidth;
    private double height;

    //Constructor
    public Pyramid(double baseLength, double baseWidth, double height) {
        this.baseLength = baseLength;
        this.baseWidth = baseWidth;
        this.height = height;
    }

    //Method to calculate the volume of the pyramid
    public double getVolume() {
        return baseLength * baseWidth * height / 3;
    }
}
