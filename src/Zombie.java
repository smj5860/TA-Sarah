public class Zombie extends Enemy{

    private int attack_speed;
    public Zombie( int attack_speed){

        super("Zombie", 20, 15);
        this.attack_speed = attack_speed;
    }

}
