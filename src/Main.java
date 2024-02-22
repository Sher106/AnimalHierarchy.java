//**********************************************************************************************************************
// Main.java      Author: Hall/ Sherica
//Date: February 22, 2024
//**********************************************************************************************************************

public class Main {

    //Start Method
    public static void main(String[] args) {
        //Declaring classes and associated names
        Animal animal = new Animal();
        Bird bird = new Bird();
        Cat cat = new Cat();
        Wolf wolf = new Wolf();

        //Animals Responses being called on
        animal.flee();
        animal.hunt();

        //Birds Responses being called on
        bird.flee();
        bird.hunt();

        //Cats Responses being called on
        cat.flee();
        cat.hunt();

        //Wolf Responses being called on
        wolf.flee();
        wolf.hunt();
    }
}
