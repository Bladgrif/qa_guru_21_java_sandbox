package lesha_marshal_java;

import java.sql.SQLOutput;

public class Lesson8 {
    public static void main(String[] args) {
        int num1 = 1;
        int num2 = 2;
        int num3 = 3;
        int num4 = 4;
        int num5 = 5;

        int[] numbers = {num1, num2, num3, num4, num5};
        int numbers1[] = {num1, num2, num3, num4, num5};
        int[] numbers2 = new int[4]; //массив из 4 элементов типа int

        for (int i = 0; i < 4; i++) {
            numbers2[i] = i * i;
        }

        numbers2[3] = 999; // перезапишем элемент


        for (int e : numbers2) {
            System.out.println(e);
        }
        System.out.println();

        for (int i = 0; i < 4; i++) {
            System.out.println("Элемент [" + i + "] = " + numbers2[i]);
        }
        System.out.println();

        System.out.println("Сылки на массивы");
        System.out.println(numbers);
        System.out.println(numbers1);
        System.out.println(numbers2);

        System.out.println("Создаем двумерный массив для таблицы умножения");

        int numbers5[][] = new int[9][9];

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                numbers5[i][j] = (i+1)*(j+1);
            }
        }

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.print(numbers5[i][j] + " ");
            }
            System.out.println();
        }

    }
}
