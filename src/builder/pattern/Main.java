package builder.pattern;

import static builder.pattern.NutritionFacts.*;

/**
 * Created by hotjoyit on 16. 2. 10.
 */
public class Main {
  public static void main(String[] args) {
    Builder builder = new Builder(10,3);
    builder.calories(410);
    builder.fat(22);
    builder.sodium(6);
    NutritionFacts nutritionFacts = builder.build();
  }
}
