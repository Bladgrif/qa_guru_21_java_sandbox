package qa_guru;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Human {
    String name;
    int age;
    boolean isCleaver;
    char size;

    public Human() {
    }

    List <Human> friends;

    public Human(String name, int age, boolean isCleaver, char size) {
        this.name = name;
        this.age = age;
        this.isCleaver = isCleaver;
        this.size = size;
    }

    public Human(String name, int age, boolean isCleaver) {
        this.name = name;
        this.age = age;
        this.isCleaver = isCleaver;
        this.size = 'X';
    }

    public void print () {
        System.out.println(this);
    }

    public Human rename (String newName) {
        return new Human(newName, this.age,this.isCleaver,this.size);
    }

    public Human setNewAge (int newAge) {
        return new Human(this.name, newAge,this.isCleaver,this.size);
    }

    public void newFriend (Human friend) {
        System.out.println("Hello my new friend" + " " + friend.name);
    }

    public void addFriends(List<Human> friends) {
        this.friends = friends;
        for (int i = 0; i < this.friends.size(); i++) {
            System.out.print("Friend ");
            this.friends.get(i).print();
        }
        for (Human friend : this.friends) {
            System.out.println("Friend ");
            friend.print();
        }
    }


    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", isCleaver=" + isCleaver +
                ", size=" + size +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Human human = (Human) o;
        return age == human.age && isCleaver == human.isCleaver && size == human.size && Objects.equals(name, human.name) && Objects.equals(friends, human.friends);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, isCleaver, size, friends);
    }
}
