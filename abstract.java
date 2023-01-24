abstract class Animal {
    public abswtract void animalSound();
    public void sleep() {
        System.out.println("Zzz");
    }
}

class Pig extends Animal {
    public void animalSound(){
        System.out.println("The pig says: wee wee");
    }
}

class Cat extends Animal {
    public void animalSound(){
        System.out.println("The cat says: meow");
    }
}

class Dog extends Animal {
    public void animalSound(){
        System.out.println("The dog says: roof")
    }
}

class Main {
    public static void main(String args[]){
        Pig myPig = new Pig();
        Cat myCat = new Cat();
        Dog myDog = new Dog();
        myPig.animalSound();
        myCat.animalSound();
        myDog.animalSound();
        myPig.sleep();
    }
}