// testing push

public abstract class Information {
    public abstract void student();
}

public class firstName extends Information {
    public void student(){
        System.out.println("Bryan");
    }
}

public class lastName extends Information{
    public void student(){
        System.out.println("Mena");
    }
}

public static void main(String args[]){
    firstName myFirstName = new firstName();
    lastName myLastName = new lastName();
    myFirstName.student();
    myLastName.student();
}

abstract class Animal {
    public abstract void animalSound();
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


abstract class studentInfo {
    public abstract void studentFi
}