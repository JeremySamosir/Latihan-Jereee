package model;

public class Cube {

    private double side;

    //constructor
    public Cube(double side) {
        this.side = side;
    }

    public double getVolume() {
        return Math.pow(side, 3);
    }
}
