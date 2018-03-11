import contents.drinkType.DairyD;
import contents.foodItem.DairyF;
import contents.foodItem.Fruit;
import org.junit.jupiter.api.Test;
import java.lang.String;

class FridgeTest {

    @Test
    public void fridgeTest(){

        /* A fun idea would be that the fridge would know the content inside,
        and the consumer will have a recipe and be able to see,
        if they got the necessary products to make it.
        The fridge could compute, how many calories there is in the recipe,
        if all contents needed is in the fridge. */

        Fridge fridge = new Fridge(4, 100, 4);

        DairyF butter = new DairyF("Fatty", 1, 250, 716.8, "7/03/18");

        DairyD cream = new DairyD("Fatty", 1, 0.5, 1815, "28/02/18");

        Fruit apple = new Fruit("Sweet", 6, 1000, 72, "Unknown");

        String[] content = {"butter", "cream", "apple"};

        fridge.setContent(content);

        String product = "apple";

        for (int i = 0; i < content.length; i++){

            product.equals(content[i]);
        }

        int productAmount = 2;

        double calories = apple.getCalories()/productAmount;

    }

}