package model;

import java.util.ArrayList;
import java.util.List;

public class Pizza {

    private String crust;

    private List<String> garnish;

    private Pizza() {
        this.garnish = new ArrayList<>();
    }

    public String getCrust() {
        return crust;
    }

    public List<String> getGarnish() {
        return garnish;
    }

    @Override
    public String toString() {
        String result = "{";

        result += "\"crust\": \"" + crust + "\",";

        if (garnish != null && !garnish.isEmpty()) {

            result += "\"garnish\": [";

            for (String g : garnish) {
                result += "\"" + g + "\",";
            }

            result = Pizza.removeLastCharacter(result);

            result += "]";
        } else {
            result = Pizza.removeLastCharacter(result);
        }
        result += "}";

        return result;
    }

    private static String removeLastCharacter(String str) {
        str = str.substring(0, str.length() -1);
        return str;
    }

    public static class Builder {

        private String crust;
        private List<String> garnish;

        public Builder() {

        }

        public Builder crust(String crust) {
            this.crust = crust;
            return this;
        }

        public Builder garnish(List<String> garnish) {
            this.garnish = garnish;
            return this;
        }

        public Pizza build() {

            Pizza pizza = new Pizza();

            pizza.crust = this.crust;
            pizza.garnish = this.garnish;

            return pizza;
        }
    }
}
