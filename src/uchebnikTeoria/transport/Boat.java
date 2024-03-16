package uchebnikTeoria.transport;

public class Boat extends Vehicle{

    public Boat( String way, int maxSpeed) {
        super("water", way, maxSpeed);
    }


    @Override
    public String toString() {
        return "Boat: " + super.toString();
    }
}
