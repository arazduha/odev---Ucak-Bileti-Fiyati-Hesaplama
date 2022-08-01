import java.util.Scanner;
public class test3 {
    public static  void main (String[] args) {
        Scanner inp = new Scanner(System.in);
        int km,yas,sec;
        double kmbas=0.10;
        double nrmtutar, yasindr,indttr,tpl;

        System.out.print("Mesafeyi KM olarak giriniz: ");
        km = inp.nextInt();

        System.out.print("Yas giriniz: ");
        yas = inp.nextInt();
        if (yas>0){
            if (yas <= 1){
                System.out.println("Hatali deger girdiniz!");
            } else if ( yas>=1 && yas<=12) {
                System.out.print("1-tek yon 2- cift yon: ");
                sec = inp.nextInt();
                switch (sec){
                    case 1:
                        nrmtutar = km * kmbas;
                        yasindr = nrmtutar * 0.50;
                        indttr = nrmtutar - yasindr;
                        tpl = indttr;
                        System.out.print("Toplam Tutar = " +indttr);
                        break;
                    case 2:
                        nrmtutar = km * kmbas;
                        yasindr = nrmtutar * 0.50;
                        indttr = nrmtutar - yasindr;
                        tpl=indttr*0.20;
                        indttr = (indttr-tpl)*2;
                        System.out.print("Toplam Tutar = " +indttr);
                        break;
                    default:
                        System.out.println("Hatali veri girdiniz!");
                }
            } else if ((yas>13) && (yas<=24)) {
                System.out.print("1-tek yon 2- cift yon: ");
                sec=inp.nextInt();
                switch (sec){
                    case 1:
                        nrmtutar = km * kmbas;
                        yasindr = nrmtutar * 0.10;
                        indttr = nrmtutar - yasindr;
                        tpl=indttr;
                        System.out.print("Toplam Tutar = " +indttr);
                        break;
                    case 2:
                        nrmtutar = km * kmbas;
                        yasindr = nrmtutar * 0.10;
                        indttr = nrmtutar - yasindr;
                        tpl=indttr*0.20;
                        indttr = (indttr-tpl)*2;
                        System.out.print("Toplam Tutar = " +indttr);
                        break;
                    default:
                        System.out.println("Hatali veri girdiniz!");
                }
            } else if ((yas>=65)) {
                System.out.print("1-tek yon 2- cift yon: ");
                sec=inp.nextInt();
                switch (sec){
                    case 1:
                        nrmtutar = km * kmbas;
                        yasindr = nrmtutar * 0.30;
                        indttr = nrmtutar - yasindr;
                        tpl=indttr;
                        System.out.print("Toplam Tutar = " +indttr);
                        break;
                    case 2:
                        nrmtutar = km * kmbas;
                        yasindr = nrmtutar * 0.30;
                        indttr = nrmtutar - yasindr;
                        tpl=indttr*0.20;
                        indttr = (indttr-tpl)*2;
                        System.out.print("Toplam Tutar = " +indttr);
                        break;
                    default:
                        System.out.println("Hatali veri girdiniz!");
                }
            }

        } else {
            System.out.println("Hatali veri girdiniz!");
        }
    }
}




