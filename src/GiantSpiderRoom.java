public class GiantSpiderRoom extends EnemyRoom {

    private GiantSpider enemy;

    public GiantSpiderRoom(int x, int y, GiantSpider enemy) {
        super(x, y, enemy);
        this.enemy = enemy;
    }
    public String intro_text() {
        if (enemy.is_alive()) {
            return "As you enter, you see a giant spider hanging from the ceiling." + "\nThe spider drops to the ground and starts moving towards you.\n";
        } else {
            return "The corpse of the giant spider lies in the center of the room, legs curled up and motionless";
        }
    }
    public void modify_player(Player player) {
        if (enemy.is_alive()) {
            player.hp = (short) (player.hp - enemy.damage);
            System.out.printf("The Enemy you are facing does %d Damage. You have %d Health Remaining...\n", enemy.damage, player.hp);

            }
        }

    }



