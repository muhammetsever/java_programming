import java.awt.event.HierarchyBoundsAdapter;
import java.util.Scanner;
public class ebebek_practicum {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        String name,toString;
        int workH=-40,bonus,hireYear,workHours,year=2021;
        double tax,salary,riseSalary;

        System.out.print("Employees name: ");
        name = inp.nextLine();

        System.out.print("Emloyees hire year: ");
        hireYear = inp.nextInt();

        System.out.print("Employees work hours: ");
        workHours = inp.nextInt();

        System.out.print("Employees salary: ");
        salary = inp.nextDouble();

        tax = (salary > 1000) ? (salary*3)/100 : 0;

        System.out.println("work hour "+workHours);

       workHours += workH;

        bonus =(workHours > 0) ? (workHours*30) : 0;

        System.out.println(name+" hire year "+hireYear+" bonus payment "+bonus+" tax "+tax);

        if (year - hireYear < 10) { riseSalary =(salary*5)/100;
        } else if (20 > year - hireYear) { riseSalary =(salary*10)/100;
        } else if (9 < year-hireYear && year-hireYear <20 ) { riseSalary =(salary*10)/100;
        }  else  { riseSalary = (salary*15)/100;
        }

        toString=name+" hire year "+hireYear+" bonus payment "+bonus+" tax "+tax+" rise salary "+riseSalary+" total salary "+(riseSalary+salary+bonus-tax);

        System.out.println(toString);
        /*
        tax() : Maaşa uygulanan vergiyi hesaplayacaktır.
- Çalışanın maaşı 1000 TL'den az ise vergi uygulanmayacaktır.
- Çalışanın maaşı 1000 TL'den fazla ise maaşının %3'ü kadar
vergi uygulanacaktır.
- bonus() : Eğer çalışan haftada 40 saatten fazla çalışmış ise
fazladan çalıştığı her saat başına 30 TL olacak şekilde bonus
ücretleri hesaplayacaktır.
- raiseSalary() : Çalışanın işe başlangıç yılına göre maaş artışını
hesaplayacaktır. Şuan ki yılı 2021 olarak alın.
- Eğer çalışan 10 yıldan az bir süredir çalışıyorsa maaşına %5 zam
yapılacaktır.
- Eğer çalışan 9 yıldan fazla ve 20 yıldan az çalışıyorsa maaşına
%10 zam yapılacaktır
Eğer çalışan 19 yıldan fazla çalışıyorsa %15 zam yapılacaktır.
- toString() : Çalışana ait bilgileri ekrana bastıracaktır.

raiseSalary() hesaplarken vergi ve bonusları dikkate almalısınız.
- tax() fonksiyonu ile sadece salary’i uygulanan vergi
hesaplanacak
- Toplam maaş: çalışanın kendi maaşı+ bonus
- Vergi ve bonuslarla birlikte maaş için: vergi, bonus ve çalışanın
kendi maaşı ile bulunacak


















                                              */
    }
}
