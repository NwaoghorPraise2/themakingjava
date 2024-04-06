package Learning;

/**
 * InnermethodOver
 */
class A { 
    public void m1() {
        System.out.println("In Show");
    }

    public void config(){
        System.out.println("In Config");
    }
    
}

class B extends A {
    public void m1() {
        System.out.println("Show");
    }
}


public class methodOver{
    public static void main(String[] args) {
        A a = new B();
        System.out.println(a.m1());
    }
}
