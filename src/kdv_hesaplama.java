import java.util.Scanner;
public class kdv_hesaplama {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
   double ucret,kdvOran,kdvli_tutar,kdv_tutari;

        System.out.print("Ücret Giriniz: ");
        ucret = inp.nextDouble();

        kdvOran = ucret <= 1000 ? 0.18 : 0.08;

        kdv_tutari = ucret * kdvOran;
        kdvli_tutar = kdv_tutari + ucret;

        System.out.println("Kdv'siz Tutar: "+ ucret);
        System.out.println("Kdv'li Fiyat: "+ kdvli_tutar);
        System.out.println("Kdv Oranı: "+kdvOran);
        System.out.println("Kdv Tutarı: "+kdv_tutari);

    }


}
