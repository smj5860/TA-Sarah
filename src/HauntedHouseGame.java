import  java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
public class HauntedHouseGame {

    public static void main(String[] args) throws IOException{
        World world = new World();
        world.load_tiles();
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the Haunted House Game!");
        System.out.println("What's your name?");
        String playerName= input.nextLine();
        Player player = new Player(playerName);
//		  //These lines load the starting room and display the text
        MapTile room = World.tile_exists(player.location_x, player.location_y);
        if(room != null)
        {
            System.out.print(room.intro_text());
            while ((player.is_alive()) && (!player.victory)){
                room = World.tile_exists(player.location_x, player.location_y);
                // System.out.print(room.intro_text());
                room.modify_player(player);
//			  // Check again since the room could have changed the player's state
                if ((player.is_alive()) && (!player.victory)){
                    System.out.print("\nChoose an action:\n");
                    ArrayList<Action> available_actions = room.adjacent_actions();
                    for (Action action:available_actions){
                        System.out.print(action.getHotkey() +" : " + action.getName()+"\n");
                    }
                    System.out.println("Action: ");
                    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
                    char action_input = in.readLine().charAt(0);
                    for (Action action:available_actions){
                        if (action_input == action.getHotkey()){
                            player.do_action(action, action.getKwargs(),room);
                            break;
                        }
                    }
                }
                else{
                    System.out.println("\n \t Game Over!!!");
                    player.writeToFile();
                }
            }
        }
    }

}
