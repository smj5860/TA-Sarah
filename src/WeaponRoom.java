public class WeaponRoom extends MapTile{
    private Weapon weapon;

    public WeaponRoom(int x, int y, Crossbow magicCrossbow){
        super(x,y);
        this.weapon = magicCrossbow;

    }

    public void modify_player(Player the_player){
        if ((the_player.inventory.contains(weapon))) {
            System.out.println("You've already picked up");
        }else
            the_player.inventory.add(weapon);

        System.out.printf("You hear a faint whisper as you take the %s. You now do %d damage...\n", weapon.getName(), weapon.getDamage());;
    }


}

