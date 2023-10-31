import java.util.Scanner;
public class revese_triangle {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);

        System.out.print("Basamak Sayısı girin:");
        int stepNum = inp.nextInt();

        for ( int i =  stepNum - 1 ; i >= 1 ; i-- ) {

            for ( int k = 0; k <= stepNum - i; k++ ) {
                System.out.print(" ");
            }

            for ( int j = 1; j <= (i * 2 - 1); j++ ) {
                System.out.print("*");
            }

            System.out.println();

        }

    }

}
