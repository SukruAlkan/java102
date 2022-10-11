public class Patika {

    public static void main(String[] args) {
        Calisan c1 = new Calisan("Mustafa Çetindağ", "05551112233", "info@patika.dev");
        //c1.giris();
        Akademisyen a1 = new Akademisyen("Patika Dev", "01112223344", "patika.dev", "CENG", "Doçent");
        //Akademisyen Calisan sınıfına ait nitelik ve metotlara erişebilir
        //a1.cikis();
        //a1.derseGir();
        Memur m1 = new Memur("Ali Veli", "02223334455", "a@patika.dev", "Bilgi İşlem", "09:00-19:00");
        //Memur Calisan sınıfına ait nitelik ve metotlara erişebilir
        //m1.calis();
        OgretimGorevlisi o1 = new OgretimGorevlisi("Mahmut Çetindağ", "0", "mahmut@patika.dev", "CENG", "Doçent", "110");
        //OgretimGorevlisi hem Akademisyen hem de Calisan sınıflarına ait nitelik ve metotlara erişebilir
        //o1.giris();

    }
}
