package Learning;
 
class A {
    public A() {
        super();
        System.out.println("A");
    }

   public A(int i) {
        super();
        System.out.println("A - int");
    } 
}

class B extends A {
    public B() {
        super();
        System.out.println("B");
    }

    public B(int i) {
        this();
        System.out.println("B - int");
    }
}


/**
 * inh
 */
public class inh {

    public static void main(String[] args) {
        B b = new B(3);       
    }
}