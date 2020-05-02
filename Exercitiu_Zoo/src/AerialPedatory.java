public class AerialPedatory extends AerialAnimal {
    private boolean isPredatory;

    public AerialPedatory(String species, String color, int memberNumber, int flyingHeight, boolean isPredatory) {
        this.species = species;
        this.color = color;
        this.memberNumber = memberNumber;
        this.flyingHeight = flyingHeight;
        this.isPredatory = isPredatory;
    }

    public boolean getIsPredatory() {
        return isPredatory;

    }

    public String bites(){
        return "The " + species + " is a flying killing machine.";
    }
}