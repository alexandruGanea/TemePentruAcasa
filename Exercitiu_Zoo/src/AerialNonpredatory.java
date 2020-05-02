public class AerialNonpredatory extends AerialAnimal {
    private boolean isNonPredatory;

    AerialNonpredatory(String species, String color, int memberNumber, int flyingHeight, boolean isNonPredatory) {
        this.species = species;
        this.color = color;
        this.memberNumber = memberNumber;
        this.flyingHeight = flyingHeight;
        this.isNonPredatory = isNonPredatory;
    }

    public boolean GetIsNonPredatory() {
        return isNonPredatory;
    }

    public String bites() {
        return "The " + species + " is basically a flying chicken.";

    }
}

