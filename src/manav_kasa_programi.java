import java.util.Scanner;
public class manav_kasa_programi {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);

        double miktar,elma=3.67,armut=2.17,domates=1.11,muz=0.95,patlican=5,a,b,c,d,e,total;

        /*Armut : 2,14 TL
        Elma : 3,67 TL
        Domates : 1,11 TL
        Muz: 0,95 TL
        Patlıcan : 5,00 TL*/

        System.out.println("Merhaba, Manava hoş geldiniz.");
        System.out.print("Kaç kg armut istersiniz? ");
        miktar = inp.nextDouble();

        a = miktar * armut;

        System.out.print("Kaç kg elma istersiniz? ");
        miktar = inp.nextDouble();

        b = miktar * elma;

        System.out.print("Kaç kg muz istersiniz? ");
        miktar = inp.nextDouble();

        c = miktar * muz;

        System.out.print("Kaç kg domates istersiniz? ");
        miktar = inp.nextDouble();

        d = miktar * domates;

        System.out.print("Kaç kg patlıcan istersiniz? ");
        miktar = inp.nextDouble();

        e = miktar* patlican;

        total = a+b+c+d+e;

        System.out.println("Toplam tutarınız: "+total );
    }
}
