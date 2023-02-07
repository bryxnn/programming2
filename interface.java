//interface
interface Animal {
    public void animalSound(); // interface method(no body)
    public void run(); // interface method (no body)
}
// instead of extends it is implements
class Pig implements Animal {
   
}


// can also extend and implement

public class Main extends Pig implements Animal {
    
}