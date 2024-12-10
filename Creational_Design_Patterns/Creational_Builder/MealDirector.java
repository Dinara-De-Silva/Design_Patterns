package Creational_Builder;

public class MealDirector {
    private MealBuilder mealBuilder;

    public MealDirector(MealBuilder mealBuilder) {
        this.mealBuilder = mealBuilder;
    }
    public Meal prepareMeal(){
        mealBuilder.biriyaniBuilder();
        mealBuilder.breadBuilder();
        mealBuilder.coldDrinkBuilder();
        mealBuilder.curryBuilder();
        return mealBuilder.build();
    }
}
