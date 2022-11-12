import java.util.Scanner;
public class chinese_zodiac {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int year;

        System.out.print("Doğum yılınızı girin: ");
            year = inp.nextInt();
        year = year % 12;

        switch (year){
            case 0:
                System.out.println("Çin zodyağı burcunuz: Maymun");
                break;

            case 1:
                System.out.println("Çin zodyağı burcunuz: Horoz");
                break;

            case 2:
                System.out.println("Çin zodyağı burcunuz: Kopek");
                break;

            case 3:
                System.out.println("Çin zodyağı burcunuz: Domuz");
                break;

            case 4:
                System.out.println("Çin zodyağı burcunuz: Fare");
                break;

            case 5:
                System.out.println("Çin zodyağı burcunuz: Öküz");
                break;

            case 6:
                System.out.println("Çin zodyağı burcunuz: Kaplan");
                break;

            case 7:
                System.out.println("Çin zodyağı burcunuz: Tavşan");
                break;

            case 8:
                System.out.println("Çin zodyağı burcunuz: Ejderha");
                break;

            case 9:
                System.out.println("Çin zodyağı burcunuz: Yılan");
                break;

            case 10:
                System.out.println("Çin zodyağı burcunuz: At");
                break;

            case 11:
                System.out.println("Çin zodyağı burcunuz: Koyun");
                break;
        }
    }
}
