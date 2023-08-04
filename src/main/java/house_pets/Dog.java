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

//    public void food(String food) {
//        switch (food) {
//            case "мясо": {
//                System.out.println (this.name + " аппетитно сьедает и довольно виляет хвостом");
//                break;
//            }
//            case "рыба": {
//                System.out.println (this.name + " морщится, но все же сьедает");
//                break;
//            }
//            default: {
//                System.out.println (this.name + " подозрительно обнюхивает и осуждающе смотрит на вас");
//                break;
//            }
//        }
//    }

    public void food() {
        String randomFood = Food.dogFood();
        switch (randomFood) {
            case "котлету": {
                System.out.println (this.name +" получает " + randomFood + " и аппетитно сьедает");
                break;
            }
            case "косточку": {
                System.out.println (this.name +" получает " + randomFood + " и начинает грызть");
                break;
            }
            case "сухой собачий корм": {
                System.out.println (this.name +" получает " + randomFood + " и просто ест из миски");
                break;
            }
            case "кусок колбаски": {
                System.out.println (this.name +" получает " + randomFood + " и съедает за секунду");
                break;
            }
            case "сосиску": {
                System.out.println (this.name +" получает " + randomFood + " и делает круг радости, а потом съедает");
                break;
            }
            default:
                System.out.println (this.name +" получает " + randomFood + " и подозрительно обнюхивает, а потом осуждающе смотрит на вас");
                break;

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
