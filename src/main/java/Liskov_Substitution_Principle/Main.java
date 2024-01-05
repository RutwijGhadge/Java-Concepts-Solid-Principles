package Liskov_Substitution_Principle;

public class Main {
    public static void main(String[] args) {
        Shape[]shapes={
                new Rectangle(8,4),
                new Square(5)
        };
        CalculateArea calculateArea=new CalculateArea();
        double area=calculateArea.getArea(shapes);
        System.out.println("Total Area:"+ area);
    }
}
/*
This example demonstrates the Liskov Substitution Principle,
as Rectangle and Square objects are used interchangeably
with Shape objects in the AreaCalculator without affecting the correctness of the program.
This principle allows for flexibility in the design of classes and promotes code reusability and maintainability.
 */