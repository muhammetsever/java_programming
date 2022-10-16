import java.util.Scanner;
public class ucgen_hesaplama {
    public static void main(String[] args) {

    Double dikKenar,dikKenar2,hipotenus,UcgenCevre,UcgenAlan,u;

    Scanner inp = new Scanner(System.in);

    System.out.print("Dik kenar girin: ");
    dikKenar = inp.nextDouble();

    System.out.print("Dik kenar girin: ");
    dikKenar2 = inp.nextDouble();

    hipotenus = Math.sqrt((dikKenar*dikKenar) + (dikKenar2*dikKenar2));

    System.out.println("Hipotenüs = "+hipotenus);

    // Math.sqrt bilmeden yaptığım için bu satırı kullandım bu satırı yapmasanız da olur.
    /*System.out.print("Hipotenüs girin: ");
    hipotenus = inp.nextDouble(); */

       /* Üç𝑔𝑒𝑛𝑖𝑛 ç𝑒𝑣𝑟𝑒𝑠𝑖 = 2𝑢

                𝑢 = (a+b+c) / 2

        Alan * Alan = 𝑢 * (𝑢 − 𝑎)* (𝑢 − 𝑏) * (𝑢 − 𝑐) */

        u = ((dikKenar+dikKenar2+hipotenus) / 2);
        UcgenCevre = 2 * u;

        UcgenAlan = u * (u - dikKenar) * (u- dikKenar2) * (u - hipotenus);


        System.out.println("Üçgenin çevresi: "+UcgenCevre);
        System.out.println("Üçgenin alanı: "+UcgenAlan);





    }
}
