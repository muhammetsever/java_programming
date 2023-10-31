import java.util.Scanner;
public class uslu_sayilar {
    public static void main(String[] args) {
        int base,power,total=1;

        Scanner inp = new Scanner(System.in);

        System.out.print("Tabanı girin: ");
        base = inp.nextInt();

        System.out.print("Kuvveti girin: ");
        power = inp.nextInt();


        for(int i=1;i<=power;i++){
            total*=base;

        }
        System.out.println(base+"^"+power+"="+total);







    }
}
