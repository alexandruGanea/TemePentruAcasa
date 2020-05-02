public class Herbivore extends TerrestrialAnimal {
    private boolean eatsPlants;

    public Herbivore(String species,  String color, int memberNumber, String move, boolean hunt, boolean eatsPlants) {
        this.species = species;
        this.color = color;
        this.memberNumber = memberNumber;
        this.move = move;
        this.hunt = hunt;
        this.eatsPlants = eatsPlants;
    }

    public boolean getEatsPlants() {
        return eatsPlants;
    }

    public String bites() {
        return "This animal doesn't bite";
    }
}
