import java.util.Scanner;
public class basic_calculating_machine {
    public static void main(String[] args) {
        double a,b,c;
        String islem;
        Scanner inp = new Scanner(System.in);

        System.out.print("Basit Hesap Makinesi Programına Hoş Geldiniz!\n 1= Toplama İşlemi \n 2= Çıkarma İşlemi");
        System.out.println("\n 3= Çarpma İşlemi \n 4= Bölme İşlemi");
            islem = inp.nextLine();
        System.out.print("a değerini girin: ");
            a = inp.nextDouble();
        System.out.print("b değerini girin: ");
            b = inp.nextDouble();


        switch (islem) {
            case "1":
                c= a+b;
                System.out.println("a+b= "+c);
                break;
            case "2":
                c = a-b;
                System.out.println("a-b= "+c);
                break;
            case "3":
                c = a*b;
                System.out.println("a*b= "+c);
                break;
            case "4":
                c = a/b;
                System.out.println("a/b= "+c);
                break;
            default:
                System.out.println("Üzgünüm sistemde olmayan bir işlem girdiniz!");

        }
    }
}
