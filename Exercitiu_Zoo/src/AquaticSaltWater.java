public class AquaticSaltWater extends AquaticAnimal {
    private boolean saltWater;

    AquaticSaltWater(String species, String color, int memberNumber, int depth, boolean saltWater){
        this.species = species;
        this.color = color;
        this. memberNumber = memberNumber;
        this.depth = depth;
        this.saltWater = saltWater;
    }

    public boolean getSaltWater(){
        return saltWater;
    }

    public String bites(){
        return "If the " + species + " bites, the bite mark might be salty.";
    }
}
