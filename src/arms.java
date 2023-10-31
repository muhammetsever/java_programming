import java.util.Scanner;
public class arms {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int num,tempNum;

        System.out.print("Bir değer girin:");
        num = inp.nextInt();

        tempNum = num;

        int counter = 0;

        while (tempNum != 0) {
            tempNum /= 10;
            counter++;
        }

        tempNum = num;

        //System.out.println(num);

        int count2, numPw, total = 0;

        while (tempNum != 0) {
            count2 = tempNum % 10;
            numPw = 1;
            for (int i = 1; i <= counter; i++) {
                numPw *= count2;
            }
            total += numPw;
            tempNum /= 10;

        }
        if (num == total) {
            System.out.println("Girdiğiniz sayı " + total + " armstong sayıdır!");
        }
        else {
            System.out.println("Girdiğiniz sayı " + num + " armstorng sayı değildir!");
        }
    }
}
