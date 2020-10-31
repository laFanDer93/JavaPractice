package main.day9;

public class Circle extends Figure {
    private double radius;

    public Circle( double radius,String color) {
        super(color);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return (Math.PI*(Math.pow(getRadius(),2)));
    }

    @Override
    public double perimetere() {
        return Math.PI*2*getRadius();
    }
}
