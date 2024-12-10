package Stuctural_Facade;

public class Iphone implements MobileShop{
    @Override
    public void modelNo() {
        System.out.println("Iphone 11");
    }

    @Override
    public void price() {
        System.out.println("Rs 350 000");
    }
}
