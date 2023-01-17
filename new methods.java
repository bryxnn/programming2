/* method overloading and overriding
first class is method overloading
public static void main is how to access class A
*/
class A {

    void print(){
        System.out.println("print()");
    }

    void print(String s1){
        System.out.println("print with one input parameter" + s1);
    }

    void print(int i1){
        System.out.println("print wiht one integer value" + i1);
    }

    void print(String s2, int i1){
        System.out.println("");
    }

    void print(String s3, int i3, float f1){
        System.out.println("");
    }



}

class B extends A {

}

public static void main(String args[]){

    A a1 = new A();

    a1.print();

    Object[][] obj;

    String s1 = a1.print(10);

    obj = a1.print("ABCD", 18, 3.3366);

}

public static void main(String args[]){

    B b! = new B();

    b1.print();
    
}