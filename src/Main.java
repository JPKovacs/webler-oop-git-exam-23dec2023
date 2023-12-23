public class Main {

    public static void main(String[] args) {
        Animals myAnimal = new Animals();
        Dog myDog = new Dog();
        Cat myCat = new Cat();
        Animals myAnimal2 = new Animals();
        Dog myDog2 = new Dog();
        Cat myCat2 = new Cat();
        myAnimal.makeSound();
        myDog.bark();
        myCat.meow();
        myAnimal2.makeSound();
        myDog2.bark();
        myCat2.meow();
    }

}
