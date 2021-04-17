package Nine_Polimorfizm;

// Наследие классов: один главный - транспорт, три наследника truck, plane, car.
// У класса car наследник minivan, у класса minivan - minivanWithDriver


public class ParkingOfTransport {

    public static void main(String[] args) {


        car toyota = new car("Ока", 250, 1200, 4);
        truck man = new truck("Man", 180, 3000, 2, 8000);
        plane boeing = new plane("boeing", 900, 8000, 200, 9000);
        minivan caddy = new minivan("Caddy", 210, 2000, 9, 700);
        minivanWithDriver h1 = new minivanWithDriver("H1", 210, 2000, 9,
                700, 45);
        longTruck Volvo = new longTruck("Volvo", 170, 5000, 2, 15000, 15);

        toyota.Properties();
        man.Properties();
        boeing.Properties();
        caddy.Properties();
        h1.Properties();
        Volvo.Properties();


    }


}
