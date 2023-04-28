public class Demon extends Enemy{

    private int curseChance;
    public Demon(int curseChance){

        super("Demon", 60, 25);
        this.curseChance = curseChance;
    }
}
