import java.util.Scanner;
public class class_gradudate_program {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int mat,fizik,turkce,kimya,muzik,total;
        int lesseonNum=0;
        double avarage;

        System.out.print("Matematik notunuzu girin: ");
            mat= inp.nextInt();
            if (mat<0 || mat>100){
            System.out.println("Ders notu ortalamaya dahil değil!");
            mat = 0;
            }
            else {
                lesseonNum++;
            }

        System.out.print("Fizik notunuzu girin: ");
            fizik= inp.nextInt();
            if (fizik<0 || fizik>100){
                System.out.println("Ders notu ortalamaya dahil değil!");
                fizik=0;
            }
            else {
                lesseonNum++;
            }

        System.out.print("Tükçe notunuzu girin: ");
            turkce= inp.nextInt();
            if (turkce<0 || turkce>100){
                System.out.println("Ders notu ortalamaya dahil değil!");
                fizik=0;
            }
            else {
                lesseonNum++;
            }

        System.out.print("Kimya notunuzu girin: ");
            kimya= inp.nextInt();
            if (kimya<0 || kimya>100){
                System.out.println("Ders notu ortalamaya dahil değil!");
            kimya=0;
            }
            else {
                lesseonNum++;
            }
        System.out.print("Müzik notunuzu girin: ");
            muzik= inp.nextInt();
            if (muzik<0 || muzik>100){
                System.out.println("Ders notu ortalamaya dahil değil!");
            muzik=0;
            }
            else {
                lesseonNum++;
            }
            total=mat+kimya+turkce+fizik+muzik;

            avarage = total/lesseonNum;

            if (avarage<55){
                System.out.println("Ügünüz Ortalamanız sınıfı geçmek için yetersiz.\nOrtalamanız: "+avarage);
            }
            else{
                System.out.println("Terikler Sınıfı Geçtiniz!\n Ortalamanız: "+avarage);
            }
    }
}
