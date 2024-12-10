package Stuctural_Flyweight;

import java.util.HashMap;

public class PlayerFactory {
    private static HashMap<String,Player> playerHashMap =
            new HashMap<>();
    public static Player getPlayer(String type) throws InterruptedException {
        Player player = playerHashMap.get(type);
        if (player==null){
            switch (type){
                case "Terrorist":
                    player = new Terrorist();
                    Thread.sleep(1000);
                    System.out.println("Terrorist Created!");
                    break;
                case "Counter Terrorist":
                    player=new CounterTerrorist();
                    Thread.sleep(1000);
                    System.out.println("Counter Terrorist created!");
                    break;
                default:
                    System.out.println("unreachable code!");
            }
            playerHashMap.put(type,player);
            return player;
        }
        else
            return player;
    }
}
