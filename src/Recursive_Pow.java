import java.util.Scanner;
public class Recursive_Pow {
    static Scanner inp = new Scanner(System.in);
    static int pow(int base,int top){
        if(top == 0){
            return 1;
        }
        return base*pow(base,--top);
    }

    public static void main(String[] args) {
        System.out.print("Tabanı girin ardından kuvveti girin... ");
        int base = inp.nextInt();
        int top = inp.nextInt();
        System.out.println(pow(base,top));

    }
}

