package Dependency_Inversion_Principle;

public class Switch {
    private Device device;

    public Switch(Device device) {
        this.device = device;
    }

    public void turnOn(){
        this.device.turnOn();
    }

    public void turnOff(){
        this.device.turnOff();
    }
}
