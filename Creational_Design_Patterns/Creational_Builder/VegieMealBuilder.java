package Creational_Builder;

public class VegieMealBuilder implements MealBuilder {
    private Meal vegieMeal ;

    public VegieMealBuilder(){
        vegieMeal=new Meal();
    }
    @Override
    public void curryBuilder() {
        this.vegieMeal.setCurry("dhal curry added");
    }

    @Override
    public void breadBuilder() {
        this.vegieMeal.setBread("added bread");
    }

    @Override
    public void coldDrinkBuilder() {
        this.vegieMeal.setColdDrink("coca-cola");
    }

    @Override
    public void biriyaniBuilder() {
        this.vegieMeal.setBiriyani("vegie biriyani added");
    }

    @Override
    public Meal build() {
        return vegieMeal;
    }
}
