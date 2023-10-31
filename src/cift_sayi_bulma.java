import java.util.Scanner;
public class cift_sayi_bulma {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int a,b,t=0,i;

        System.out.print("Bir sayı girin:");
        a = inp.nextInt();



        for(a=a;a>=0;a--){
            if(a%2==0){
                System.out.println(a);
            }
            else{
                continue;
            }
        }

        System.out.print("Bir sayı girin:");
        b = inp.nextInt();

        for(i=1;i<=b;b--){
            if(b%3==0 && b%4==0){
                i++;
                t=b+t;
                System.out.println(b);
            }
            else{
                continue;
            }
        }
        System.out.println("Ortalama "+t/i);

    }
}
