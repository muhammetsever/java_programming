import java.util.Scanner;
public class daire_hesaplama {
    public static void main(String[] args) {
        int a;
        double r, pi=3.14,alan,cevre,DilimAlan;

        Scanner inp = new Scanner(System.in);
        /*Java ile yarı çapını kullanıcıdan aldığınız dairenin alanını ve çevresini hesaplayan programı yazın.

        Alan Formülü : π * r * r;

        Çevre Formülü : 2 * π * r;

        Ödev
        Yarıçapı r, merkez açısının ölçüsü 𝛼 olan daire diliminin alanı bulan programı yazınız.

        𝜋 sayısını = 3.14 alınız.

        Formül : (𝜋 * (r*r) * 𝛼) / 360*/

        System.out.print("Dairenin yarı çapını girin: ");
        r = inp.nextDouble();

        System.out.print("Dairenin merkez açısını girin: ");
        a= inp.nextInt();

        alan = pi *(r*r);

        cevre = 2*pi*r;

        DilimAlan = (pi * (r*r)* a) /360;

        System.out.println("Dairenin alanı :"+alan+" Dairenin Çevresi: "+cevre+" Dairenin dilim alanı: "+DilimAlan);


















    }


}
