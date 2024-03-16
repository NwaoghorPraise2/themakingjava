package Learning;

public class conditionals {
    public static void main(String[] args) {
//        int x = 10;
//
//        if (x < 5)
//            System.out.println("x is greater than 5");
//        else
//            System.out.println("x is less than 5");

        //ternary operator
        int x = 10;

        int y = (x%2 == 0) ? 10 : 20;

        System.out.println(y);
        switched();
        newSwitched();
        newSwitchedNEW();
        newSwitchedNEW1();
    }

     static void switched () {
        int n = 98;

        switch (n){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
                default:
                System.out.println("Invalid");
        }

    }

    static void newSwitched () {
        int n = 4;
        String result = "";
        switch (n)
        {
            case 1 -> result = "Monday";
            case 2 -> result = "Tuesday";
            case 3 -> result = "Wednesday";
            case 4 -> result = "Thursday";
            case 5 -> result = "Friday";
            case 6 -> result = "Saturday";
            case 7 -> result = "Sunday";
            default -> result = "Invalid";
        }
        System.out.println(result);
    }

    static void newSwitchedNEW () {
        int n = 7;
        String result = "";
        result= switch (n)
        {
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            case 7 -> "Sunday";
            default -> "Invalid";
        };
        System.out.println(result);
    }

    static void newSwitchedNEW1 () {
        int n = 4;
        String result = "";
        result= switch (n)
                {
                    case 1 : yield
                            "Monday";
                    case 2 : yield
                            "Tuesday";
                    case 3 : yield
                            "Wednesday";
                    case 4 :yield  "Thursday";
                    case 5 : yield  "Friday";
                    case 6 : yield  "Saturday";
                    case 7 : yield  "Sunday";
                    default : yield  "Invalid";
                };
        System.out.println(result);
    }
}
