import java.util.Scanner;

public class TamBolunenlerOrnegi {
    //Java döngüler ile 0'dan girilen sayıya kadar olan sayılardan 3 ve 4'e tam bölünen sayıların ortalamasını hesaplayan programı yazınız.
    public static void main(String[] args) {
        int n, toplam = 0, sayi = 0;
        double average;
        Scanner inp = new Scanner(System.in);

        System.out.print("Bir Sayı Giriniz:");
        n = inp.nextInt();


        for (int i = 0; i <= n; i++) {
            if ((i % 12 == 0) && (i != 0)) {
                toplam += i;
                sayi++;
            }
        }


        average = (toplam / sayi);
        System.out.println("3'e ve 4'e Bölünen Sayıların Ortalaması:" + average);

    }
}


