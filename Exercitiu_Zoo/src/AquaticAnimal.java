public class AquaticAnimal extends Animal {
    protected int depth;

    public AquaticAnimal(String species, String color, int memberNumber, int depth){
        this.species = species;
        this.color = color;
        this.memberNumber = memberNumber;
        this.depth = depth;
    }

    public AquaticAnimal(){
    }

    public String bites(){
        return "Does this thing bite? Tune in to find out!";
    }
}

