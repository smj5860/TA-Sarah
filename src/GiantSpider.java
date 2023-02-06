public class GiantSpider extends Enemy{

    private int poison_level;
    public GiantSpider(int poison_level){

        super("Giant Spider", 10, 2);
        this.poison_level = poison_level;
    }

}
