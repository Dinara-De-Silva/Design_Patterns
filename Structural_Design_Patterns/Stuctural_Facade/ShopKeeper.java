package Stuctural_Facade;

public class ShopKeeper {
    private MobileShop iphone;
    private MobileShop samsung;
    private MobileShop redmi;
    public ShopKeeper(){
        iphone = new Iphone();
        samsung = new Samsung();
        redmi = new Redmi();
    }
    public void iphoneSale(){
        iphone.modelNo();
        iphone.price();
    }
    public void samsungSale(){
        samsung.modelNo();
        samsung.price();
    }
    public void redmiSale(){
        redmi.modelNo();
        redmi.price();
    }
}
