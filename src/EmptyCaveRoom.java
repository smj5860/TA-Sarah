public class EmptyCaveRoom extends MapTile {
    public EmptyCaveRoom(int x, int y) {
        super(x,y);
    }
    public String intro_text(){
        return "The darkness envelops you.\n You can't see anything but the strange silence." +
                "\nYou wonder what this cave might hold and carefully tread ahead.\n";
    }
    public void modify_player(Player player) {
    }
}