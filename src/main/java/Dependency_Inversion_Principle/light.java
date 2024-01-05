package Dependency_Inversion_Principle;

public class light implements Device{
    @Override
    public void turnOn() {
        System.out.println("Light is On");
    }

    @Override
    public void turnOff() {
        System.out.println("Light is Off");
    }
}
