public class LineComparison {
    public static void main(String[] args) {

        //Printed welcome message
        System.out.println("Welcome to line comparison computation program");

        //Initialized the variables
        int x1 = 2;
        int x2 = 5;
        int y1 = 3;
        int y2 = 1;

        //Calculated length of the line
        double length = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));

        //Printed length of the line
        System.out.println("Length of the line is:" + length);

    }
}
