package Learning;

public class Learn_JAVA {
    public static void main(String[] args) {
        //Type Conversion and Casting
        byte b = 127;
        int i = 256;
        //Lossy Conversion
//        b = i;

//        Wideniong the range

        i = b; //Implicit Conversion

//        Casting

        b = (byte) i; //Explicit Conversion

        System.out.println(b);

        float f = 5.6f;
         int x = (int) f;

        System.out.println(x);

//        type promtiom

        byte a = 10;
        byte b1 = 30;

        int c = a * b1; //Type promotion
        System.out.println(c);

//     Assignment Operation

        int d = 10;
        int e = 20;

        int result = d + e;
        System.out.println(result);

        int d1 = 10;
        int e1 = 20;

        int result1 = e1 - d1;
        System.out.println(result1);

        //Increaments

        int f1 = 10;
        f1 += 4;

        System.out.println(f1);

    }
}
