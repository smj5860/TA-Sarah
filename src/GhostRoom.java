public class GhostRoom extends EnemyRoom {

    Ghost hauntingGhost;

    public GhostRoom(int x, int y, Ghost hauntingGhost) {
        super(x, y, hauntingGhost);
        this.hauntingGhost = hauntingGhost;
    }

    public String intro_text() {
        if (hauntingGhost.is_alive()) {
            return "As you enter, the temperature drops suddenly and a cold chill runs down your spine. You notice a faint outline of a ghostly figure. \nThe ghostly figure solidifies into a terrifying specter, its hollow eyes staring directly at you.\n";
        } else {
            return "The room is silent except for the creaking of old wooden floorboards. You see the remains of furniture covered in thick layers of dust and cobwebs.";
        }

    }
}
