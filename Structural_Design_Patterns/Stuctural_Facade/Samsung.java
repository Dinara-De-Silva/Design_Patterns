package Stuctural_Facade;

public class Samsung implements MobileShop{
    @Override
    public void modelNo() {
        System.out.println("Samsung Galaxy M33");
    }

    @Override
    public void price() {
        System.out.println("Rs.69 000");
    }
}
