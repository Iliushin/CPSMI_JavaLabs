package Nine_Polimorfizm;

public class minivanWithDriver extends minivan {

    private int ageOfDriver;

    public minivanWithDriver(String name, int speed, int weight, int passengers, int maxDistance, int ageOfDriver) {
        super(name, speed, weight, passengers, maxDistance);
    }
}
