package Creational_Builder;

public interface MealBuilder {
    public void curryBuilder();
    public void breadBuilder();
    public void coldDrinkBuilder();
    public void biriyaniBuilder();
    public Meal build();
}
