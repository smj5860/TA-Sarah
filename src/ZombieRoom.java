public class ZombieRoom extends EnemyRoom {

    Zombie zombie;

    public ZombieRoom(int x, int y, Zombie zombie) {
        super(x, y, zombie);
        this.zombie = zombie;
    }

    public String intro_text() {
        if (zombie.is_alive()) {
            return "As you enter the room, you hear moans and groans coming from the shadows. Suddenly, zombies appear from the shadows, eyes fixed and shuffling towards you.";
        } else {
            return "The room is littered with corpse of zombies";
        }

    }

    public void modify_player(Player player) {
        if (zombie.is_alive()) {
            player.hp = (short) (player.hp - zombie.damage);
            System.out.printf("\nThe zombie lunges towards you, its decaying hands clawing at your flesh. You take %d damage. You have %d health remaining...\n", zombie.damage, player.hp);

        }

    }
}