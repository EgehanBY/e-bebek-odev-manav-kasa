import java.util.Scanner;
public class ManavKasa {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        double armut=2.14,elma=3.67,domates=1.11,muz=0.95,patlican=5.00;
        double armutKg,elmaKg,domatesKg,muzKg,patlicanKg,tutar;
        System.out.print("Armut kg giriniz : ");
        armutKg=sc.nextDouble();
        System.out.print("Elma kg giriniz : ");
        elmaKg=sc.nextDouble();
        System.out.print("Domates kg giriniz : ");
        domatesKg=sc.nextDouble();
        System.out.print("Muz kg giriniz : ");
        muzKg=sc.nextDouble();
        System.out.print("Patlıcan kg giriniz : ");
        patlicanKg=sc.nextDouble();

        tutar=(armutKg*armut)+(elmaKg*elma)+(domatesKg*domates)+(muzKg*muz)+(patlicanKg*patlican);
        System.out.print("Toplam tutar : " + tutar    );

    }
}
