package Learning;

class Human {

    //Anytime you create an instance variale, make it private
    private int age;
    private  String name;

    public int getAge () {
        return age;
    }

    public void setAge (int age) {
        this.age = age;
    }

    public String getName () {
        return name;
    }

    public void setName( String name) {
        this.name = name;
    }
}


public class encap {
    public static void main(String[] args) {
    Human obj = new Human();

    obj.setAge(90);
    obj.setName("Praise");
    System.out.println(STR."\{obj.getAge()} \{obj.getName()}");
    }
}
