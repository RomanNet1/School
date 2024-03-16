package uchebnikTeoria.transport;

public class Vehicle {
    private String type; // среда, в которое передвигается данное транспортное средство
    private String way; //вид транспортной инфраструктуры одно из следующих значений: road, river, sea, air
    private int maxSpeed; // (максимальная скорость транспортного средства

    public Vehicle(String type, String way, int maxSpeed) {
        this.type = type;
        this.way = way;
        if(maxSpeed >=0 && maxSpeed <=700){
            this.maxSpeed = maxSpeed;
        }else {
            this.maxSpeed = 0;
        }

    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "type='" + type + '\'' +
                ", way='" + way + '\'' +
                ", maxSpeed=" + maxSpeed +
                '}';
    }
}
