public class Homework2 {

    public static void main(String[] args) {
        int a = 0;
        int b = 20;
        System.out.println(from10To20(a,b));

        int d = 0;
        positiveOrNegative(d);

        int e = -5;
        System.out.println(negativeOrNot(e));

        String f = "I like to study Java";
        int x = 10;
        printSentenceManyTimes(f, x);

        int y = 1992;
        System.out.println(leapYearOrNot(y));

    }

    //задание 1
     public static boolean from10To20( int a1, int a2) {
        return a1 + a2 >= 10 && a1 + a2 <= 20;
     }

     //задание 2
    public static void positiveOrNegative(int a1) {
        if (a1 >= 0) {
            System.out.println("Число положительное");
        } else {
            System.out.println("Число отрицательное");
        }
    }

    //задание 3
    public static boolean negativeOrNot (int a1) {
        return a1 < 0;
    }

    //задание 4
    public static void printSentenceManyTimes (String a1, int n) {
        for (int i = 0; i < n; i++) {
            System.out.println(a1);
        }
    }

    //задание 5
    public static boolean leapYearOrNot(int a1) {
        if (a1 % 4 != 0 || (a1 % 100 == 0 && a1 % 400 != 0)) {
            return false;
        } else {
            return true;
        }
    }


}

