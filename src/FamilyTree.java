package src;

import java.util.ArrayList;
import java.util.List;

public class FamilyTree {
    private List<Human> humans = new ArrayList<>();

    public void addHuman(Human human){
        humans.add(human);
    }

    public List<Human> getHumans() {
        return humans;
    }

//    public List<Human> addChildren(Human child){
//        child.getFather();
//        if (father!= null){
//            father.chilld.add(this);
//        }
//    }
    public List<Human> getHumanByName(String name){
        List<Human> res = new ArrayList<>();
        for (Human human: humans){
            if (human.getName().equals(name)){
                res.add(human);
            }
        }
        return res;
    }

}
