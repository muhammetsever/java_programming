import java.util.Scanner;
public class sayi_toplama {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int sayi,sayi1,total=0,total2=0;
        boolean IsPositive=false,positive=false;

        /*while (!IsPositive){
            System.out.print("Bir sayı girin:");
            sayi = inp.nextInt();

            if(sayi>0){
                if (sayi % 2 !=0){
                    total+=sayi;
                    System.out.println(sayi);
                }

                }
            else{
                IsPositive=true;
            }
        }
        System.out.println("Toplam Sayı="+total);*/

        while (!positive){
            System.out.print("Bir sayı girin:");
            sayi1 = inp.nextInt();

            if(sayi1 % 2 == 0){
                if (sayi1 % 4 == 0){
                    total2 += sayi1;
                    System.out.println(sayi1);
                }

            }
            else{
                positive=true;
            }
        }
        System.out.println("Toplam Sayı="+total2);


    }
}
