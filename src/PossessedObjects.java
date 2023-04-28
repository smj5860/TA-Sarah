public class PossessedObjects extends Enemy{

    private int possession_level;
    public PossessedObjects(int possession_level){

        super("Possessed Objects", 20, 10);
        this.possession_level = possession_level;
    }

}
