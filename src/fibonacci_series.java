import java.util.Scanner;
public class fibonacci_series {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);

        int num0 = 0 ,  tot  , num1=1 ;

        System.out.print("Lütfen fibonacci eleman sayısını girin: ");
        int n = inp.nextInt();

        System.out.println("0\n1");

        for(int sayac = 0 ; sayac <= n ; sayac++){

            tot = num0 + num1 ;

            System.out.println(tot);

            num0 = num1;
            num1 = tot ;
        }
    }
}
