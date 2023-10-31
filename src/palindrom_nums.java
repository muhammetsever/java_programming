import java.util.Scanner;
import java.util.SortedMap;

public class palindrom_nums {

    static String palind(int n) {
        int temp = n, reveseNum = 0, lastNum;

        while (temp != 0) {

            lastNum = temp % 10;

            reveseNum = (reveseNum * 10) + lastNum;

            temp /= 10;

        }
        if(reveseNum == n)
            return "Girdiğiniz sayı "+n+" palindrom sayıdır.";
        else
            return "Girdiğiniz sayı "+n+" palinrom sayı değildir.";
    }

    public static void main(String[] args)

    {
        Scanner inp = new Scanner(System.in);

        System.out.print("Bir sayı girin:");
        int nump = inp.nextInt();

        System.out.println(palind(nump));
    }
}
