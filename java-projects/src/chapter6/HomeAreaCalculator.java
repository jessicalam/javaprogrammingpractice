package chapter6;
/* write a class that creates instances of the Rectangle
class to find the total area of two rooms in a house. */

public class HomeAreaCalculator {
    public static void main(String args[]) {
        // Rectangle 1
        //Create instance
        Rectangle room1 = new Rectangle();
        room1.setWidth(25);
        room1.setLength(50);
        double areaOfRoom1 = room1.calculatedArea();

        // Rectangle 2
        //create instance
        Rectangle room2 = new Rectangle(30, 75);
        double areaOfRoom2 = room2.calculatedArea();


        // calculation
        double totalArea = areaOfRoom1 + areaOfRoom2;
        // output/result

        System.out.println("Area of both rooms: " + totalArea);
    }
}
