package zadanie_1;

public class Car extends Vehicle {
    int doors;
    int windows;

    public Car(String color, int wheels, int tankCapacity, int enginePower, int doors, int windows) {
        super(color, wheels, tankCapacity, enginePower);
        this.doors = doors;
        this.windows = windows;
    }
}
