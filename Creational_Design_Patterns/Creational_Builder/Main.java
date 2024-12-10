package Creational_Builder;

public class Main {
    public static void main(String[] arg) {
        Burger burger = new Burger.BurgerBuilder()
                .egg(true)
                .extraCheese(true)
                .lettuce(false)
                .size("small")
                .build();
        System.out.println(burger.getSize());
        Meal meal= new MealDirector(new VegieMealBuilder()).prepareMeal();
        System.out.println(meal.getBiriyani());
    }
}
