package chapter6;

public class Rectangle {
    double length;
    double width;

    public Rectangle () {
        // contructors are supposed to set the variables.
        length = 0;
        width = 0;
    }
    public Rectangle(double length,double width) {
        setLength(length);   // can be set this way or with this.length = length;
        setWidth(width);
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length ){
        this.length = length;
    }

    public double getWidth() {
        return width;
    }
    public void setWidth(double width) {
        this.width = width;
    }

    public double calculatePerimeter() {
        return ((2*length) + (2*width));
    }
    public double calculatedArea() {
        return (length * width);
    }
}
