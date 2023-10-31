import java.util.Scanner;

public class artik_yil_hesaplama {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int year,check;

        System.out.print("Yıl giriniz: ");
        year = inp.nextInt();

        check = year % 100;

        if (check==0){
            check = year % 400;
            if (check==0){
                System.out.println(year+" artık yıldır!");
            }
            else {
                System.out.println(year+" artık yıl değildir!");
            }
        }
        else if (check!=0){
            check=year % 4;
            if (check==0){
                System.out.println(year+" artık yıldır!");
            }
            else {
                System.out.println(year+" artık yıl değildir!");
            }
        }
    }
}
