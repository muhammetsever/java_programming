import java.security.cert.TrustAnchor;
import java.util.Scanner;
public class ebob_ekok {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int a, b;

        System.out.print("İlk Sayıyı girin:");
        a = inp.nextInt();

        System.out.print("ikinci sayıyı girin:");
        b = inp.nextInt();


        int ebob = 0;

        if (a < b) {

            /*
            for (int i = 1; i <= a; i++) {
                if(a % i == 0 && b % i == 0){
                    ebob = i;

                    bu durumda döngü daha fazla döneceği için daha çok işlem gücü harcar
                }
            }
            */
            int i = a;
            while (i >= 1) {
                if (a % i == 0 && b % i == 0) {
                    ebob = i;
                    System.out.println(a + " " + b + " sayılarının ebobu:" + ebob);
                    break;
                } else {
                    i--;
                }
            }

            /*for (int i = a; i >= 1; i--) {
                if(a % i == 0 && b % i == 0){
                    ebob = i;
                    break;
                    // bu durumda döngü daha az döndüğü için daha az işlem gücü gerekir
                }
            }

            System.out.println(a+" "+b+" sayılarının ebobu:"+ebob);
        }*/
            int k = 1, ekok = 1;
            while(k<=(a*b)){
                if(k % a == 0 && k % b == 0) {
                    ekok = k;
                    System.out.println(a + " " + b + " sayılarının ekok:" + ekok);
                    break;
                }
                k++;
            }
        }
        else {
            int i = b;
            while (i >= 1) {
                if (a % i == 0 && b % i == 0) {
                    ebob = i;
                    System.out.println(a + " " + b + " sayılarının ebobu:" + ebob);
                    break;
                } else {
                    i--;
                }
            }

                /*for (int k = 1; k <= b; k++) {
                    if (a % k == 0 && b % k == 0) {
                        ebob = k;
                    }
                }
                System.out.println(a + " " + b + " sayılarının ebobu:" + ebob);
            }*/

            int ekok = 0 , k = 1;

            while(k<=(a*b)){
                if(k % a == 0 && k % b == 0) {
                    ekok = k;
                    System.out.println(a + " " + b + " sayılarının ekok:" + ekok);
                    break;
                }
                k++;
            }

            /*for (int t = 1; t <= (a * b); t++) {
                if (t % a == 0 && t % b == 0) {
                    ekok = t;
                    System.out.println(a + " " + b + " sayılarının ekok:" + ekok);
                    break;
                }
            }*/
        }
    }
}
