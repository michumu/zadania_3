package zadanie_1;

public class Motorbike extends Vehicle {
    boolean fender;
    boolean frontLight;
    boolean backLight;

    public Motorbike(String color, int wheels, int tankCapacity, int enginePower, boolean fender, boolean frontLight, boolean backLight) {
        super(color, wheels, tankCapacity, enginePower);
        this.fender = fender;
        this.frontLight = frontLight;
        this.backLight = backLight;
    }
}
