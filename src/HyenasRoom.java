public class HyenasRoom extends EnemyRoom {

    Hyenas slyhyenas;

    public HyenasRoom(int x, int y, Hyenas slyhyenas) {
        super(x, y, slyhyenas);
        this.slyhyenas = slyhyenas;
    }

    public String intro_text() {
        if (slyhyenas.is_alive()) {
            return "As you enter, the distant howls of hyenas reach your ears." + "\n A pack of snarling hyenas with sharp teeth enter the room";
        } else {
            return "The corpse of Hyenas litter the ground";
        }

    }
}
