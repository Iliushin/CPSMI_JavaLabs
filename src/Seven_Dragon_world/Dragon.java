package Seven_Dragon_world;

public class Dragon {
    private  String name;
    private  int tooth;
    private  boolean Canfire;


    public boolean isCanfire() {
        return Canfire;
    }

    public Dragon (String name, int tooth, boolean Canfire){
        this.name = name;
        this.tooth = tooth;
        this.Canfire = Canfire;
    }

    public String getName() {
        return name;
    }

    public int getTooth() {
        return tooth;
    }



}
