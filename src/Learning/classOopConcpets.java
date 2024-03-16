package Learning;

class Calculator {
    public int add(int num1, int mun2) {
        return num1 + mun2;
    }

    public String getMeAPen (int a) {
        return (a >= 10) ?  "Pen" : "no wya";
    }
}

public class classOopConcpets {
    public static void main(String[] args) {

        int n1 = 23;
        int n2 = 56;
        Calculator calc = new Calculator();

        int get = calc.add(n1, n2);

        System.out.println(get);

        String pen = calc.getMeAPen(3);

        System.out.println(pen);

    }
}
