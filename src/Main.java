package src;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        FamilyTree familyTree = new FamilyTree();
        Human human1 = new Human("Boris", "male", null, null);
        Human human2 = new Human("Anna", "female", null, null);
        Human human3 = new Human("Jane", "female", null, null);
        Human human4 = new Human("Garry", "male", null, null);
        Human human5 = new Human("Andrey", "male", human1, human2);
        Human human6 = new Human("Rakel", "female", human3, human4);
        Human human7 = new Human("Josef", "male", human5, human6);
        familyTree.addHuman(human1);
        familyTree.addHuman(human2);
        familyTree.addHuman(human3);
        familyTree.addHuman(human4);
        familyTree.addHuman(human5);
        familyTree.addHuman(human6);
        familyTree.addHuman(human7);

//        System.out.println(familyTree.getHumans());
        System.out.println(familyTree.getHumanByName("Jane"));

    }


}