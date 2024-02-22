//**********************************************************************************************************************
// AnimalHierarchy.java      Author: Hall/ Sherica
//Date: February 22, 2024
//**********************************************************************************************************************
public class AnimalHierarchy {
    {
        public static void main(String[] args) {
        Animal animal = new Animal();
        Bird bird = new Bird();
        Cat cat = new Cat();
        Wolf wolf = new Wolf();

        animal.flee(); // Output: The animal makes a sound
        animal.hunt();

        bird.flee();   // Output: The bird chirps
        bird.hunt();

        cat.flee();    // Output: The cat meows
        cat.hunt();

        wolf.flee();
        wolf.hunt();
    }
    }
}
