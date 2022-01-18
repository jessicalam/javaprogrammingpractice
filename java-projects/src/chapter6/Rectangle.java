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
    double getLength() {
        return length;
    }
    double setLength(double length ){
        this.length = length;
    }

    double getWidth() {
        return width;
    }
    double setWidth(double width) {
        this.width = width;
    }

    double calculatePermiter() {
        return ((2*length) + (2*width));
    }
    double calculatedArea() {
        return (length * width);
    }
}
