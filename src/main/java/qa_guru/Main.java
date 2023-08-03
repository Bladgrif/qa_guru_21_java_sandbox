package qa_guru;

public class Main {
    public static void main(String args[]) {
// 1) поупражняться с математическими и логическими операторами,
        // добиться переполнения при вычислениях,
        // посмотреть результаты (вывести в консоль)

        int a = 64;
        int b = 5;

        //Арифметические операторы
        System.out.println("a + b : " + (a + b));
        System.out.println("a - b : " + (a - b));
        System.out.println("a * b : " + (a * b));
        System.out.println("a / b : " + (a / b));
        System.out.println("a % b : " + (a % b));
        System.out.println("a + b - a / b * a + b :" + (a + b - a / b * a + b));

        //Операторы сравнения
        System.out.println("a == b : " + (a == b));
        System.out.println("a != b : " + (a != b));
        System.out.println("a > b : " + (a > b));
        System.out.println("a >= b : " + (a >= b));
        System.out.println("(a | 5) > 12 || (a = b + 2) > 40 : " + ((a | 5) > 12 || (a = b + 2) > 40));

        // Логические операторы
        boolean isTrue = true;
        boolean isFalse = false;

        System.out.println("isTrue && isFalse : " + (isTrue && isFalse));
        System.out.println("isTrue || isFalse : " + (isTrue || isFalse));
        System.out.println("!isTrue : " + !isTrue);

        //переполнение
        int maxValue = Integer.MAX_VALUE;
        System.out.println("maxValue + 1 : " + (maxValue + 1));

        // 2) попробовать вычисления комбинаций типов данных (int и double)

        int intValue = 5;
        double doubleValue = 5.01;

        System.out.println("intValue + doubleValue : " + (intValue + doubleValue));
        System.out.println("intValue * doubleValue : " + (intValue * doubleValue));
        System.out.println("intValue == doubleValue : " + (intValue == doubleValue));
    }

}