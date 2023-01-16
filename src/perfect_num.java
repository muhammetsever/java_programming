import java.util.Scanner;
public class perfect_num {
    public static void main(String[] args) {

        //mükemmel sayı bir sayının ona tam bölünen pozitif zayıların toplamıdır.

        Scanner inp = new Scanner(System.in);

        System.out.print("Bir sayı girin: ");
        int num = inp.nextInt();
        int  tot = 0;
        int tempNum = num;


        for( int i = (num - 1) ; i > 0 ; i-- ){
            if( tempNum % i == 0 ){
                tot += i;
            }
            else{
                continue;
            }
        }
        if (tempNum == tot){
            System.out.println(tempNum+" mükemmel sayıdır.");
        }
        else{
            System.out.println(tempNum+" mükemmel sayı değildir.");
        }
    }
}
