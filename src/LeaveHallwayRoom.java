public class LeaveHallwayRoom extends MapTile {
    public LeaveHallwayRoom(int x, int y) {
        super(x, y);
    }

    public String intro_text(){
        return "You step outside and the cold wind blows against your face, sending shivers down your spine. You have finally escaped the haunted house." ;
    }
    public void modify_player(Player player) {
        player.victory = true;
    }
}