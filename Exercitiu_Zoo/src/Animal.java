public class Animal {
    protected String color;
    protected int memberNumber;
    protected String species;

    public Animal(String species, String color, int memberNumber) {
        this.color = color;
        this.memberNumber = memberNumber;
        this.species = species;
    }

    public Animal() {
    }

    public String getColor() {
        return color;
    }
    public String getSpecies(){
        return species;
    }

    public int getMemberNumber() {
        return memberNumber;
    }
    public String bites(){
        return "This animal bites!";
    }
}
