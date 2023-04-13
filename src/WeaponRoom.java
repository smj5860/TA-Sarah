public class WeaponRoom extends MapTile{
    private Weapon weapon;

    public WeaponRoom(int x, int y, Sword magicSword){
        super(x,y);
        this.weapon = magicSword;

    }

    public void modify_player(Player the_player){
        if ((the_player.inventory.contains(weapon))) {
            System.out.println("You've already picked up");
        }else
            the_player.inventory.add(weapon);

        System.out.printf("You receive %s. You now do %d damage...", weapon.getName(), weapon.getDamage());;
    }


}

