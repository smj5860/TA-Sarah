public class FindHolyWaterRoom extends LootRoom{

    private HolyWater blessedHolyWater;
    public FindHolyWaterRoom(int x, int y, HolyWater blessedHolyWater){
        super(x,y, blessedHolyWater);
    }

    public String intro_text(){
        return "As you explore, you stumble upon a dusty old cabinet.\nUpon opening it, you find a small vial filled with blessed holy water!\nYou carefully take it, feeling a sense of safety knowing that this may help you defeat the evil within the house.\n";
    }
}

