public class AerialAnimal extends Animal{
    protected int flyingHeight;

    public AerialAnimal(String species, String color, int memberNumber, int flyingHeight){
        this.species = species;
        this.color = color;
        this.memberNumber = memberNumber;
        this.flyingHeight = flyingHeight;
    }
    public int getFlyingHeight(){
        return flyingHeight;
    }

    public AerialAnimal(){


    }
}
