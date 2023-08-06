package lesha_marshal_java;

public class Lesson9 {
    public static void main(String[] args) {
        Computer apple = new Computer(1000, 2500, "Apple");
        Computer momo = new Computer();

        System.out.println(apple.getName());

        String str1 = "VASA";
        String str2 = "human";
        String str3 = str1 + " - " + str2;
        System.out.println(str3);
        String str5 = "vasa";

        String str4 = str2.substring(0, 3);
        System.out.println(str4.length());
        System.out.println(str4);
        System.out.println(str1.equalsIgnoreCase(str2));
        System.out.println(str1.equalsIgnoreCase(str5));

        System.out.println(str2.toUpperCase());
        String str7 = new String("world");
        String[] str6 = {"Hello", "world", "people"};
        System.out.println(str6[1]);

//        System.out.println(args[0] + " " + args[1]);
    }
}
