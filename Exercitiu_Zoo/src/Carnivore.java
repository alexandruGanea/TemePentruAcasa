public class Carnivore extends TerrestrialAnimal {
    private boolean eatsMeat;

    public Carnivore(String species, String color, int memberNumber, String move, boolean hunt, boolean eatsMeat) {
        this.species = species;
        this.color = color;
        this.memberNumber = memberNumber;
        this.move = move;
        this.hunt = hunt;
        this.eatsMeat = eatsMeat;
    }

    public boolean GetEatsMeat() {
        return eatsMeat;
    }
}
