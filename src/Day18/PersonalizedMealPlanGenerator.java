package Day18;
interface MealPlan{
    String getDescription();
}
class VegetarianMeal implements MealPlan{
    public String getDescription(){
        return "This is Vegetarian meal plan";
    }
}
class VeganMeal implements MealPlan{
    public String getDescription(){
        return "This is Vegan meal plan";
    }
}
class KetoMeal implements MealPlan{
    public String getDescription(){
        return "This is Keto meal plan";
    }
}
class HighProteinMeal implements MealPlan{
    public String getDescription(){
        return "This is High Protein meal plan";
    }
}
class Meal<T extends MealPlan>{
    private T mealPlan;
    public Meal(T mealPlan){
        this.mealPlan = mealPlan;
    }
    public T getMealPlan(){
        return mealPlan;
    }
    public String toString() {
        return mealPlan.getDescription();
    }
}
class MealPlanGenerator {
    public static <T extends MealPlan> Meal<T> generateMealPlan(T mealPlan) {
        if (mealPlan == null) {
            throw new IllegalArgumentException("Meal plan cannot be null");
        }
        return new Meal<>(mealPlan);
    }
}

public class PersonalizedMealPlanGenerator {
    public static void main(String[] args) {
        VegetarianMeal vegetarianMeal = new VegetarianMeal();
        VeganMeal veganMeal = new VeganMeal();
        KetoMeal ketoMeal = new KetoMeal();
        HighProteinMeal highProteinMeal = new HighProteinMeal();
        Meal<VegetarianMeal> vegetarianMealPlan = MealPlanGenerator.generateMealPlan(vegetarianMeal);
        Meal<VeganMeal> veganMealPlan = MealPlanGenerator.generateMealPlan(veganMeal);
        Meal<KetoMeal> ketoMealPlan = MealPlanGenerator.generateMealPlan(ketoMeal);
        Meal<HighProteinMeal> highProteinMealPlan = MealPlanGenerator.generateMealPlan(highProteinMeal);
        System.out.println(vegetarianMealPlan);
        System.out.println(veganMealPlan);
        System.out.println(ketoMealPlan);
        System.out.println(highProteinMealPlan);
    }
}
