import model.Pizza;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String args[]) {

        List<String> garnish = new ArrayList<>();

        garnish.add("Tomato sauce");
        garnish.add("Ham");
        garnish.add("Mozzarella");

        Pizza pizza = new Pizza.Builder()
                .crust("thin")
                .garnish(garnish)
                .build();

        System.out.println(pizza);
    }
}