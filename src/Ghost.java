public class Ghost extends Enemy {

    private int fear_level;

    public Ghost(int fear_level){

        super("Ghost", 30, 10);
        this.fear_level = fear_level;
    }
}
