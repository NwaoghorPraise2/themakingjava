package Learning;

public class Arras {
    public static void main(String[] args) {
        int [] num = {3, 7, 2, 4};

        num [1] = 6;

        System.out.println(num[2]);
        System.out.println(num[1]);

        int [] num1  = new int[3];
        num1[0] = 5;
        num1[1] = 7;
        num1[2] = 6;

        for (int i = 0; i < 3; i++ ) {
            System.out.println(num1[i]);
        }

        //Multi Array

        int [] [] num2 = new int [3][4];


        for (int i =0; i < 3; i++){
            for(int j = 0; j < 4; j++){
                num2[i][j] = (int)(Math.random() * 10);
            }
        }

            for (int i =0; i < 3; i++){
                for(int j = 0; j < 4; j++){
                    System.out.print(num2[i][j] + " ");
                }
                System.out.println();
            }

//            enhaned for loop
            for (int []n : num2) {
                for( int m : n){
                    System.out.print(m + " ");
                }
                System.out.println();
            }

//            Jaggaed array
            int [][] num3 = new int[3][];

            num3[0] = new int[3];
            num3[1] = new int[4];
            num3[2] = new int[7];

            for (int i = 0; i < num3.length; i++) {
                for (int j = 0; j < num3[i].length; j++) {
                   num3[i][j] = (int)(Math.random() *10);
                }
            }

            for (int [] n : num3) {
                for( int m : n) {
                    System.out.print(m + " ");
                }
                System.out.println();
            }



    }
}
