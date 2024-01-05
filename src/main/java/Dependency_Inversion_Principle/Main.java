package Dependency_Inversion_Principle;
/*
The Dependency Inversion Principle (DIP) is a principle of object-oriented design that suggests
high-level modules/classes should not depend on low-level modules/classes directly,
but both should depend on abstractions. Additionally, abstractions should not depend on details;
rather, details should depend on abstractions.
This principle promotes loose coupling between components in a system.
 */

public class Main {
    public static void main(String[] args) {
        fan f=new fan();
        Switch sw=new Switch(f);
        sw.turnOff();
        sw.turnOn();

        light l=new light();
        Switch sh=new Switch(l);
        sh.turnOn();
        sh.turnOff();
    }
}
