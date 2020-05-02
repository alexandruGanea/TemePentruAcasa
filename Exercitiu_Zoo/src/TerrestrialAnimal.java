public class TerrestrialAnimal extends Animal {

    protected String move;
    protected boolean hunt;

    public TerrestrialAnimal(String species, String color, int memberNumber, String move, boolean hunt) {
        this.species = species;
        this.color = color;
        this.memberNumber = memberNumber;
        this.move = move;
        this.hunt = hunt;
    }

    public String getMove() {
        return move;
    }

    public boolean getHunt() {
        return hunt;
    }

    public TerrestrialAnimal() {
    }

    public String bites() {
        return "This animal bites on land!";
    }


}
