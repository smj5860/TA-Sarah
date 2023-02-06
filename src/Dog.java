public class Dog extends Enemy{

    private int aggression_level;

    public Dog(int aggression_level){

        super("Dog", 20, 15);
        this.aggression_level = aggression_level;
    }

}
