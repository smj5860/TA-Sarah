public class FindPillowRoom extends LootRoom{

    private Pillow softPillow;
    public FindPillowRoom(int x, int y, Pillow softPillow){
        super(x,y,softPillow);
    }

    public String intro_text(){
        return "You spot something soft on the floor. As you approach, you realize it's a pillow. " +
                "You pick it up, thinking it could come in handy during your adventure.\n";
    }
}