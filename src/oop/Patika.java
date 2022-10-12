package oop;

public class Patika {

    public static void main(String[] args) {
        //oop.Calisan c1 = new oop.Calisan("Mustafa Çetindağ", "05551112233", "info@patika.dev");
        //c1.giris();
        //oop.Akademisyen a1 = new oop.Akademisyen("oop.Patika Dev", "01112223344", "patika.dev", "CENG", "Doçent");
        //oop.Akademisyen oop.Calisan sınıfına ait nitelik ve metotlara erişebilir
        //a1.cikis();
        //a1.derseGir();
        //oop.Memur m1 = new oop.Memur("Ali Veli", "02223334455", "a@patika.dev", "Bilgi İşlem", "09:00-19:00");
        //oop.Memur oop.Calisan sınıfına ait nitelik ve metotlara erişebilir
        //m1.calis();
        OgretimGorevlisi o1 = new OgretimGorevlisi("Mahmut Çetindağ", "0", "mahmut@patika.dev", "CENG", "Doçent", "110");
        //oop.OgretimGorevlisi hem oop.Akademisyen hem de oop.Calisan sınıflarına ait nitelik ve metotlara erişebilir
        //o1.giris();

        //method overloading - metotlarda aşırı yüklenme
        //o1.giris("10:00");
        //o1.giris("10:00", "18:00");

        //method overriding - metotlarda geçersiz kılma - geçersiz kılma
        //akademisyen metoduna giris metodu eklenirse calisan sınıfındaki giris metodu etkisiz kılınarak akademisyen metodunki giris metodu çağırıldı.
        //o1.giris();

        //oop.OgretimGorevlisi metoduna giris metodu eklenirse calisan sınıfındaki ve oop.Akademisyen sınıfındaki giris metodu
        //etkisiz kılınarak akademisyen metodunki giris metodu çağırıldı.
        //o1.giris();

        //Polimorphism (Çok Biçimlilik)

        //o1.giris();
        //a1.giris();
        //c1.giris();
        //m1.giris();

        //oop.Calisan a2 = new oop.Akademisyen("oop.Patika Dev", "01112223344", "patika.dev", "CENG", "Doçent");
        //a2.giris(); // Akademisyene ait giris metodunu çağırır Çünkü akademisyen üzerinden giris @Override edildiği için

        //oop.Akademisyen[] loginUser = {c1,a1,m1,o1}; //hata verir çünkü c1 ve m1 akademisyen sınıfının alt sınıfı değil
        //oop.Calisan[] loginUser = {c1,a1,m1,o1}; //hepsinin ata sınıfı aynı (oop.Calisan) olduğu için hata vermez
        //oop.Calisan.girisYapanlar(loginUser);

        //Abstraction (Soyutlama)
        //tekil sınıflar haricinde nesne üretilmesi anlamsız olan genel sınıfları kalıtım yapmak ve bir şablon oluşturmak için kullanırız.
        //Genel(Ana) sınıflar oluşturduğumuz Tekil(Ara) sınıfların karakteristik özelliklerini gösterir. İskelet görevi görür.
        //Yani bu çalışmada çalısan, akademisyen, memur sınıflarının üretilmesi saçmadır. Bu yüzden bunları abstract yaptık

        o1.derseGir("9:00");


    }
}
