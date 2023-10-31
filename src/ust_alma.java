import java.util.Scanner;
public class ust_alma {
    public static void main(String[] args) {
        int num,num1;
        Scanner inp = new Scanner(System.in);

        /*System.out.print("Bir sayı giriniz: ");
        num = inp.nextInt();

        for(int i=1;i<=num;i*=2){
            System.out.println(i);
        }*/

        System.out.print("Bir sayı girin:");
        num1 = inp.nextInt();

        for(int t=1,y=1;t<=num1||y<=num1;t*=4,y*=5){
            System.out.println("4'ün katı:"+t);
            System.out.println("5'in katı:"+y);
            System.out.println("--------------------");
        }







    }
}
