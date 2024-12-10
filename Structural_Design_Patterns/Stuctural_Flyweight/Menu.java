package Stuctural_Flyweight;

public class Menu {
    public static void main(String[] arg) throws InterruptedException {
        for (int i=0;i<100;i++){
            Player player = BattleField.getRandomPlayer();
            player.assignWeapon(BattleField.getRandomWeapon());
            player.mission();
            Thread.sleep(100);
        }
    }
}
