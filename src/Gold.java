public class Gold extends Item{
    int amt;

    public Gold(int amt){
        super("Gold", String.format("A round coin with %s stamped on the front.", (amt)), amt);
        this.amt = amt;
    }
}
