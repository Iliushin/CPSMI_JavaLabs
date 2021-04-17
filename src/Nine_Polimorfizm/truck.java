package Nine_Polimorfizm;

public class truck extends transport {
    private int maxLoad;

    public truck(String name, int speed, int weight, int passengers, int maxLoad) {
        super(name, speed, weight, passengers);
    }

    public int getMaxLoad() {
        return maxLoad;
    }
}
