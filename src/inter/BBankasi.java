package inter;

public class BBankasi implements IBanka{
    private String bankaAdi;
    private String terminalID;
    private String password;

    public BBankasi(String bankaAdi, String terminalID, String password) {
        this.bankaAdi = bankaAdi;
        this.terminalID = terminalID;
        this.password = password;
    }

    public void conn(String str) {
        System.out.println(this.getBankaAdi() + " Bağlandı !");
    }

    public void sendPayment(double price) {
        System.out.println("Bankadan cevap bekleniyor! ");
        System.out.println("İşlem başarılı oldu! ");
    }

    public String getBankaAdi() {
        return bankaAdi;
    }

    public void setBankaAdi(String bankaAdi) {
        this.bankaAdi = bankaAdi;
    }

    public String getTerminalID() {
        return terminalID;
    }

    public void setTerminalID(String terminalID) {
        this.terminalID = terminalID;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public boolean connect(String ipAddress) {
        System.out.println("Kullanıcı ip: " + ipAddress);
        System.out.println("Makine ip: " + this.hostIpAddress);
        System.out.println(this.getBankaAdi() + " Bağlandı !");
        return true;
    }

    @Override
    public boolean payment(double price, String cardNumber, String expiryDate, String cvc) {
        System.out.println("Bankadan cevap bekleniyor! ");
        System.out.println("İşlem başarılı oldu! ");
        return true;
    }
}
