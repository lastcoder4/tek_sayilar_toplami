import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int sum = 0;
        int sayi = 0;
        double ortalama;
        int adet = 0;

        while(sayi >= 0)
        {
            System.out.printf("lütfen sayi giriniz: ");
            sayi = inp.nextInt();
            if(sayi < 0)
                break;
            sum +=sayi;
            adet++;


        }
        ortalama = sum / adet;
        System.out.printf("Girdiğiniz sayilarin toplamı ve ortalamsı sırasıyla su sekildedir. Toplam : " + sum + "ortalama: " + ortalama);
    }
}