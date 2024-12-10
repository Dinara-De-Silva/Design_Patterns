package Stuctural_Facade;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Client {
    private static int choice;
    public static void main(String[] arg) throws IOException {
        do{
            System.out.println("""
                    ==============Welcome To Mobile Shop===============
                             1. IPHONE
                             2. SAMSUNG
                             3. REDMI
                             4. EXIT
                    Enter your choice: """);
            BufferedReader br =  new BufferedReader(new InputStreamReader(System.in));
            choice=Integer.parseInt(br.readLine());
            ShopKeeper shopKeeper = new ShopKeeper();

            switch (choice){
                case 1:
                    shopKeeper.iphoneSale();
                    break;
                case 2:
                    shopKeeper.samsungSale();
                    break;
                case 3:
                    shopKeeper.redmiSale();
                    break;

            }
        }
        while (choice!=4);

    }
}
