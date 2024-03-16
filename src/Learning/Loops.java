package Learning;

public class Loops {
    public static void main(String[] args) {
        int i = 0;

        while (i <= 4) {
            System.out.println("Hi" + " " + i);

            int j = 0;
            while (j <= 3) {
                System.out.println("Hello");
                j++;
            }

            i++;
        }
        learnForDoWHILE();
        forLoop();
    }

    static void learnForDoWHILE () {
        int hope = 5;
        do {
            System.out.println("Receive Hope");
        } while (hope < 5);
        }

        static void learnFor () {
            for (int i = 0; i < 5; i++) {
                System.out.println("Receive Hope");
            }
        }

        static void forLoop () {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Day" + " " + i);
                for (int j = 1; j <= 9; j++) {
                    System.out.println("  " + (j + 8) + " - " + (j+9));
                }
            }
        }
    }
