public class AquaticFreshWater extends AquaticAnimal {
    private boolean sweetWater;

    AquaticFreshWater(String species, String color, int memberNumber, int depth, boolean sweetWater) {
        this.species = species;
        this.color = color;
        this.memberNumber = memberNumber;
        this.depth = depth;
        this.sweetWater = sweetWater;
    }

    public boolean GetSweetWater() {
        return sweetWater;
    }

    public String bites(){
        return "If the " + species +" bites, the bit emark might have leftover teeth in it.";
    }
}
