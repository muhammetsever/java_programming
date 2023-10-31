import java.util.Scanner;
public class taksimetre_hesaplama {
    public static void main(String[] args) {
       /* Taksimetre KM başına 2.20 TL tutmaktadır.
        Minimum ödenecek tutar 20 TL'dir. 20 TL altında ki ücretlerde yine 20 TL alınacaktır.
        Taksimetre açılış ücreti 10 TL'dir.*/

        // Totale başlangıçta her türlü 10 tl ödendiği için 10 tl yazıp sonra diğer değerler toplana bilir.

        /* double total = 10;
           total += (km* perKM);

           gibi bir kodlama yapılabilir
         */


        int km,tmAcilis=10;
        double kmCarpani =2.20,sonuc;

        Scanner inp = new Scanner(System.in);

        System.out.print("Merhaba, giceğiniz yer kaç KM? : ");
        km = inp.nextInt();

       sonuc = tmAcilis + (km*kmCarpani);

        sonuc = (sonuc <= 20) ? 20 : sonuc;

        System.out.println("Taksimetrede görünen tutar: "+sonuc);





    }
}
