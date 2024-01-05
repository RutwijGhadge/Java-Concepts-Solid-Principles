package Liskov_Substitution_Principle;

public class CalculateArea {
    public double getArea(Shape[] shapes){
        double totalArea=0;
        for (Shape shape: shapes)
            totalArea+=shape.getArea();

        return totalArea;
    }
}
