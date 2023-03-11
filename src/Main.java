import org.w3c.dom.html.HTMLOptGroupElement;

public class Main {
    public static void main(String[] args) {

            Weapon w1 = new Weapon("weapon name","weapon description", 10, 50);
            Gold goldBar = new Gold(10);
            Sword magicSword = new Sword();
            Pillow softPillow = new Pillow();
            Mace bigMace = new Mace();


            Ogre greenOgre = new Ogre(10);
            Ogre redOgre = new Ogre(15);
            Zombie slowZombie = new Zombie(4);
            Zombie fastZombie = new Zombie(8);
            Dog spotDog = new Dog(15);
            Hyenas slyHyenas = new Hyenas(7);

            Flee flee = new Flee();
            ViewInventory viewinventory = new ViewInventory();
            MoveEast moveeast = new MoveEast();
            MoveNorth movenorth = new MoveNorth();
            MoveSouth movesouth = new MoveSouth();
            MoveWest movewest = new MoveWest();
            Run run = new Run();

            World world = new World();
            world.load_tiles();


        }
}
