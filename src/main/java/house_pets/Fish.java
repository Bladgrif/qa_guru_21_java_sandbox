package house_pets;

public class Fish {
    private final String name;
    private final String colour;
    private final char size;
    private final boolean isClever;

    public Fish(String name, String colour, char size, boolean isClever) {
        this.name = name;
        this.colour = colour;
        this.size = size;
        this.isClever = isClever;
    }

    @Override
    public String toString() {
        return "Fish{" +
                "name='" + name + '\'' +
                ", colour='" + colour + '\'' +
                ", size=" + size +
                ", isClever=" + isClever +
                '}';
    }
}
