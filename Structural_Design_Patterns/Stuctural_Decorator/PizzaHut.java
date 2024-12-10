package Stuctural_Decorator;

interface Pizza{
    String bake();
}

class Base_Pizza implements Pizza{

    @Override
    public String bake() {
        return "Base pizza ";
    }
}

class CheeseDecorator implements Pizza{
    private Pizza pizza;
    public CheeseDecorator(Pizza pizza){
        this.pizza=pizza;
    }

    private String addCheese(){
        return " Cheese";
    }
    @Override
    public String bake() {
        return pizza.bake()+addCheese();
    }
}
class ChickenDecorator implements Pizza{
    Pizza pizza;
    public ChickenDecorator(Pizza pizza){
        this.pizza=pizza;
    }

    private String addChicken(){
        return " Chicken";
    }
    @Override
    public String bake() {
        return pizza.bake()+addChicken();
    }
}

public class PizzaHut{
    public static void main(String[] arg){
        Pizza pizza= new ChickenDecorator(new CheeseDecorator(new Base_Pizza()));
        System.out.println(pizza.bake());
    }
}
