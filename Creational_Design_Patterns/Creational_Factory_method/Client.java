package Creational_Factory_method;

abstract class Restaurant {
    public Burger oderBurger(){
        System.out.println("new order");
        Burger burger= createBurger();
        burger.prepare();
        return burger;
    }

    public abstract Burger createBurger() ;

}

class ChickenBurgerRes extends Restaurant{
    @Override
    public Burger createBurger(){
        System.out.println("menna hadanawa");
        return new ChickenBurger();
    }
}

class VeggieBurgerRes extends Restaurant{
    @Override
    public Burger createBurger(){
        System.out.println("tak gala dennam");
        return new VeggieBurger();
    }
}

interface Burger{
    void prepare();
}

class ChickenBurger implements Burger{
    @Override
    public void prepare() {
        System.out.println("chicken burger is being preparing");
    }
}

class VeggieBurger implements Burger{
    @Override
    public void prepare() {
        System.out.println("veggie burger is being preparing");
    }
}

public class Client{
    public static void main(String[] arg){
        Restaurant myRes1 = new ChickenBurgerRes();
        Restaurant myRes2 = new VeggieBurgerRes();

        myRes1.oderBurger();
        System.out.println("hambuna");
        myRes2.oderBurger();
        System.out.println("menna kawa");

        Burger burger= myRes1.createBurger();
        burger.prepare();
    }
}

