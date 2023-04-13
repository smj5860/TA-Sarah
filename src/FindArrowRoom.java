public class FindArrowRoom extends LootRoom{

    private Arrow sharpArrow;
    public FindArrowRoom(int x, int y, Arrow sharpArrow){
        super(x,y,sharpArrow);
    }

    public String intro_text(){
        return "You spot something, a bundle of arrows, neatly arranged."+"\n You reach for it and notice that the arrows are finely crafted, with sharp tips, imagining piercing through your enemies with ease.\n";
    }
}