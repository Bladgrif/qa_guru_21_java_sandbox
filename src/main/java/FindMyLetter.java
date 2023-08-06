import java.io.IOException;

public class FindMyLetter {
    public static void main(String[] args) throws IOException {
        char c = 'A';
        System.out.println("Угадай букву");

        char c1 = (char) System.in.read();

        String an = (c1 == c)
                ? "Угадал"
                : "Не угадал";
        System.out.println(an);

    }
}
