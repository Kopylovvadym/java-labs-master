package ua.kpi.tef.ti71.lab2;


@MyAnnotation
public class HomeAnimal extends Animal implements MyInterface {
    private String nick;
    private Animal animal = new Animal();

    public HomeAnimal(String nick, Animal animal) {
        this.nick = nick;
        this.animal = animal;
    }

    public HomeAnimal(String classification, int limb, int descendant, String nick, Animal animal) {
        super(classification, limb, descendant);
        this.nick = nick;
        this.animal = animal;
    }

    @Override
    public String toString() {
        return "Lab_2.HomeAnimal{" +
                "name=" + nick +
                "classification" + classification +
                ", limb=" + limb +
                ", descendant=" + descendant +
                '}';
    }

    public HomeAnimal() {

    }

    public HomeAnimal(String nick) {
        this.nick = nick;
    }


    public Animal getAnimal() {
        System.out.println("Getter: getAnimal");
        return animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }


    public String getNick() {
        System.out.println("Getter: getName");
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }


}
