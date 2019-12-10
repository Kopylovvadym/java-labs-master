package ua.kpi.tef.ti71.lab2;

public class Animal {
    protected String classification;
    protected int limb;
    protected int descendant;

    @Override
    public String toString() {
        return "Lab_2.Animal{" +
                "classification" + classification +
                ", limb=" + limb +
                ", descendant=" + descendant +
                '}';
    }

    public Animal() {
    }

    public Animal(String classification, int limb, int descendant) {
        this.classification = classification;
        this.limb = limb;
        this.descendant = descendant;
    }

    public String getClassification() {
        return classification;
    }

    public void setClassification(String classification) {
        this.classification = classification;
    }

    public int getLimb() {
        return limb;
    }

    public void setLimb(int limb) {
        this.limb = limb;
    }

    public int getDescendant() {
        return descendant;
    }

    public void setDescendant(int descendant) {
        this.descendant = descendant;
    }

}
