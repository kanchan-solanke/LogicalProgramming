import java.util.Scanner;

public class VendingMachine {


    public static void main(String[] args) {
        int notes;
        int vendingMachine[] = {1, 2, 5, 10, 50, 100, 500, 1000};
        //highest 1000 and lowest 1
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the money");
        int money = sc.nextInt();
        int minnotes = 0;
        for(int i=7; i>=0; i--){    // array=8
            if(money>=vendingMachine[i]){           //assume 700  700>=500
                notes = (int) (money / vendingMachine[i]); // 200 remaining  // n = 500/1000 = 2
                money = money- notes* vendingMachine[i];   //  m= 700 - 500 = 200
                minnotes = minnotes + notes;    // 500 +200 =700
                System.out.println("notes of"+ vendingMachine+ "=" + notes);
            }
        }
     System.out.println("total no of notes:"+minnotes);
    }
}

// 1 =500 notes
// 2 = 100 notes
//total = 700 money
