public class LeaveCaveRoom extends MapTile {
    public LeaveCaveRoom(int x, int y) {
        super(x, y);
    }

    public String intro_text(){
        return "You've finally reached the exit of the cave and can see the bright sunlight shining." ;
    }
    public void modify_player(Player player) {
        player.victory = true;
    }
}