import java.util.Scanner;
public class number_sort {
    public static void main(String[] args) {
        int num1,num2,num3;
        Scanner inp = new Scanner(System.in);

        System.out.print("İlk sayıyı giriniz: ");
            num1 = inp.nextInt();

        System.out.print("İkinci sayıyı giriniz: ");
            num2 = inp.nextInt();

        System.out.print("Üçüncü sayıyı girin: ");
            num3 = inp.nextInt();

        if ((num1>num2)&&(num1>num3)){
            if(num2>num3){
                System.out.println("num1 > num2 > num3");
            }
            else {
                System.out.println("num1 > num3 > num2");
            }
        }else if((num2>num1)&&(num2>num3)){
            if(num1>num3){
                System.out.println("num2 > num1 > num3");
            }
            else {
                System.out.println("num2 > num3 > num1");
            }
        }else if((num3>num1)&&(num3>num2)){
            if (num2 > num1){
                System.out.println("num3 > num2 > num1");
            }
            else{
                System.out.println("num3 > num1 > num2");
            }
        }

    }
}






