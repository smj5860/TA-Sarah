public class PoltergeistRoom extends EnemyRoom {

    private final Poltergeist mischievousPoltergeist;

    public PoltergeistRoom(int x, int y, Poltergeist mischievousPoltergeist) {
        super(x, y, mischievousPoltergeist);
        this.mischievousPoltergeist = mischievousPoltergeist;
    }

    public String intro_text() {
        return "As you step into the room, a spooky presence looms around you. Suddenly, you hear a faint whisper and the air becomes icy cold.\nThe mischievous Poltergeist is lurking here. " +
                "\nYou try to back away, but the poltergeist moves with unnatural speed and reaches out to touch you, draining your life force with each passing moment.\n";
    }

    public void modify_player(Player player) {
        if (mischievousPoltergeist.is_alive()) {
            player.hp = (short) (player.hp - mischievousPoltergeist.damage);

            System.out.printf("The ghostly apparition you're facing inflicts %d points of damage. Your health is now %d...\n", mischievousPoltergeist.damage, player.hp);


        }
    }
}
