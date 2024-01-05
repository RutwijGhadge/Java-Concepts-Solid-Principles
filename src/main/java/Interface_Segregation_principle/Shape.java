package Interface_Segregation_principle;
/*
The Interface Segregation Principle (ISP) is one of the SOLID principles in object-oriented design,
which states that a client should not be forced to depend on interfaces it doesn't use. In other words,
it suggests that you should create specific, smaller,
and more cohesive interfaces rather than having one large interface that encompasses a wide range of methods.
 */


public interface Shape {
    double getArea();
    void draw();
    double getPerimeter();
}
