package lesha_marshal_java;

public class Lesson7 {
    public static void main(String[] args) {
        System.out.println("изучаем циклы");

        System.out.println("Цикл For");
        for (int i = 0; i < 10; i++) {
            if (i%2==0) {
                System.out.println("Переменная i = " + i +  ", четное число, пропускаем вывод");
                continue;
            }
            System.out.println("Переменная i = " + i);

        }

        System.out.println();

        System.out.println("Цикл While");
        int q = 5;
        while (q > 0) {
            System.out.println("Переменная q = " + q);
            q--;
            if (q==2) {
                System.out.println("Переменная q = 2, произойдет выход");
            }
            if (q==2) break;
        }

        System.out.println();

        System.out.println("Цикл Do-while");
        int w = 6;
        do {
            System.out.println("Переменная w = " + w);
            w--;
        } while (w > 0);
    }
}
