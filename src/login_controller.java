import java.util.Scanner;
public class login_controller {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        String userName,pass;
        int passChange;


        System.out.print("Kullanıcı Adınızı Girin: ");
            userName = inp.nextLine();
        System.out.print("Şifrenizi Girin: ");
            pass= inp.nextLine();

        if (userName.equals("muh") && pass.equals("12345") ) {
            System.out.println("Giriş Yapıldı!");
        }
        else if (!userName.equals("muh")&&pass.equals("12345")) {
            System.out.println("hatalı kullanıcı adı");
        }
        else if (userName.equals("muh")&&!pass.equals("12345")) {
            System.out.println("hatalı şifre");
            System.out.println("şifreyi değiştirmek ister misiniz 1/0 ? ");
            passChange = inp.nextInt();

            switch (passChange){
                case 1:
                    System.out.println("Yeni şifreyi girin");
                    pass = inp.nextLine();

                        if (pass.equals("12345")) {
                            System.out.println("Lütfen yeni bir şifre giriniz! ");
                            pass = inp.nextLine();
                        }

                        else{
                            System.out.println("Şifre oluşturuldu!");
                        }
                        break;
                        case 0:
                    System.out.println("Giriş Yapılamadı.\nProgram Bitti!");
                    break;
                default:
                    System.out.println("olmayan bir değer girdiniz");
                    break;
            }

        }
        else {
            System.out.println("Hatalı şifre ve kullanıcı adı");

        }


















    }
}
