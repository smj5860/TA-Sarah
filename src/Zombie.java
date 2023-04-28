public class Zombie extends Enemy{

    private int attack_speed;
    public Zombie( int attack_speed){

        super("Zombie", 50, 20);
        this.attack_speed = attack_speed;
    }

}
