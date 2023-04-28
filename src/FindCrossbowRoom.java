public class FindCrossbowRoom extends WeaponRoom{

    private Crossbow magicCrossbow;
    public FindCrossbowRoom(int x, int y, Crossbow magicCrossbow){
        super(x,y, magicCrossbow);
    }

    public String intro_text(){
        return "You spot something glint in the corner, realize it's a crossbow.\nIt looks like it's in great condition, and has some kind of magical aura.\n";
    }
}