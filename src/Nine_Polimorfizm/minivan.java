package Nine_Polimorfizm;

public class minivan extends car{


    private int maxDistance;
    public minivan(String name, int speed, int weight, int passengers, int maxDistance) {
        super(name, speed, weight, passengers);
    }
    public int getMaxDistance() {
        return maxDistance;
    }
}
