package uchebnikTeoria.transport;

public class Airplane extends Vehicle{
    private int maxHeight;

    public Airplane(int maxSpeed,int maxHeight) {
        super("sky", "air", maxSpeed);
        this.maxHeight = maxHeight;
    }
}
