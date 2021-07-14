import java.util.Scanner;

public class FahrenheittoCelsius {
    public static void main(String[] args){
        double temp, c;

        Scanner value = new Scanner(System.in);
        System.out.println("Enter the Fahrenheit temp");
         temp = value.nextDouble();
    System.out.println("convert to celcius" + celcius(temp));
    }

    private static double celcius(double f) {

        return  (f-32)*5/9;

    }

}
