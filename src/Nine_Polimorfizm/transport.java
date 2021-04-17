package Nine_Polimorfizm;

public class transport {
    private String name;


    private int speed;
    private int weight;
    private int passengers;


    public transport(String name, int speed, int weight, int passengers){
        this.name = name;
        this.speed = speed;
        this.weight = weight;
        this.passengers = passengers;

    }

    public String getName() {
        return name;
    }

    public int getSpeed() {
        return speed;
    }
    public int getWeight() {
        return weight;
    }

    public int getPassengers() {
        return passengers;
    }

    public void Properties(){
        System.out.println(name + " Едет со скоростью: " + speed + " км/ч," + " имеет вес: " + weight +
                " кг, " + "Может перевозить " + passengers + " человек");
    }


}
