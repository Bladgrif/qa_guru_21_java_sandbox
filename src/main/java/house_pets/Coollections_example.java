package house_pets;

import java.util.*;

public class Coollections_example {
    public static void main(String[] args) {
        // значения могут дублироваться
        // имеют порядок, последовательность
        // доступ по индеку мгновено
        // сложно вставлять элементы в середину
        // автоматически увеличивается

        System.out.println("Коллекция: ArrayList");
        List<String> fruits= new ArrayList<>();
        fruits.add("яблоко");
        fruits.add("груша");
        fruits.add("вишня");
        fruits.add("яблоко");
        System.out.println(fruits);
        System.out.println(fruits.get(1));
        System.out.println();

        // значения могут дублироваться
        // имеют порядок, последовательность
        // доступ по индеку неудобный
        // легко вставлять элементы в середину
        // автоматически увеличивается
        // не используется
        System.out.println("Коллекция: LinkedList");
        List<String> fruits2= new LinkedList<>();
        fruits2.add("яблоко");
        fruits2.add("груша");
        fruits2.add("вишня");
        fruits2.add("яблоко");
        System.out.println(fruits2);
        System.out.println(fruits.get(1));
        System.out.println();

        // значения не могут дублироваться
        // не имеют порядок, последовательность произвольная
        // не сохраняет порядок добавления
        // самый быстрый их Set
        System.out.println("Коллекция: HashSet");
        Set<String> fruits3= new HashSet<>();
        fruits3.add("яблоко");
        fruits3.add("груша");
        fruits3.add("вишня");
        fruits3.add("яблоко");
        System.out.println(fruits3);
        System.out.println();

        // значения не могут дублироваться
        // не имеют порядок, последовательность произвольная
        // сохраняет порядок добавления
        // чуть медлеене чет HashSet
        System.out.println("Коллекция: LinkedHashSet");
        Set<String> fruits4= new LinkedHashSet<>();
        fruits4.add("яблоко");
        fruits4.add("груша");
        fruits4.add("вишня");
        fruits4.add("яблоко");
        System.out.println(fruits4);
        System.out.println();

        // позволяет легко сортировать эелементы. в алфавитном порядке автоматически
        // добавление нового элемента происходит медленее
        System.out.println("Коллекция: TreeSet");
        Set<String> fruits5= new TreeSet<>();
        fruits5.add("яблоко");
        fruits5.add("груша");
        fruits5.add("вишня");
        fruits5.add("яблоко");
        System.out.println(fruits5);
        System.out.println();

        // порядок добавления не сохраняется
        // если элемент с ключем уже есть, то его значение перезапишется
        System.out.println("Коллекция: HashMap");
        Map<String, Integer> fruits6 = new HashMap<>();
        fruits6.put("яблоко",0);
        fruits6.put("груша",1);
        fruits6.put("вишня",2);
        fruits6.putIfAbsent("яблоко",3); // добавляет элемент только если нет в коллекции
        System.out.println(fruits6);
        System.out.println();

        // сохраняется порядок
        System.out.println("Коллекция: LinkedHashMap");
        Map<String, Integer> fruits7 = new LinkedHashMap<>();
        fruits7.put("яблоко",0);
        fruits7.put("груша",1);
        fruits7.put("вишня",2);
        fruits7.putIfAbsent("яблоко",3); // добавляет элемент только если нет в коллекции
        System.out.println(fruits7);
        System.out.println();

        // сохраняет в алфавитном порядке
        System.out.println("Коллекция: TreeMap");
        Map<String, Integer> fruits8 = new TreeMap<>();
        fruits8.put("яблоко",0);
        fruits8.put("груша",1);
        fruits8.put("вишня",2);
        fruits8.putIfAbsent("яблоко",3); // добавляет элемент только если нет в коллекции
        System.out.println(fruits8);
        System.out.println();


    }
}
