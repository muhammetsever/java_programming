import java.util.Scanner;
public class updated_calculator {

    static void toplama() {
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
                }
                else {
                    reso -= num;
                }
            }
            catch (NumberFormatException e){
                System.out.println("Geçersiz giriş devam etmek için sayı, çıkmak için q girişi yapın...");
            }

        }
    }

    static void multip(){

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
                    toplama();
                    chose = 9;
                    break;
                case 2:
                    ex();
                    chose = 9;
                    break;
                case 3:
                    multip();
                    break;
                case 4:

                    break;
                case 5:

                    break;
                case 6:

                    break;
                case 7:

                    break;
                case 8:

                    break;
                case 9:
                    System.out.println("Program bitti!");

                    System.exit(0);

                    break;

                default:
                    System.out.println("Geçersiz giriş!");
                    break;
            }
        }


    }

}
