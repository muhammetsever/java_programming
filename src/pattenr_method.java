import java.util.Scanner;
public class pattenr_method {
    static Scanner inp = new Scanner((System.in));

    static int desen(int x,boolean n, int mem){
        int val;

        if (x > mem && n){
            return 1;
        }
        if(x <= 0){
            n = true;
        }
        if(n){
            val = 5;
        }
        else {
            val = -5;
        }
        System.out.print(x+" ");
        return desen(x+val,n,mem);
    }

    public static void main(String[] args) {
        System.out.print("sayı girin...");
        int num = inp.nextInt();
        System.out.println(desen(num,false,num));
    }
}
