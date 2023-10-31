import java.util.Scanner;
public class plane_ticket_price {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int km,age,ticketType;
        double payment1,payment2,payment3,payment4,payTot,ticketPrice=0.10;


        System.out.print("Gideceğiniz Mesafeyi girin (KM cinsinden): ");
        km = inp.nextInt();

        System.out.print("Yaşınızı Girin: ");
        age = inp.nextInt();


        System.out.print("Bilet tipinizi Girin:\n 1) Tek yön 2) Gidiş-Geliş yön: ");
        ticketType = inp.nextInt();

        if (km < 0 || age < 0 || ticketType > 2 || ticketType < 0){
            System.out.println("Hatalı Bilgi Girdiniz!");
        }

        switch (ticketType) {
            case 1:
                // between 65,24
                if (age >= 24 && age <= 65) {
                    payment1 = km * ticketPrice;
                    System.out.println("Tek yön Bilet fiyatınız: " + payment1 + "TL");
                }
                // younger than 12
                else if (age <= 12) {
                    payment2 = km * ticketPrice;
                    payment2 *= 0.5;
                    System.out.println("Tek yön Bilet fiyatınız: " + payment2 + "TL");
                }
                // between 24 12
                else if (age < 24 && 12 < age) {
                    payment3 = km * ticketPrice;
                    payment3 = payment3 - ((payment3 * 10) / 100);
                    System.out.println("Tek yön Bilet fiyatınız: " + payment3 + "TL");
                }
                // bigger than 65
                else {
                    payment4 = km * ticketPrice;
                    payment4 *= 0.3;
                    System.out.println("Tek yön Bilet fiyatınız: " + payment4 + "TL");
                }
                break;
            case 2:
                if (age >= 24 && age <= 65) {
                    payTot = (km * ticketPrice) * 2;
                    payment1 = payTot - (payTot * 0.2);
                    System.out.println("Çift yön Bilet fiyatınız: " + payment1 + "TL");
                }
                else if (age <= 12) {
                    payment2 = (km * ticketPrice);
                    payment2 *= 0.5;
                    payTot = payment2 + payment2;
                    payment2 = payTot - (payTot * 0.2);
                    System.out.println("Çift yön Bilet fiyatınız: " + payment2 + "TL");
                }
                else if (age < 24 && 12 < age) {
                    payment3 = km * ticketPrice;
                    payment3 = payment3 - ((payment3 * 10) / 100);
                    payTot = payment3 + payment3;
                    payment3 = payTot - (payTot * 0.2);
                    System.out.println("Çift bilet fiyatınız: " + payment3 + "TL");
                }
                else {
                    payment4 = km * ticketPrice;
                    payment4 *= 0.3;
                    payTot = payment4 + payment4;
                    payment4 = payTot - (payTot * 0.2);
                    System.out.println("Çift yön Bilet fiyatınız: " + payment4 + "TL");
                }
                break;
        }
    }
}
