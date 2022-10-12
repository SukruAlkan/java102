package inter;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Tutar gir: ");
        double price = scanner.nextDouble();
        System.out.print("Kart no gir: ");
        String cardNumber = scanner.next();
        System.out.print("Son kullanım tarihi gir: ");
        String expiryDate = scanner.next();
        System.out.print("Güvenlik kodu gir: ");
        String cvc = scanner.next();

        System.out.println("1. A Bankası");
        System.out.println("2. B Bankası");
        System.out.println("3. C Bankası");
        System.out.println("Banka Seçiniz: ");
        int selectBank = scanner.nextInt();

        switch (selectBank) {
            case 1:
                ABankasi aBankasi = new ABankasi("A Bankası", "5454546454", "45443655414");
                aBankasi.connect("127.1.1.1");
                aBankasi.payment(price,cardNumber,expiryDate,cvc);
                break;
            case 2:
                BBankasi bBankasi = new BBankasi("B Bankası", "2131223123", "778189817823");
                bBankasi.conn("127.1.1.2");
                bBankasi.payment(price,cardNumber,expiryDate,cvc);
            default:
                System.out.println("Geçerli Banka Giriniz! ");

        }

    }
}
