import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        int mont, day;

        Scanner inp = new Scanner(System.in);

        System.out.println("Doğduğunuz Ay'ı (Sayı) cinsinden Giriniz : ");
        mont = inp.nextInt();

        System.out.println("Doğduğunuz Günü (Sayı) Cinsinden Giriniz : ");
        day = inp.nextInt();

        if ((mont == 1 && 22 <= day && day <= 31) || (mont == 2 && 1 <= day && day <= 19)) {
            System.out.println("Burcunuz Kova");
        } else if (day >= 32) {
            System.out.println("Lütfen Geçerli bir Tarih Giriniz!!");
        }
        if ((mont == 2 && 20 <= day && day <= 28) || (mont == 3 && 2 <= day && day <= 20)) {
            System.out.println("Burcunuz Balık");
        } else if (day >= 32) {
            System.out.println("Lütfen Geçerli bir Tarih Giriniz!!");
        }
        if ((mont == 3 && 21 <= day && day <= 31) || (mont == 4 && 3 <= day && day <= 20)) {
            System.out.println("Burcunuz Koç");
        } else if (day >= 32) {
            System.out.println("Lütfen Geçerli bir Tarih Giriniz!!");
        }
        if ((mont == 4 && 20 <= day && day <= 30) || (mont == 5 && 4 <= day && day <= 21)) {
            System.out.println("Burcunuz Boğa");
        } else if (day >= 32) {
            System.out.println("Lütfen Geçerli bir Tarih Giriniz!!");
        }
        if ((mont == 5 && 22 <= day && day <= 31) || (mont == 6 && 5 <= day && day <= 22)) {
            System.out.println("Burcunuz İkizler");
        } else if (day >= 32) {
            System.out.println("Lütfen Geçerli bir Tarih Giriniz!!");
        }
        if ((mont == 6 && 23 <= day && day <= 30) || (mont == 7 && 6 <= day && day <= 22)) {
            System.out.println("Burcunuz Yengeç");
        } else if (day >= 32) {
            System.out.println("Lütfen Geçerli bir Tarih Giriniz!!");
        }
        if ((mont == 7 && 23 <= day && day <= 31) || (mont == 8 && 7 <= day && day <= 22)) {
            System.out.println("Burcunuz Aslan");
        } else if (day >= 32) {
            System.out.println("Lütfen Geçerli bir Tarih Giriniz!!");
        }
        if ((mont == 8 && 23 <= day && day <= 31) || (mont == 9 && 8 <= day && day <= 22)) {
            System.out.println("Burcunuz Başak");
        } else if (day >= 32) {
            System.out.println("Lütfen Geçerli bir Tarih Giriniz!!");
        }
        if ((mont == 9 && 23 <= day && day <= 30) || (mont == 10 && 9 <= day && day <= 22)) {
            System.out.println("Burcunuz Terazi");
        } else if (day >= 32) {
            System.out.println("Lütfen Geçerli bir Tarih Giriniz!!");
        }
        if ((mont == 10 && 23 <= day && day <= 31) || (mont == 11 && 10 <= day && day <= 21)) {
            System.out.println("Burcunuz Akrep");
        } else if (day >= 32) {
            System.out.println("Lütfen Geçerli bir Tarih Giriniz!!");
        }
        if ((mont == 11 && 22 <= day && day <= 30) || (mont == 11 && 10 <= day && day <= 21)) {
            System.out.println("Burcunuz Yay");
        } else if (day >= 32) {
            System.out.println("Lütfen Geçerli bir Tarih Giriniz!!");
        }
        if ((mont == 12 && 22 <= day && day <= 30) || (mont == 12 && 1 <= day && day <= 21)) {
            System.out.println("Burcunuz Oğlak");
        } else if (day >= 32) {
            System.out.println("Lütfen Geçerli bir Tarih Giriniz!!");
        }
    }

    }




