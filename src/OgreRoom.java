public class OgreRoom extends EnemyRoom {

    Ogre enemy;

    public OgreRoom(int x, int y, Ogre enemy) {
        super(x, y, enemy);
        this.enemy = enemy;
    }

    public String intro_text() {
        if (enemy.is_alive()) {
            return "A Giant Cyclops comes out, the whole ground shivers at its movement as it approaches you!!!";
        } else {
            return "The corpse of a dead Ogre rots on the ground.";
        }
    }

    public void modify_player(Player player) {
            if (enemy.is_alive()) {
                player.hp = (short) (player.hp - enemy.damage);
                System.out.printf("The Enemy you are facing does %d Damage. You have %d Health Remaining...", enemy.damage, player.hp);

            }


            }
        }
