public class EmptyHallwayRoom extends MapTile {
    public EmptyHallwayRoom(int x, int y) {
        super(x,y);
    }
    public String intro_text(){
        return "You find yourself in a dimly lit hallway..\nThe air is damp and musty, and the walls are covered in thick layer of dust.." +
                "\nYou can hear strange noises coming from the shadow so you are looking for a way out.\n";
    }
    public void modify_player(Player player) {
    }
}