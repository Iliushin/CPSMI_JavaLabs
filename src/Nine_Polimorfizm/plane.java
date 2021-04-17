package Nine_Polimorfizm;

public class plane extends transport {
    private int flightAltitude;


    public plane(String name, int speed, int weight, int passengers, int flightAltitude) {
        super(name, speed, weight, passengers);
    }

    public int getFlightAltitude() {
        return flightAltitude;
    }

    @Override
    public void Properties() {
        System.out.println(getName() + " Едет со скоростью: " + getSpeed() + " км/ч," + " имеет вес: " + getWeight() +
                " кг, " + "Может перевозить " + getPassengers() + " пассажров");
    }
}
