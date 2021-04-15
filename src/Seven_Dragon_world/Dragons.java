package Seven_Dragon_world;

public class Dragons {
    public static void main(String[] args) {
        Dragon Ivan = new Dragon("Иван", 122, true);
        Dragon Chan = new Dragon("Ляо", 32,false);
        Dragon Huan = new Dragon("Хуан", 62, true);


        fire(Ivan, Huan);
        fire(Chan, Huan);
        fire(Ivan, Chan);




    }
    static void fire (Dragon a, Dragon b){
        if (a.isCanfire()) {
            System.out.println(a.getName() + " \"Ударил\" огнём " + b.getName()); }
        else{
            System.out.println(a.getName()+" Не умеет стрелять огнём :с "); }



    }
}
