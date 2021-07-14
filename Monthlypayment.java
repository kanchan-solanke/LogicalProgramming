import java.util.Scanner;

public class MonthlyPayment {
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
        System.out.println("enter a principal");
        double principal = sc.nextDouble();

        Scanner sc1 = new Scanner(System.in);
        // assume 1200
        System.out.println("enter a rate");
        double rate = sc1.nextDouble();

        Scanner sc3 = new Scanner(System.in);
        // assume 1200
        System.out.println("enter a time");
        double time = sc3.nextDouble();

         rate = rate / (12*100);
          time = time *12;
        double monthlypayment = (principal * rate) / (1 - Math.pow(1 + rate, -time));


        System.out.print(" Monthly Payment is= "+monthlypayment+"\n");

    }
}
