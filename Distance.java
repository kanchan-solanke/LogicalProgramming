public class Distance {
    public static void main(String args[]) {

        // input point coordinates
        int x = 0;        //assume 0
        int y = 1;         //assume 1
// to convert String to Integer in Java is parseInt()

        // compute distance
        //double distance = Math.sqrt((x * x) + (y * y));
        double distance = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));


        // output distance
        System.out.println("Distance from (0, 0) to (" + x + ", " + y + ") is " + distance);

    }
}
