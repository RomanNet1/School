package uchebnikTeoria.transport;

public class Car extends Vehicle{

    private int numOtWheel;

    public Car(int maxSpeed, int numOtWheel) {
        super("land", "road", maxSpeed);
        this.numOtWheel = numOtWheel;
    }

    @Override
    public String toString() {
        return "Car{" + super.toString() +
                "numOtWheel=" + numOtWheel +
                '}';
    }
}
