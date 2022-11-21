import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
     //DEĞİŞKENLER
     int a,b,c;
     double alan;
     double cevreNet;
     double cevreTek;
     //GİRDİLER
        Scanner input = new Scanner(System.in);

        System.out.println("1. KENARI GİRİNİZ: ");
        a = input.nextInt();

        System.out.println("2 KENARI GİRİNİZ: ");
        b = input.nextInt();

        System.out.println("3. KENARI GİRİNİZ: ");
        c = input.nextInt();


        cevreTek = (a+b+c) / 2;
        alan = Math.sqrt(cevreTek * (cevreTek - a) * (cevreTek - b) * (cevreTek - c));

        System.out.println("ÜÇGENİN ALANI: " + alan);

    }
}