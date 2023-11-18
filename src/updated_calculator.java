import java.util.Scanner;
import java.lang.Math;
public class updated_calculator {

    static void add() {
        Scanner inp = new Scanner(System.in);

        boolean start = true;
        double toplam = 0;

        while (start) {

            System.out.print("İlk sayıyı girin ya da çıkmak için 'q' girin.");

            String g = inp.next();

            if (g.equalsIgnoreCase("q")) {

                System.out.println("Toplama işlemi sonucunuz = "+toplam);

                start = false;
                break;
            }

            try {
                double sayi1 = Double.parseDouble(g);

                toplam += sayi1;

                System.out.println("sonuç = " + toplam);
            }
            catch (NumberFormatException e){
                System.out.println("Geçersiz giriş, çıkış yapabilir ya da toplama işlemine devam edebilirsiniz...");
            }
        }
    }

    static void ex() {
        Scanner inp = new Scanner(System.in);

        boolean start = true;
        double reso = 0;


        while (true){

            System.out.print("İlk sayıyı girin ya da çıkmak için 'q' girin.");

            String value = inp.next();

            if (value.equalsIgnoreCase("q")){


                System.out.println("Sonuç: "+ reso);

                System.out.println("İşlem sonucu= "+reso);

                start = false;
                break;
            }
            try {
                double num = Double.parseDouble(value);

                if(start){
                    reso = num;
                    start = false;
                    System.out.println("Sonuç= "+reso);
                }
                else {
                    reso -= num;
                    System.out.println("sonuç= "+reso);
                }
            }
            catch (NumberFormatException e){
                System.out.println("Geçersiz giriş devam etmek için sayı, çıkmak için q girişi yapın...");
            }
        }
    }
    static void multip(){

        Scanner inp = new Scanner(System.in);

        double reso = 1 ;

        while(true){
            System.out.println("Sayı girin ya da çıkmak için 'q' ya basın...");
            String temp = inp.nextLine();

            if(temp.equalsIgnoreCase("q")){
                System.out.println("Sonuç = "+reso);
                break;

            }
            try {
                double n1 = Double.parseDouble(temp);

                reso *= n1;
                System.out.println("sonuç= "+reso);

            }
            catch (NumberFormatException e){
                System.out.println("Geçersiz giriş devam etmek için sayı, çıkmak için 'q' ya basın...");
            }
        }
    }

    static void div(){

        Scanner inp = new Scanner(System.in);

        double reso = 0;

        while(true){

            System.out.print("Bölünen Sayıyı girin ya da çıkmak için 'q' ya basın...");
            String temp = inp.next();

            if(temp.equalsIgnoreCase("q")){
                System.out.println("sounç= "+reso);
                break;
            }

            try{
                double n1 = Double.parseDouble(temp);

                System.out.print("Böleni girin: ");

                double n2 = inp.nextDouble();

                reso = n1 / n2;

                System.out.print("sonuç "+reso);

            }
            catch (NumberFormatException e){
                System.out.println("Geçersiz giriş yaptınız devam etmek için sayı çıkış yapmak için 'q' ya basın...");
            }
        }
    }

    static void pow(){
        Scanner inp = new Scanner(System.in);

        int reso = 0;

        while(true) {

            System.out.print("Tabanı girin ya da çıkamk için 'q'ya basın...");

            String temp = inp.next();

            if(temp.equalsIgnoreCase("q")){

                System.out.println("sonuç = "+reso);

                break;
            }
            try{
                int pBase = Integer.parseInt(temp);

                System.out.print("Üssü girin...");

                int pPow = inp.nextInt();

                reso = (int) Math.pow(pBase,pPow);

                System.out.println("Sonuç = "+reso);

            }
            catch (NumberFormatException e){
                System.out.println("Geçersiz giriş çıkmak için 'q'ya devam etmek için sayı girin...");
            }
        }
    }

    static void fac(){
        Scanner inp = new Scanner(System.in);

        while(true){

            long reso = 1;

            System.out.print("Sayı girin ya da çıkmak için 'q'ya basın...");

            String temp = inp.next();

            if(temp.equalsIgnoreCase("q")){

                System.out.println("sonuç = "+reso);

                break;
            }
            try{

                long n1 = Long.parseLong(temp);

                for(int i = 1;i <= n1;i++){

                    reso *= i;
                }
                System.out.println("sonuç = "+reso);

            }
            catch (NumberFormatException e){
                System.out.println("Geçersiz giriş çıkmaç için 'q'ya devam etmek için sayı girin...");
            }
        }
    }

    static void mod(){

        Scanner inp = new Scanner(System.in);

        while(true){

            double reso = 0;

            System.out.print("Giriş yapın ya da çıkmak için 'q' ya basın...");

            String temp = inp.next();

            if(temp.equalsIgnoreCase("q")){

                System.out.println("Sonuç = "+reso);

                break;
            }
            try{

                double n1 = Double.parseDouble(temp);

                System.out.print("modu girin...");

                double n2 = inp.nextDouble();

                reso = n1 % n2;

                System.out.println("Sonuç = "+ reso);

            }
            catch (NumberFormatException e){
                System.out.println("Geçersiz giriş devam etemek için sayı çıkmak için 'q'ya basın...");
            }
        }
    }

    static void rett(){

        Scanner inp = new Scanner(System.in);

        double circ = 0;
        double area = 0;

        while(true){

            System.out.print("Uzun kenarı girin ya da çıkmak için 'q' ya basın...");

            String temp = inp.next();

            if(temp.equalsIgnoreCase("q")){

                System.out.println("Alan = "+area);

                System.out.println("Çevre = "+circ);

                break;
            }
            try{
                double longLine= Double.parseDouble(temp);

                System.out.print("Kısa kenarı girin...");

                double shortLine= inp.nextDouble();

                circ = 2*(longLine+shortLine);

                area = longLine * shortLine;

                System.out.println("Çevre = "+circ+"\nAlan = "+area);
            }
            catch (NumberFormatException e){
                System.out.println("Geçersiz giriş devam etmek için uzun kenarı, çıkmak için 'q'ya basın...");
            }
        }
    }

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        String menu  = "1 - toplama\n"
                + "2 - çıkarma \n"
                + "3 - çarpma\n"
                + "4 - bölme\n"
                + "5 - üslü sayı alma\n"
                + "6 - faktoriyel\n"
                + "7 - mod alma\n"
                + "8 - diktörgen alan çevre hesabı \n"
                + "0 - çıkış...\nCevap:";

        System.out.print("Bir işlem seçin;\n"+ menu);
        int chose = inp.nextInt();

        while(chose != 0) {
            switch (chose) {
                case 1:
                    add();

                    System.out.print(menu);

                    chose = inp.nextInt();

                    break;

                case 2:
                    ex();

                    System.out.print(menu);

                    chose = inp.nextInt();

                    break;

                case 3:
                    multip();

                    System.out.print(menu);

                    chose = inp.nextInt();

                    break;

                case 4:
                    div();

                    System.out.print(menu);

                    chose = inp.nextInt();

                    break;

                case 5:
                    pow();

                    System.out.print(menu);

                    chose = inp.nextInt();

                    break;

                case 6:
                    fac();

                    System.out.print(menu);

                    chose = inp.nextInt();

                    break;

                case 7:
                    mod();

                    System.out.print(menu);

                    chose = inp.nextInt();

                    break;

                case 8:
                    rett();

                    System.out.print(menu);

                    chose = inp.nextInt();

                    break;


                default:

                    System.out.println("Geçersiz giriş!");

                    System.out.print(menu);

                    chose = inp.nextInt();

                    break;
            }
        }
    }
}
