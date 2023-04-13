public class FindSwordRoom extends WeaponRoom{

    private Sword magicSword;
    public FindSwordRoom(int x, int y, Sword magicSword){
        super(x,y,magicSword);
    }

    public String intro_text(){
        return "You spot something shiny, realize it's a sword.\nIt looks incredibly sharp, imagine how it could slice through your enemies with ease.\n";
    }
}