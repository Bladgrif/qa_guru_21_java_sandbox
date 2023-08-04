package house_pets;

public class Cat {
    private final String name;
    private final String colour;
    private final char size;
    private final boolean isClever;

    public Cat(String name, String colour, char size, boolean isClever) {
        this.name = name;
        this.colour = colour;
        this.size = size;
        this.isClever = isClever;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", colour='" + colour + '\'' +
                ", size=" + size +
                ", isClever=" + isClever +
                '}';
    }
}
