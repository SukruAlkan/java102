public class Akademisyen extends Calisan {
    private String bolum;
    private String unvan;

    public Akademisyen(String adSoyad, String telefon, String eposta, String bolum, String unvan) {
        super(adSoyad, telefon, eposta);
        //üst sınıfın constuctor ına erişmek için super kullanılır.
        //eğer Calısan sınıfında bos constructor olsaydı hata almazdık dolayısıyla super kullanmaya gerek kalmazdı.

        this.bolum = bolum;
        this.unvan = unvan;
    }

    public String getBolum() {
        return bolum;
    }

    public void setBolum(String bolum) {
        this.bolum = bolum;
    }

    public String getUnvan() {
        return unvan;
    }

    public void setUnvan(String unvan) {
        this.unvan = unvan;
    }

    public void derseGir() {
        System.out.println(this.getAdSoyad() + " derse giris yaptı!");
    }

    @Override
    public void giris() {
        System.out.println(this.getAdSoyad() + " akademisyeni A kapısından giris yapti!");
    }

}
