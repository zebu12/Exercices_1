import java.text.NumberFormat;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        /**
         * Variable Declaration and Initialization
         */
        int age = 20;
        float weight = 1.5f;
        char gender = 'M';
        boolean driverLicence = true;

        /**
         * Data Range Practice
         */
        byte bx = 3;
        byte cx = 5;
        System.out.println(Math.max(bx, cx));

        short x = 10;
        short y = 20;
        System.out.println(Math.min(x, y));

        /**
         * Working with Dates
         */
        Date now = new Date();
       System.out.println(now);
        System.out.println(now.getTime());

        /**
         * String Manipulation
         */
        String name = new String("Jean-Pierre Salum");
        System.out.println(name.toLowerCase()); // LoweCase
        System.out.println(name.toUpperCase()); // upperCase

        if (name == "Java") {
            System.out.println("The string contains the word Java");
        } else {
            System.out.println("The string is not contains the word Java");
        }


        String regex = "[,\\s\\.]";

        // using split() method
        String[] arr = name.split(regex);

        // Print each element of the resulting array
        for (String s1 : arr) {
            System.out.println(s1);
        }



    /**
     * Escape Sequences
     */
    String st = new String("This string is includ a\ttab and a \nnew line and \"quotation\" marks ");
    System.out.println(st);

        /**
         * Array Creation
         */

        int [] array = new int [5];
        array[0] = 1;
        array[1] = 2;
        array[2] = 3;
        array[3] = 4;
        array[4] = 5;
        System.out.println(Arrays.toString(array));
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            sum += array[i];

        }
        System.out.println(sum);

        /**
         * Multi-Dimensional Arrays
         */

        int[][][] myNumbers = new int[3][4][3];

        myNumbers[0][0][0] = 1;
        myNumbers[0][1][0] = 1;
        myNumbers[0][2][0] = 1;
        myNumbers[0][3][0] = 1;
        myNumbers[1][0][0] = 2;
        myNumbers[1][1][0] = 2;
        myNumbers[1][2][0] = 2;
        myNumbers[1][3][0] = 2;
        myNumbers[2][0][0] = 3;
        myNumbers[2][1][0] = 3;
        myNumbers[2][2][0] = 3;
        myNumbers[2][3][0] = 3;
        myNumbers[0][0][1] = 4;
        myNumbers[0][1][1] = 4;
        myNumbers[0][2][1] = 4;
        myNumbers[0][3][1] = 4;
        myNumbers[1][0][1] = 5;
        myNumbers[1][1][1] = 5;
        myNumbers[1][2][1] = 5;
        myNumbers[1][3][1] = 5;
        myNumbers[2][0][1] = 6;
        myNumbers[2][1][1] = 6;
        myNumbers[2][2][1] = 6;
        myNumbers[2][3][1] = 6;
        myNumbers[0][0][2] = 7;
        myNumbers[0][1][2] = 7;
        myNumbers[0][2][2] = 7;
        myNumbers[0][3][2] = 7;
        myNumbers[1][0][2] = 8;
        myNumbers[1][1][2] = 8;
        myNumbers[1][2][2] = 8;
        myNumbers[1][3][2] = 8;
        myNumbers[2][0][2] = 9;
        myNumbers[2][1][2] = 9;
        myNumbers[2][2][2] = 9;
        myNumbers[2][3][2] = 9;

        System.out.println(Arrays.deepToString(myNumbers));

        /**
         * Final Keyword
         */

        final  Double valueFinal = 9.8;
//        valueFinal = 39.8;  // i got error because final value can not be change

        /**
         * Basic Arithmetic
         */

        int lenght = 5;
        int width = 10;
        System.out.println("The area of a rectangle is " +(width * lenght));

        int remainder = 17 % 5;
        System.out.println(remainder);

        /**
         * Type Casting
         */

        double value = 12.56;
        System.out.println((int) value);

        int value2 = 200;
        System.out.println((byte)value2); // if the value exceeds byte range the out put is not correct any more

        String stringToInt = "465";
        System.out.println((Integer.parseInt(stringToInt) + 100));



        /**
         * Math Methods
         */

        int a = 1000;
        int b= -200;
        int c = 700;

        int max1 = Math.max(a, b);
        int max2 = Math.max(max1, c);
        System.out.println(max2);

        double min = 1;
        double max = 50;
        Random rand = new Random();
        double random = min + rand.nextDouble(max);
        System.out.println(random);

        double number = 345.9;
        System.out.println(Math.round(number));

/**
 * Formatting Numbers
 */
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        double amount = 56789.12;
        System.out.println(currency.format(amount));



        NumberFormat percent = NumberFormat.getPercentInstance();
        System.out.println(percent.format(0.25));


        /**
         * Student Grades Calculator
         */

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your score of mathematics: ");
        int mathScore = scanner.nextInt();
        System.out.println("Enter your score of french: ");
        int frenchScore = scanner.nextInt();
        System.out.println("Enter your score of data: ");
        int dataScore = scanner.nextInt();

        int sum1 = mathScore + frenchScore + dataScore;
        double average = (double) sum1 / 3;
        System.out.println("Average score is: " + average);

        NumberFormat averagePercent = NumberFormat.getPercentInstance();
        System.out.println("Average score in percent is: "+averagePercent.format(average));





    }

}