package main.day9;

public class Rectangle extends Figure{
    private int width;
    private int height;

    public Rectangle(int width, int height,String color) {
        super(color);
        this.width = width;
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public double area() {
        return getHeight()*getWidth();
    }

    @Override
    public double perimetere() {
        return (getWidth()+getHeight())*2;
    }
}
