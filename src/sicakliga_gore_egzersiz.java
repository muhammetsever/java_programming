import java.util.Scanner;
import java.util.WeakHashMap;

public class sicakliga_gore_egzersiz {
    public static void main(String[] args) {
        int weather,test;
        Scanner inp = new Scanner(System.in);

        // if else command used:

        System.out.print("Hava Sıcaklığını Girin: ");
        weather = inp.nextInt();

        if(weather<=5){
            System.out.println("Hava "+weather+" derece önerilen etkinlik: Kayak");
        }
        else if (weather>5 && weather<=15){
            System.out.println("Hava "+weather+" derece önerilen etkinlik: Sinema");
        }
        else if (weather>15&&weather<=25){
            System.out.println("Hava "+weather+" derece önerilen etkkinlik: Piknik");
        }
        else if (weather>25){
            System.out.println("Hava "+weather+" derce önerilen etkinlik: Yüzme");
        }

        // switch case command used:

        test = (weather <=5) ? 1:0;
        switch (test){
            case 1:
            System.out.println("Önerilen etkinlik kayak.");
                break;
            default:
                break;
        }
        test = (weather>5&&weather<=15) ? 1:0;
        switch (test){
            case 1:
                System.out.println("önerilen etknlik sinema");
                break;
            default:
                break;
        }
        test = (weather>15&&weather<25) ? 1:0;
        switch (test){
            case 1:
                System.out.println("önerilen etknlik piknik");
                break;
            default:
                break;
        }
        test = (weather>=25) ? 1:0;
        switch (test){
            case 1:
                System.out.println("önerilen etknlik yüzmek");
                break;
            default:
                break;
        }



    }
}
