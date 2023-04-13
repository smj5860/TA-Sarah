public class DogRoom extends EnemyRoom {

        private final Dog rottweiler;

        public DogRoom(int x, int y, Dog rottweiler) {
                super(x, y, rottweiler);
                this.rottweiler = rottweiler;
        }

        public String intro_text() {
                return "As you step into the room, you hear a growling sound and turn around to face a huge rottweiler. \nIt stares at you with piercing eyes and charges towards you aggressively." +
                        "\nThe rottweiler bites you with its sharp teeth.\n";
        }

        public void modify_player(Player player) {
                if (rottweiler.is_alive()) {
                        player.hp = (short) (player.hp - rottweiler.damage);

                        System.out.printf("The Enemy you are facing does %d Damage. You have %d Health Remaining...", rottweiler.damage, player.hp);


                }
        }
}
