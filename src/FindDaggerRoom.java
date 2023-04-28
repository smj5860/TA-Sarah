public class FindDaggerRoom extends LootRoom{

    private Dagger ironDagger;
    public FindDaggerRoom(int x, int y, Dagger ironDagger){
        super(x,y, ironDagger);
    }

    public String intro_text(){
        return "You spot something on the floor. As you approach, you realize it's a dagger. " +
                "\nYou pick it up, thinking the sharp blade and sturdy handle is made of high quality materials which could definitely come in handy.\n";
    }
}