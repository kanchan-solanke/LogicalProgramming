import java.util.Scanner;

public class Celciustofahrenheit{
    public static void main(String[] args) {

        double temp, f;
        Scanner value = new Scanner(System.in);
        System.out.println("Enter Celcius temp");
         temp = value.nextDouble();
        System.out.println("The fahrenheit temp is:" + fahrenheit(temp) );
    }



    private static  double fahrenheit(double c){
            return (c * 9/5)+32;


        }
}
