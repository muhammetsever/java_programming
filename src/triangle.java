import java.util.Scanner;
public class triangle {
    public static void main(String[] args) {
        int n;

        Scanner inp = new Scanner(System.in);

        System.out.print("Basamak Sayısını girin: ");
        n = inp.nextInt();

        for(int i = 0 ; i < n; i++){

            for(int j = 0 ; j < (n-i) ;j++){
                System.out.print(" ");
            }

            for(int k = 0 ; k < (i * 2 + 1) ; k++ ){
                System.out.print("*");
            }
            System.out.println();

        }
        for(int t = n - 1; t >= 1 ; t--){

            for (int u = 0 ;u <= n - t ; u++ )
                System.out.print(" ");

            for(int y = 1 ; y <= (t * 2 - 1) ; y++){
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
