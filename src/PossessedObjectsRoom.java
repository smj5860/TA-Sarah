public class PossessedObjectsRoom extends EnemyRoom {

    private PossessedObjects enemy;

    public PossessedObjectsRoom(int x, int y, PossessedObjects enemy) {
        super(x, y, enemy);
        this.enemy = enemy;
    }
    public String intro_text() {
        if (enemy.is_alive()) {
            return "As you enter the room, you notice a strange atmosphere. You feel an eerie presence watching you from the shadows" +
                    "\nAs you move closer, you realize that some of the objects in the room have been possessed by an evil force, and they have come to life to attack you!";
        } else {
            return "You look around the room, and the possessed objects now lay motionless on the ground\n" +
                    "\nYou feel relieved that the danger has passed.\n";
        }
    }
    public void modify_player(Player player) {
        if (enemy.is_alive()) {
            player.hp = (short) (player.hp - enemy.damage);
            System.out.printf("\nThe possessed creature attacks you with %d damage. Your health decreases to %d.\n", enemy.damage, player.hp);

        }
    }

}



