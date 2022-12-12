import java.util.Scanner;
public class harmonic_num {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);

        int n;
        double total=0;

        System.out.print("Bir n değeri girin: ");
        n = inp.nextInt();

        for(double i = 1 ; i <= n ; i++){
            total += (1/i);
        }

        System.out.println(total);
    }
}
