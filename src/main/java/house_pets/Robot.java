package house_pets;

public class Robot {
    private final String name;
    private final String colour;
    private final char size;
    private final boolean isClever;

    public Robot(String name, String colour, char size, boolean isClever) {
        this.name = name;
        this.colour = colour;
        this.size = size;
        this.isClever = isClever;
    }

    @Override
    public String toString() {
        return "Robot{" +
                "name='" + name + '\'' +
                ", colour='" + colour + '\'' +
                ", size=" + size +
                ", isClever=" + isClever +
                '}';
    }
}
