package house_pets;

import java.util.ArrayList;
import java.util.List;

public class Food {
    public static void main(String[] args) {

    }
    public static String dogFood() {

        List<String> foodForDog= new ArrayList<>();
        foodForDog.add("сухой собачий корм");
        foodForDog.add("косточку");
        foodForDog.add("котлету");
        foodForDog.add("кусок колбаски");
        foodForDog.add("сосиску");

        double a = (int) (Math.random() * 5);
        return foodForDog.get((int) Math.floor(a));
    }
}
