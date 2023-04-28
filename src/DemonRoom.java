public class DemonRoom extends EnemyRoom {

    Demon enemy;

    public DemonRoom(int x, int y, Demon enemy) {
        super(x, y, enemy);
        this.enemy = enemy;
    }

    public String intro_text() {
        if (enemy.is_alive()) {
            return "A giant demon comes out, filling the room with its ominous presence!\n";
        } else {
            return "The corpse of a defeated demon on the ground.";
        }
    }

    public void modify_player(Player player) {
        if (enemy.is_alive()) {
            player.hp = (short) (player.hp - enemy.damage);
            System.out.printf("The demon lashes out with its claws, dealing %d damage. You have %d health remaining...\n", enemy.damage, player.hp);

        }


    }
}
