public class Main {
    public static void main(String[] args) {
        // vrem sa creem 2 mamifere, 2 ierbivore, 2 carnivore, 3 animale terestre, 2 animale

        // Creem 2 animale

        Animal animal1 = new Animal("monkey", "black", 2);
        Animal animal2 = new Animal("tiger", "red", 4);

        // Creem 3 animale terestre

        TerrestrialAnimal terrestrialAnimal1 = new TerrestrialAnimal("snake", "green", 0, "crawls", true);
        TerrestrialAnimal terrestrialAnimal2 = new TerrestrialAnimal("elephant", "gray", 4, "moves slowly", false);
        TerrestrialAnimal terrestrialAnimal3 = new TerrestrialAnimal("pantera", "black", 4, "runs fast", true);

        // Creem 2 carnivore

        Carnivore carnivore1 = new Carnivore("Wolf", "grey", 4, "runs in pack", true, true);
        Carnivore carnivore2 = new Carnivore("Lion", "yellow", 4, "runs very fast", true, true);

        //Creem 2 ierbivore

        Herbivore herbivore1 = new Herbivore("deer", "orange", 4, "hops around", false, true);
        Herbivore herbivore2 = new Herbivore("hedgehog", "brown", 4, "tiptoes", false, true);

        // Creem 2 mamifere

        Mammal mammal1 = new Mammal("zebra", "black and white", 4, "runs when chased", false, 1);
        Mammal mammal2 = new Mammal("horse", "brown", 4, "runs pretty fast", false, 1);

        // Creem 2 zburatoare
        AerialPedatory aerialPedatory1 = new AerialPedatory("eagle", "gray", 2, 200, true);
        AerialNonpredatory aerialNonpredatory1 = new AerialNonpredatory("duck", "green", 2, 100, true);

        // Creem 2 acvatice

        AquaticFreshWater aquaticFreshWater1 = new AquaticFreshWater("trout", "red", 0, 20, true);
        AquaticSaltWater aquaticSaltWater = new AquaticSaltWater("tuna", "grey", 0, 50, true);

        // Vrem sa vedem specia mamifer 2
        System.out.println("Specia mamiferului 2 e: " + mammal2.getSpecies());
        // Vrem sa vedem numarul de membre carnivor 1
        System.out.println("Numarul de membre al carnivorului 1 este: " + carnivore1.getMemberNumber());
        // Vrem sa vedem culoare animal terestru 3
        System.out.println("Culoarea animaluli terestru 3 este: " + terrestrialAnimal3.getColor());
        // Vrem sa vedem numar de membre animal 1
        System.out.println("Numarul de membre ale animaluli 1 este: " + animal1.getMemberNumber());
        // Vrem sa vedem specia carnivor 1
        System.out.println("Specia carnivorului 1 este: " + carnivore1.getSpecies());
        // Vrem sa vedem numarul de membre ierbivor 2
        System.out.println("Numarul de membre al ierbivorului 2 este: " + herbivore2.getMemberNumber());
        // Vrem sa vedem culoarea zburtoarei 1
        System.out.println("The color of the " + aerialNonpredatory1.getSpecies() + " is " + aerialNonpredatory1.getColor());
        // Vrem sa vedem daca animalulele zburatoare sunt periculoase
        System.out.println(aerialNonpredatory1.bites());
        System.out.println(aerialPedatory1.bites());
        // Vrem sa vedem ce culoare are tonul si daca musca
        System.out.println("The color of the " + aquaticFreshWater1.getSpecies() + " is " + aquaticFreshWater1.getColor() + ". " + aquaticFreshWater1.bites());
        // Vrem sa vedem daca tonul are picioare si daca e de apa sarata
        System.out.print("The " + aquaticSaltWater.getSpecies() + " has " + aquaticSaltWater.getMemberNumber() + " legs. (um... you do know it's a fish, right..?).");
        if (aquaticSaltWater.getSaltWater()) {
            System.out.println(" It lives in salty waters.");
        }
        // Vrem sa vedem care animal are mai multe picioare
        if (terrestrialAnimal3.getMemberNumber() > terrestrialAnimal1.getMemberNumber()) {
            System.out.println("The " + terrestrialAnimal3.getSpecies() + " has more legs than the " + terrestrialAnimal1.getSpecies() + ". No surprises there.");
        } else {
            System.out.println("The " + terrestrialAnimal3.getSpecies() + " has fewer legs than the " + terrestrialAnimal1.getSpecies() + "?? What is wrong with you, nature?");
        }


    }
}
