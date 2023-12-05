import java.util.Scanner;
public class prime_num {
    static Scanner inp = new Scanner(System.in);

    static int Prime_num(int x,int n){
        if(n == x) return 1;
        if(x % n == 0) return 0;

        return Prime_num(x,n+1);
    }

    public static void main(String[] args) {
        System.out.print("Sayı girin...");
        int x = inp.nextInt();

        if(x == 1 || x == 0){
            System.out.println(x+ " asal değil...");
        }

        if (Prime_num(x,2)==1) System.out.println(x+" asaldır!");
        else System.out.println(x+" asal değildir!");
    }
}
