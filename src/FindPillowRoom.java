public class FindPillowRoom extends LootRoom{

    private Pillow softPillow;
    public FindPillowRoom(int x, int y, Pillow softPillow){
        super(x,y,softPillow);
    }

    public String intro_text(){
        return "You spot something on the floor.\n";
    }
}