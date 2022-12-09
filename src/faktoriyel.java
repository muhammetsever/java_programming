import java.util.Scanner;
public class faktoriyel {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int combin,totn=1,totr=1,totnr=1;


        /*System.out.print("Bir sayı girin:");
        num = inp.nextInt();

        for(int i=1;i<=num;i++){
            total *= i;
        }
        //System.out.println(total);
        */

        System.out.print("n için bir sayı girin:");
        int num1 = inp.nextInt();

        System.out.print("r için bir sayı girin:");
        int num2 = inp.nextInt();

        for(int i=1;i<=num1;i++){
            totn *=i;

        }

        for(int a=1;a<=num2;a++){
            totr *= a;
        }

        int z =1;

        while(z<=(num1-num2)){
            totnr*=z;
            z++;
        }

        System.out.println(totn+" "+totr+" "+" "+totnr);



        combin= totn/(totr*totnr);
        System.out.println("kombinasyon sonucu "+combin);

    }
}
