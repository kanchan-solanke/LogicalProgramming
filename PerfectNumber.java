public class PerfectNumber {
    public static void main(String[] args){
        int n6 = 1+2+4+7+14;          // int n, sum=0;
        int n5 =28;                       // sum =sum +i;

        if(n5==n6)
            System.out.println("It is a perfect number");
        else
            System.out.println("it is not a perfect number");

    }
}

//by assuming values

import java.util.Scanner;

public class PerfectNumber{
    private static Scanner sc;

    public static void main(String[] args) {
        int i, Number, Sum = 0 ;
        sc = new Scanner(System.in);
        System.out.println("\n Please Enter any Number: ");
        Number = sc.nextInt();

        for(i = 1 ; i < Number ; i++) {
            if(Number % i == 0)  {
                Sum = Sum + i;
            }
        }
        if (Sum == Number) {
            System.out.format("\n% d is a Perfect Number", Number);
        }
        else {
            System.out.format("\n% d is NOT a Perfect Number", Number);
        }
    }
}
