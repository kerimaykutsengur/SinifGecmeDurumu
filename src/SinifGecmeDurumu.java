import java.util.Scanner;

public class SinifGecmeDurumu {
    public static void main(String[] args) {
        int mat, fzk, tur, kmy, muz, dersSayi = 0;

        int dersTtl;
        double average;

        Scanner input = new Scanner(System.in);
        System.out.print("Matematik Notunuz:");
        mat = input.nextInt();
        if ((mat > 0) && (mat < 101)) {
            dersSayi++;
        } else {
            System.out.println("Hatalı Değer Girdiniz! Bu Ders Ortalamaya Dahil Edilmeyecektir.");
            mat = 0;

        }

        System.out.print("Fizik Notunuz:");
        fzk = input.nextInt();
        if ((fzk > 0) && (fzk < 101)) {
            dersSayi++;
        } else {
            System.out.println("Hatalı Değer Girdiniz! Bu Ders Ortalamaya Dahil Edilmeyecektir.");
            fzk = 0;

        }

        System.out.print("Türkçe Notunuz:");
        tur = input.nextInt();
        if ((tur > 0) && (tur < 101)) {
            dersSayi++;
        } else {
            System.out.println("Hatalı Değer Girdiniz! Bu Ders Ortalamaya Dahil Edilmeyecektir.");
            tur = 0;

        }

        System.out.print("Kimya notunuz:");
        kmy = input.nextInt();
        if ((kmy > 0) && (kmy < 101)) {
            dersSayi++;
        } else {
            System.out.println("Hatalı Değer Girdiniz! Bu Ders Ortalamaya Dahil Edilmeyecektir.");
            kmy = 0;

        }

        System.out.print("Müzik Notunuz:");
        muz = input.nextInt();
        if ((muz > 0) && (muz < 101)) {
            dersSayi++;
        } else {
            System.out.println("Hatalı Değer Girdiniz! Bu Ders Ortalamaya Dahil Edilmeyecektir.");
            muz = 0 ;

        }
        dersTtl = dersSayi;

        average = (mat + fzk + tur + kmy + muz) / dersTtl;
        if (average >= 55) {
            System.out.println("Tebrikler Geçtiniz");
        } else {
            System.out.println("Üzgünüz Geçemediniz");
        }
        System.out.println("Ortalamanız:" + average);

    }
}
