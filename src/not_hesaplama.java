import java.util.Scanner;
public class not_hesaplama {
    public static void main(String[] args) {
        int kimya,fizik,mat,turkce,tarih,muzik;
        Scanner inp = new Scanner(System.in);


        System.out.print("Kimya Notunuz: ");
        kimya = inp.nextInt();


        System.out.print("Tarih Notunuz: ");
        tarih = inp.nextInt();

        System.out.print("Fizik Notunuz: ");
        fizik = inp.nextInt();

        System.out.print("Türkçe Notunuz: ");
        turkce = inp.nextInt();

        System.out.print("Müzik Notunuz: ");
        muzik = inp.nextInt();

        System.out.print("Matematik Notunuz: ");
        mat = inp.nextInt();

        int toplam =kimya + fizik + mat + turkce + muzik + tarih;
        float ortalama = toplam/6;
        System.out.println("Ortalamanız: "+ortalama);

        String kosul = ortalama >= 50 ? "Geçti":"Kaldı";
        System.out.println(kosul);
    }
}
