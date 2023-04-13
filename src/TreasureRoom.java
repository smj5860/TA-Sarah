public class TreasureRoom extends LootRoom {

    public TreasureRoom(int x, int y, Gold goldBar) {
        super(x, y, goldBar);
    }

    public String intro_text() {
        if (pickedItem == false)
            return String.format("You have entered a treasure room.\nYour eyes are immediately drawn to the shining gold bar.\n");
        else
            return "";
    }

}