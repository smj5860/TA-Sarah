public class TreasureRoom extends LootRoom {

    public TreasureRoom(int x, int y, Gold goldBar) {
        super(x, y, goldBar);
    }

    public String intro_text() {
        if (pickedItem == false)
            return String.format("As you step into the room, you feel a cold breeze. You look around and see a dusty treasure in the corner.\nYour eyes are immediately drawn to a gleaming gold bar.\n");
        else
            return "";
    }

}