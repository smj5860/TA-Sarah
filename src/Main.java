public class Main {
    public static void main(String[] args) {

        Weapon w1 = new Weapon("weapon name","weapon description", 10, 50);
        Gold goldBar = new Gold(10);
        Crossbow magicCrossbow = new Crossbow();
        Dagger ironDagger = new Dagger();
        Shotgun sawedoffShotgun = new Shotgun();
        HolyWater blessedWater = new HolyWater();


        Demon greenDemon = new Demon(50);
        Demon redDemon = new Demon(55);
        Zombie slowZombie = new Zombie(10);
        Zombie fastZombie = new Zombie(15);
        Poltergeist mischievousPoltergeist = new Poltergeist(40);
        Ghost hauntingGhost = new Ghost(30);

        Flee flee = new Flee();
        ViewInventory viewinventory = new ViewInventory();
        MoveEast moveeast = new MoveEast();
        MoveNorth movenorth = new MoveNorth();
        MoveSouth movesouth = new MoveSouth();
        MoveWest movewest = new MoveWest();
        Run run = new Run();

        World hauntedHouse = new World();
        hauntedHouse.load_tiles();




    }
}