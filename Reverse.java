//First, we find the remainder of the given number by using the modulo (%) operator.
//        Multiply the variable reverse by 10 and add the remainder into it.
//        Divide the number by 10.
public class ReverseNumber {

    public static void main(String[] args) {
        int number = 973452, reverse = 0;
        for (number = 973452; number != 0; number = number / 10) {
            int remainder = number % 10;
            reverse = reverse * 10 + remainder;

        }
        System.out.println("reverse number is " + reverse);
    }
}
