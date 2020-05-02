public class Mammal extends TerrestrialAnimal {
    private int maxBreeding;

    public Mammal(String species, String color, int memberNumber,  String move, boolean hunt, int maxBreeding) {
        this.species = species;
        this.color = color;
        this.memberNumber = memberNumber;
        this.move = move;
        this.hunt = hunt;
        this.maxBreeding = maxBreeding;
    }

    public int getMaxBreeding() {
        return maxBreeding;
    }

    public String bites() {
        return "This animal bites if you come near its children!";

    }
}
