package Behavioral_TemplateMethod;

abstract class BeverageMaker{
    abstract void brew();
    abstract void addCondiments();
    private void boilWater(){
        System.out.println("water is boiling.");
    }
    private void pourInCup(){
        System.out.println("pour into a cup.");
    }
    public final void makeBeverage(){
        boilWater();
        brew();
        pourInCup();
        addCondiments();
    }
}

class TeaMaker extends BeverageMaker{
    @Override
    void brew() {
        System.out.println("steeping the tea.");
    }

    @Override
    void addCondiments() {
        System.out.println("adding lemon.");
    }
}
class CoffeeMaker extends BeverageMaker{
    @Override
    void brew() {
        System.out.println("dripping coffee through filter.");
    }

    @Override
    void addCondiments() {
        System.out.println("adding sugar and milk.");
    }
}
public class BeverageSystem {
    public static  void main(String arg[]){
        BeverageMaker LCanteen=new TeaMaker();
        BeverageMaker GodaCanteen=new CoffeeMaker();
        LCanteen.makeBeverage();
        System.out.println("--------------------------------------------");
        GodaCanteen.makeBeverage();
    }
}
