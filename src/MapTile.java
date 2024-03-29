import java.awt.Point;
import java.util.*;
public class MapTile {
    private int x;
    private int y;


    public int getX(){
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY(){
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public MapTile(int x,int y){
        this.x = x;
        this.y = y;

    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + x;
        result = prime * result + y;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        MapTile other = (MapTile) obj;
        if (x != other.x)
            return false;
        if (y != other.y)
            return false;
        return true;
    }
    public ArrayList<Action> adjacent_moves() {
        ArrayList<Action> moves = new ArrayList<>();
        if(World.tile_exists(x,y+1)!=null)
            moves.add(new MoveEast());
        if(World.tile_exists(x+1,y)!=null)
            moves.add(new MoveSouth());
        if(World.tile_exists(x,y-1)!=null)
            moves.add(new MoveWest());
        if(World.tile_exists(x-1,y)!=null)
            moves.add(new MoveNorth());

        return moves;
    }

    public ArrayList<Action> adjacent_actions(){
        ArrayList<Action> actions = new ArrayList<>();
        actions.addAll(adjacent_moves());
        actions.add(new Attack(Method.Attack, "Attack", 'a', null));
        actions.add(new Flee());
        actions.add(new Run());
        actions.add(new ViewInventory());
        return actions;
    }
    public String intro_text() {
        return null;
    }


    public void modify_player(Player player) {
    }
}