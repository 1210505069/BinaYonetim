import java.util.ArrayList;
import java.util.List;

// EvSahibi sınıfı, ev sahibi özelliklerini temsil eder.
public class EvSahibi {
    private String evSahibiAdı; // Ev sahibi adı
    private String evSahibiAdresi; // Ev sahibi adresi
    private List<Bina> sahipOlduğuBinalar; // Ev sahibinin sahip olduğu binaların listesi

    // EvSahibi sınıfının yapıcı metodu
    public EvSahibi(String ad, String adres) {
        this.evSahibiAdı = ad;
        this.evSahibiAdresi = adres;
        sahipOlduğuBinalar = new ArrayList<>();
    }

    // Ev Sahibi ve sahip olduğu binaların bilgilerini gösteren metod
    public void bilgileriGöster() {
        System.out.println("Ev Sahibi Adı: " + evSahibiAdı);
        System.out.println("Ev Sahibi Adresi: " + evSahibiAdresi);
        for (Bina bina : sahipOlduğuBinalar) {
            bina.bilgileriGöster();
        }
    }

    // Ev Sahibi'ne yeni bina eklemek için metod
    public void binaEkle(Bina bina) {
        sahipOlduğuBinalar.add(bina);
    }
}
