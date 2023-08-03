package dogs;

public class Main {
    public static void main(String[] args) {
        Dog pluto = new Dog("Pluto", "black", 'M', true);
        System.out.println(pluto);
        pluto.gav();
        pluto.food("мясо");
        pluto.food("конфета");
    }

}
