public class LineComparison {
    public static void main(String[] args) {

        //Printed welcome message
        System.out.println("Welcome to line comparison computation program");

        //Initialized the variables
        int x1 = 2;
        int x2 = 3;
        int y1 = 3;
        int y2 = 4;
        int x3 = 3;
        int x4 = 4;
        int y3 = 2;
        int y4 = 5;

        //Calculating the length of two lines
        double length1 = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
        double length2 = Math.sqrt((x4 - x3) * (x4 - x3) + (y4 - y3) * (y4 - y3));

        //Checking if both the lines are equal or one is greater than other
        if (length1 == length2) {
            System.out.println("lines are equal");
        } else if (length1 > length2) {
            System.out.println("line1 is greater than line2");
        } else {
            System.out.println("line1 is less than line2");
        }
    }
}
