package house_pets;

import java.util.*;

import static house_pets.Food.foodForDog;

public class Main {
    public static void main(String[] args) {
        Dog pluto = new Dog("Pluto", "black", 'M', true);
        Cat mira = new Cat("Mira", "orange", 'S', true);
        Fish nemo = new Fish("Nemo", "black", 'S', false);
        Robot t1000 = new Robot("T1000", "silver", 'L', true);

        pluto.food();
        Food.addNewFood("Конфета");
        System.out.println(foodForDog);




//        System.out.println(pluto);
//        System.out.println(mira);
//        System.out.println(nemo);
//        System.out.println(t1000);
////        pluto.gav();
//        pluto.food("мясо");
//        pluto.food("конфета");


    }
}

//Практика: реализовать 4 класса, использующих разные коллекции внутри.
//        Каждый класс должен использовать один из существующих в Java видов циклов.
//        Реализовать поиск элементов, добавление, удаление в отдельных методах.
