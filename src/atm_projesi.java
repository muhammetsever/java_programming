import java.util.Scanner;
public class atm_projesi {
    public static void main(String[] args) {

        String userName,passWord;
        int balance = 1500 , right = 3 , choice;

        Scanner inp = new Scanner(System.in);

        while(right != 0){
            System.out.print("Kullanıcı adınız: ");
            userName = inp.nextLine();

            System.out.print("Şifrenizi giriniz: ");
            passWord = inp.nextLine();

            if(userName.equals("Muhammet Sever")&&passWord.equals("12345")){
                do{
                    System.out.print("Bir işlem Seçiniz:\n1-Para yatırma\n2-Para Çekme\n3-Bakiye Sorgulama\n4-Çıkış Yap...");
                     choice = inp.nextInt();

                     int mRest;

                     switch ( choice ){
                         case 1:
                             System.out.println("---------------------");
                             System.out.print("Tutarı Girin: ");
                             mRest = inp.nextInt();
                             balance += mRest;
                             System.out.println("Güncel Bakiyeniz: "+balance);
                             mRest = 0;
                             System.out.println("----------------------");
                             break;
                         case 2:
                             System.out.println("-----------------");
                             System.out.print("Çekeceğiniz Tutarı girin: ");
                             mRest = inp.nextInt();
                             balance -= mRest;
                             System.out.println("Güncel tutar: "+balance);
                             System.out.println("-------------------");
                             break;
                         case 3:
                             System.out.println("-----------------");
                             System.out.println("Bakiyeniz: "+balance);
                             System.out.println("------------------");
                             break;
                     }
                }while( choice != 4 );
                System.out.println("Görüşmek Üzere");
                break;
            }
            else{
                right--;
                System.out.println("Hatalı şifre veya kullanıcı adı tekrar deneyin!"+"("+"kalan hakkınız:"+right+")");
            }
        }
        switch (right){
            case 0:
                System.out.println("Hesabınız bloke edlimiştir bankanızla iletişime geçin!");
                break;
        }
    }
}
