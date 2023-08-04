package house_pets;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Dog pluto = new Dog("Pluto", "black", 'M', true);
        Cat mira = new Cat("Mira", "orange", 'S', true);
        Fish nemo = new Fish("Nemo", "black", 'S', false);
        Robot t1000 = new Robot("T1000", "silver", 'L', true);


        System.out.println(pluto);
        System.out.println(mira);
        System.out.println(nemo);
        System.out.println(t1000);
//        pluto.gav();
//        pluto.food("мясо");
//        pluto.food("конфета");

        // значения могут дублироваться
        // имеют порядок, последовательность
        // доступ по индеку мгновено
        // сложно вставлять элементы в середину
        // автоматически увеличивается
        List<String> fruits= new ArrayList<>();
        fruits.add("яблоко");
        fruits.add("груша");
        fruits.add("вишня");
        fruits.add("яблоко");
        System.out.println(fruits);
        System.out.println(fruits.get(1));

        // значения могут дублироваться
        // имеют порядок, последовательность
        // доступ по индеку неудобный
        // легко вставлять элементы в середину
        // автоматически увеличивается
        // не используется
        List<String> fruits2= new LinkedList<>();
        fruits2.add("яблоко");
        fruits2.add("груша");
        fruits2.add("вишня");
        fruits2.add("яблоко");
        System.out.println(fruits2);
        System.out.println(fruits.get(1));

        Set<String> fruits3= new HashSet<>();
        fruits3.add("яблоко");
        fruits3.add("груша");
        fruits3.add("вишня");
        fruits3.add("яблоко");
        System.out.println(fruits3);
//        System.out.println(fruits3.get(1));

        Set<String> fruits4= new LinkedHashSet<>();
        fruits4.add("яблоко");
        fruits4.add("груша");
        fruits4.add("вишня");
        fruits4.add("яблоко");
        System.out.println(fruits4);

    }
}

//Практика: реализовать 4 класса, использующих разные коллекции внутри.
//        Каждый класс должен использовать один из существующих в Java видов циклов.
//        Реализовать поиск элементов, добавление, удаление в отдельных методах.
