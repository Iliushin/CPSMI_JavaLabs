package Nine_Polimorfizm;

public class longTruck extends truck{

    private int length;
    public longTruck(String name, int speed, int weight, int passengers, int maxLoad, int length) {
        super(name, speed, weight, passengers, maxLoad);
    }

    public int getLength() {
        return length;
    }
}
