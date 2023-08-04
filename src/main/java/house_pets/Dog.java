package house_pets;

public class Dog {

    private final String name;
    private final String colour;
    private final char size;
    private final boolean isClever;

    public Dog(String name, String colour, char size, boolean isClever) {
        this.name = name;
        this.colour = colour;
        this.size = size;
        this.isClever = isClever;
    }

    public void gav() {
        System.out.println(this.name + " громко лает");
    }

    public void food(String food) {
        switch (food) {
            case "мясо": {
                System.out.println (this.name + " аппетитно сьедает и довольно виляет хвостом");
                break;
            }
            case "рыба": {
                System.out.println (this.name + " морщится, но все же сьедает");
                break;
            }
            default: {
                System.out.println (this.name + " подозрительно обнюхивает и осуждающе смотрит на вас");
                break;
            }
        }
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", colour='" + colour + '\'' +
                ", size=" + size +
                ", isClever=" + isClever +
                '}';
    }
}
