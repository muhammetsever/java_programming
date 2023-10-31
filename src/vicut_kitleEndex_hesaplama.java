import java.util.Scanner;
public class vicut_kitleEndex_hesaplama {
    public static void main(String[] args) {

     double boy,endex;
     int kilo;

     Scanner inp = new Scanner(System.in);

     System.out.print("M cinsinden boyunuzu giriniz  'Örn: 1,72 virgül kullanın': ");
     boy = inp.nextDouble();

     System.out.print("KG cinsinden kilonuzu Giriniz: ");
     kilo = inp.nextInt();

     endex =  kilo / (boy*boy);

     System.out.println("Vicut kitle endeksiniz: "+endex);



    }
}
