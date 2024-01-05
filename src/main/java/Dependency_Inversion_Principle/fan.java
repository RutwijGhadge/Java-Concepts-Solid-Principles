package Dependency_Inversion_Principle;

public class fan implements Device{
    @Override
    public void turnOn() {
        System.out.println("Fan is On");
    }

    @Override
    public void turnOff() {
        System.out.println("fan is Off");
    }
}
