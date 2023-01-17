/* method overloading and overriding
all the prints are called method overloading
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

}