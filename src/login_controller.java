import java.util.Scanner;
public class login_controller {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        String userName,pass,newPass,passChange;



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
            System.out.print("şifreyi değiştirmek ister misiniz 1/0 ? ");
            passChange = inp.nextLine();
            if (!passChange.equals("1")){
                System.out.println("Şifre değiştirme başarısız\nProgram Bitti!");
            }
            else{
                System.out.print("Yeni şifreyi girin: ");
                newPass = inp.nextLine();
                if (newPass.equals("12345")){
                    System.out.println("Yeni şifre giriniz!");
                    newPass = inp.nextLine();
                    }   if (newPass.equals("12345")){
                    System.out.println("Şifre değiştirilemedi\nProgram Bitti!");
                    }   else if(!newPass.equals("12345")){
                    System.out.println("Şifre değiştirildi");
                    }
                else{
                    System.out.println("Şifre değiştrime başarılı.");
                    }
            }

        }
        else {
            System.out.println("Giriş yapılamadı. Birden fazla hatalı bilgi\nProgram Bitti!");
        }
















    }
}
