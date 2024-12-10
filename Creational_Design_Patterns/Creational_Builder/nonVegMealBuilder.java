package Creational_Builder;

public class nonVegMealBuilder implements MealBuilder{
    private Meal meal;
    public nonVegMealBuilder(){
        meal=new Meal();
    }
    @Override
    public void curryBuilder() {
        this.meal.setCurry("chicken curry added.");
    }

    @Override
    public void breadBuilder() {
        this.meal.setBread("added naan bread.");
    }

    @Override
    public void coldDrinkBuilder() {
        this.meal.setColdDrink("Added a sprite");
    }

    @Override
    public void biriyaniBuilder() {
        this.meal.setBiriyani("added a chicken biriyani.");
    }

    @Override
    public Meal build() {
        return meal;
    }
}
