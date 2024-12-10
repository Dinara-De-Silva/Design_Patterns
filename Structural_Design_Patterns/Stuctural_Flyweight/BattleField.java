package Stuctural_Flyweight;

import java.util.Random;

public class BattleField {
    private static String[] playerType={"Terrorist","Counter Terrorist"};
    private static String[] weaponList={"AK-47","T-56","pistol","gut knife"};

    public static Player getRandomPlayer() throws InterruptedException {
        Random random = new Random();
        int index = random.nextInt(playerType.length);
        return PlayerFactory.getPlayer(playerType[index]);
    }
    public static String getRandomWeapon(){
        Random random=new Random();
        int index = random.nextInt(weaponList.length);
        return weaponList[index];
    }
}
