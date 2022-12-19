package src;

public class Human {
    String name;
    String gender;
    Human father;
    Human mother;
//    List<Human> children;



    public Human(String name, String gender, Human father, Human mother) {
        this.name = name;
        this.gender = gender;
        this.father = father;
        this.mother = mother;
//        father.children.add(this);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Human getFather() {
        return father;
    }

    public void setFather(Human father) {
        this.father = father;
    }

    public Human getMother() {
        return mother;
    }

    public void setMother(Human mother) {
        this.mother = mother;
    }

    @Override
    public String toString() {
        String text = "";
        text += "\nName: " + this.name;
        text += ", Gender: " + this.gender;

        if (this.father != null)
            text += ", Father: " + this.father.name;

        if (this.mother != null)
            text += ", Mother: " + this.mother.name;

        return text;    }

}
