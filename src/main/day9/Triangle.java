package main.day9;

public class Triangle extends Figure{
    private int firstSide;
    private int secondSide;
    private int thirdSide;

    public Triangle( int firstSide, int secondSide, int thirdSide, String color) {
        super(color);
        this.firstSide = firstSide;
        this.secondSide = secondSide;
        this.thirdSide = thirdSide;
    }

    public int getFirstSide() {
        return firstSide;
    }

    public void setFirstSide(int firstSide) {
        this.firstSide = firstSide;
    }

    public int getSecondSide() {
        return secondSide;
    }

    public void setSecondSide(int secondSide) {
        this.secondSide = secondSide;
    }

    public int getThirdSide() {
        return thirdSide;
    }

    public void setThirdSide(int thirdSide) {
        this.thirdSide = thirdSide;
    }

    @Override
    public double area() {
        return (Math.sqrt((perimetere()/2)
                *((perimetere()/2)-firstSide)
                *((perimetere()/2)-secondSide)
                *((perimetere()/2)-thirdSide)
        ));
    }

    @Override
    public double perimetere() {
        return firstSide+secondSide+thirdSide;
    }
}
