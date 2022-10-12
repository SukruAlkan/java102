package inter;

public interface IBanka {
    final String hostIpAddress = "127.0.0.1";

    // interfacelerde değişken tanımlanmaz sadece final değerler belirlenebilir
    // erişim belirtecine gereksiz (zaten public olmak zorunda) çünkü gövdesi oluşturulan sınıf içinde belirlenmesi daha mantıklı
    boolean connect(String ipAddress);

    boolean payment(double price, String cardNumber, String expiryDate, String cvc);

}

// Bir sınıf birden fazla interface i implement edebilir