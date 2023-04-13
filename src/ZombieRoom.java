public class ZombieRoom extends EnemyRoom {

    Zombie zombie;

    public ZombieRoom(int x, int y, Zombie zombie) {
        super(x, y, zombie);
        this.zombie = zombie;
    }

    public String intro_text() {
        if (zombie.is_alive()) {
            return "As you enter, zombies appear from the shadows, eyes fixed and shuffling towards you.";
        } else {
            return "The corpse of zombies lies on the ground";
        }

    }

    public void modify_player(Player player) {
        if (zombie.is_alive()) {
            player.hp = (short) (player.hp - zombie.damage);
            System.out.printf("The Enemy you are facing does %d Damage. You have %d Health Remaining...", zombie.damage, player.hp);

        }

    }
}