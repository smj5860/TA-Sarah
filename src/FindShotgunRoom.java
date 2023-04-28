public class FindShotgunRoom extends LootRoom{

    private Shotgun sawedoffShotgun;
    public FindShotgunRoom(int x, int y, Shotgun sawedoffShotgun){
        super(x,y, sawedoffShotgun);
    }

    public String intro_text(){
        return "You spot a sawed-off shotgun on the ground.\nYou pick it up and feel its weight, imagining the damage it could inflict upon your enemies.\n";
    }
}