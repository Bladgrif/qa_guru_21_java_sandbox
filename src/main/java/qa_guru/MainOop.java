package qa_guru;

import java.util.List;

public class MainOop {

    public static void main(String[] args) {
        Human dima = new Human("Dima", 35, true, 'M');
        Human valera = new Human("Valera", 29, false, 'S');
        Human maria = new Human("Maria", 25, true, 'S');
        Human valentin = new Human();


        dima.print();
        valera.print();
        valentin.print();
        Human dimitry = dima.rename("Dimitry");
        dima.print();
        dimitry.print();
        dima = dima.setNewAge(36);
        dima.print();
        dima.newFriend(dimitry);

//        Human[] friends = new Human[2];
//        Human[] friends = new Human[] {dimitry, maria};
//        friends[0] = dimitry;
//        friends[1] = maria;

        List<Human> friends = List.of(dimitry, maria);

        dima.addFriends(friends);

    }
}
