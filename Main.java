import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Fizik notunuz nedir: ");
        int fizik = scanner.nextInt();

        System.out.println("Matematik notunuz nedir: ");
        int mat = scanner.nextInt();

        System.out.println("Kimya notunuz nedir: ");
        int kimya = scanner.nextInt();

        System.out.println("Tarih notunuz nedir: ");
        int tarih = scanner.nextInt();

        System.out.println("Türkçe notunuz nedir: ");
        int turkce = scanner.nextInt();

        System.out.println("Müzik notunuz nedir: ");
        int muzik = scanner.nextInt();

        int topla = fizik+mat+kimya+tarih+turkce+muzik;
        double sonuc = topla / 6.0;


        System.out.println("Ortalamanız: "+sonuc);

        String sinifDurumu = (sonuc >= 60) ? "Sınıfı Geçti" : "Sınıfta Kaldı";
        System.out.println(sinifDurumu);




    }
}