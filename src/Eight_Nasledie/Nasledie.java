package Eight_Nasledie;

// Знакомство с интерфейсами. Создано два интерфейса Interface1 и Interface2,
// и три наследника базового класса. Разным классам определили разные интерфейсы
// В итоге создано по одному экземпляру каждого класса


public class Nasledie {
    public static void main(String[] args) {

        Naslednik1 pepe = new Naslednik1() {
            @Override
            public String getProperties() {
                return "В первом наследнике бывают разыне экземпляры, этот средний";
            }
        };
        Naslednik2 dodo = new Naslednik2() {
            @Override
            public String getName() {
                return "F.J.Fry";
            }
        };

        Naslednik3 koko = new Naslednik3();



      /*
        Реализация общего метода для всех классов
        pepe.numb(1);
        System.out.println();
        dodo.numb(2);
        System.out.println();
        koko.numb(3); */
        System.out.println();
        System.out.println(pepe.getName());
        System.out.println(pepe.getProperties());
        System.out.println();
        System.out.println(dodo.getName());
        System.out.println(dodo.getProperties());
        System.out.println();
        System.out.println(koko.getName());
        System.out.println(koko.getProperties());




    }
}
