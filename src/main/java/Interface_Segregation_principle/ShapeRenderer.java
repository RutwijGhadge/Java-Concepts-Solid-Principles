package Interface_Segregation_principle;

public class ShapeRenderer {//adhering to ISP principle
    public void Render(Shape shape) {
        shape.draw();
    }
}
/*
scenario, the ShapeRenderer class correctly adheres to the Interface Segregation Principle
because it uses the draw() method from the Shape interface without requiring the implementation of getArea().
This keeps the interface segregated and focused on specific responsibilities.

If the Shape interface had included more methods such as calculatePerimeter() or rotate(),
the ShapeRenderer class would have been forced to implement or depend on those methods, violating the ISP.

By segregating interfaces into smaller and more specific ones like Drawable and Calculable,
for instance, you could avoid forcing classes to implement methods they don't need,
adhering to the Interface Segregation Principle
 */