import java.lang.Math;
import java.util.Scanner;

public class LineComparison {
    public static double length1, length2;

    public static void lineLengthCompute() {

        //Initialized the variables
        double x1 = 2;
        double x2 = 3;
        double y1 = 3;
        double y2 = 4;
        double x3 = 3;
        double x4 = 4;
        double y3 = 2;
        double y4 = 5;

        //Calculating the length of two lines
        double length1 = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
        double length2 = Math.sqrt((x4 - x3) * (x4 - x3) + (y4 - y3) * (y4 - y3));
        System.out.println(length1);
        System.out.println(length2);
    }

    //Checking if the lines are equal or one of them is greater than the other
    public static void checkEquality() {
        if (length1 == length2) {
            System.out.println("Both lines are equal");
        } else if (length1 > length2) {
            System.out.println("Line 1 is greater than line 2");
        } else {
            System.out.println("Line 2 is greater than line 1");
        }
    }

    //Calling the methods
    public static void main(String[] args) {
        //Printed welcome message
        System.out.println("Welcome to line comparison computation program");
        lineLengthCompute();
        checkEquality();
    }
}
