public class StartingRoom extends MapTile {

    public StartingRoom(int x, int y) {
        super(x, y);
    }

    public String intro_text() {
        return "You push open a creaky door and step into a dimly lit hallway. The air is heavy with the scent of decay, and you shiver involuntarily as a cold breeze brushes past you. \nYou can see four hallways stretching out before you, each one leading into darkness and uncertainty.\n";
    }

    public void modify_player(Player player) {

    }


}
