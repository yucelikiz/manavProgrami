import javax.sound.sampled.Line;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //Değişkenler
        double a=2.14,e=3.67,d=1.11,m=0.95,p=5.0;
        int Armut, Elma, Domates, Muz, Patl;

        //Scanner
        Scanner input= new Scanner(System.in);

        //Veri al
        System.out.print( "Armut Kaç kilo ? :");
        Armut = input.nextInt();
        System.out.print("Elma kaç kilo ? :");
        Elma = input.nextInt();
        System.out.print("Domates kaç kilo ? :");
        Domates = input.nextInt();
        System.out.print("Muz kaç kilo ? :");
        Muz = input.nextInt();
        System.out.print("Patlıcan kaç kilo ? :");
        Patl = input.nextInt();

        //Toplam hesap
        double toplam = (Armut*a)+(Elma*e)+(Domates*d)+(Muz*m)+(Patl*p);
        System.out.print("Toplam Tutar : "+toplam+" TL");


    }
}