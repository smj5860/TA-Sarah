public class FindMaceRoom extends LootRoom{

    private Mace BigMace;
    public FindMaceRoom(int x, int y, Mace BigMace){
        super(x,y,BigMace);
    }

    public String intro_text(){
        return "You see something that is sturdy and heavy, with a spiked ball that looks lethal.\nYou feel its weight, imagining the damage it could inflict upon your enemies.\n";
    }
}