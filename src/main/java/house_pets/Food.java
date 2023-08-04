package house_pets;

import java.util.ArrayList;
import java.util.List;

public class Food {
    public static List<String> foodForDog = new ArrayList<>();
    public static void main(String[] args) {

    }
    public static String dogFood() {

        foodForDog.add("сухой собачий корм");
        foodForDog.add("косточку");
        foodForDog.add("котлету");
        foodForDog.add("кусок колбаски");
        foodForDog.add("сосиску");

        double a = (int) (Math.random() * 5);
        return foodForDog.get((int) Math.floor(a));
    }

    public static void addNewFood (String newFood) {
        foodForDog.add(newFood);
    }
}
