import java.awt.Point;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class World {
    public static String[][] _world;

    static Point Starting_Position = new Point(0,0);
    public static ArrayList<MapTile> history = new ArrayList<>();

    public void load_tiles(){
        List<String> rows = new ArrayList<>();
        try{
            BufferedReader f = new BufferedReader(new FileReader("src/map.txt"));
            String row;
            while ((row = f.readLine()) != null){
                rows.add(row);
            }
            f.close();
            int x_max = rows.get(0).split("\t").length;
            _world = new String[rows.size()][x_max];
            String[] cols;
            String tile_name;
            for (int y = 0; y < rows.size(); y++){
                cols = rows.get(y).split("\t");
                for(int x = 0; x < x_max; x++) {
                    tile_name = cols[x];
                    if (tile_name.equals("StartingRoom")) {
                        Starting_Position.x = y;
                        Starting_Position.y = x;
                    }
                    _world[y][x] = tile_name.equals(" ")?null:tile_name;
                }
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }

    public static MapTile tile_exists(int x, int y){
        MapTile mt = null;
//if statement to determine if the room exists
        if((x >= 0 && x < _world.length) && (y>= 0 && y < _world[0].length) && _world[x][y] != null ){
            switch (_world[x][y]){
                case "StartingRoom":
                    mt = new StartingRoom(x,y);
                    mt = checkRoomExists(mt);
                    break;
                case "TreasureRoom":
                    mt = new TreasureRoom(x,y, new Gold(30));
                    mt = checkRoomExists(mt);
                    break;
                case "DemonRoom":
                    mt = new DemonRoom(x,y,new Demon(10));
                    mt = checkRoomExists(mt);
                    break;
                case "ZombieRoom":
                    mt = new ZombieRoom(x,y,new Zombie(5));
                    mt = checkRoomExists(mt);
                    break;
                case "EmptyHallwayRoom":
                    mt = new EmptyHallwayRoom(x,y);
                    mt = checkRoomExists(mt);
                    break;
                case "PoltergeistRoom":
                    mt = new PoltergeistRoom(x,y,new Poltergeist(8));
                    mt = checkRoomExists(mt);
                    break;
                case "GhostRoom":
                    mt = new GhostRoom(x,y,new Ghost(5));
                    mt = checkRoomExists(mt);
                    break;
                case "PossessedObjectsRoom":
                    mt = new PossessedObjectsRoom(x,y, new PossessedObjects(10));
                    mt = checkRoomExists(mt);
                    break;
                case "LeaveHallwayRoom":
                    mt = new LeaveHallwayRoom(x,y);
                    mt = checkRoomExists(mt);
                    break;
                case "FindHolyWaterRoom":
                    mt = new FindHolyWaterRoom(x,y,new HolyWater());
                    mt = checkRoomExists(mt);
                    break;
                case "FindDaggerRoom":
                    mt = new FindDaggerRoom(x,y,new Dagger());
                    mt = checkRoomExists(mt);
                    break;
                case "FindCrossbowRoom":
                    mt = new FindCrossbowRoom(x,y,new Crossbow());
                    mt = checkRoomExists(mt);
                    break;
                case "FindShotgunRoom":
                    mt = new FindShotgunRoom(x,y,new Shotgun());
                    mt = checkRoomExists(mt);
                    break;
            }
        }
        return mt;
    }

    private static MapTile checkRoomExists(MapTile mt) {
        if(history.indexOf(mt) != -1){
            mt = history.get(history.indexOf(mt));
        }else{
            history.add(mt);
        }
        return mt;
    }
}